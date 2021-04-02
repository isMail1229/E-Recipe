package id.asep.e_recipe.utils.extension

import android.view.View
import android.widget.ImageView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy


fun View.gone() {
    visibility = View.GONE
}

fun View.visible() {
    visibility = View.VISIBLE
}

fun View.invisible() {
    visibility = View.INVISIBLE
}

fun ImageView.setImagesToGlide(pathUrl: String) {
    Glide.with(this.context)
        .load(pathUrl)
        .diskCacheStrategy(DiskCacheStrategy.DATA)
        .into(this)
}

fun ImageView.setImagesToGlide(pathDrawable: Int) {
    Glide.with(this.context)
        .load(pathDrawable)
        .diskCacheStrategy(DiskCacheStrategy.DATA)
        .into(this)
}