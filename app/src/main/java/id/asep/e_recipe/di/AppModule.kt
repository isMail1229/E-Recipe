package id.asep.e_recipe.di

import android.content.Context
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.android.qualifiers.ApplicationContext
import id.asep.e_recipe.BuildConfig
import id.asep.e_recipe.MainApplication
import id.asep.e_recipe.utils.helper.Constants
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import javax.inject.Singleton


@Module
@InstallIn(ActivityComponent::class)
object AppModule {

    @Singleton
    @Provides
    fun providesApplication(@ApplicationContext context: Context): MainApplication {
        return context as MainApplication
    }


    @Provides
    fun provideBaseUrl() = Constants.BASEURL

    @Singleton
    @Provides
    fun provideOkHttpClient() = if (BuildConfig.DEBUG) {
        val loggingInterceptor = HttpLoggingInterceptor()
        loggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY)
        OkHttpClient.Builder()
                .addInterceptor(loggingInterceptor)
                .build()
    } else {
        OkHttpClient
                .Builder()
                .build()
    }

    @Singleton
    @Provides
    fun provideRetrofit(okHttpClient: OkHttpClient, BASE_URL: String): Retrofit = Retrofit.Builder()
            .addConverterFactory(MoshiConverterFactory.create())
            .baseUrl(BASE_URL)
            .client(okHttpClient)
            .build()

}