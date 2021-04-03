package id.asep.e_recipe.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import id.asep.e_recipe.datasource.repository.RecipeRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(
        private val recipeRepository: RecipeRepository
) : ViewModel() {

    fun getRecipeNew() {
        viewModelScope.launch(Dispatchers.IO) {
            recipeRepository.getNewRecipe()
        }
    }
}