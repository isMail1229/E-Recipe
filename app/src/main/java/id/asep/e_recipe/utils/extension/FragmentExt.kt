package id.asep.e_recipe.utils.extension

import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.google.android.material.snackbar.Snackbar

inline fun <reified VM : ViewModel> Fragment.fragmentViewModel() =
    ViewModelProvider(requireActivity()).get(VM::class.java)

fun Fragment.toastShort(text: String) {
    Toast.makeText(requireContext(), text, Toast.LENGTH_SHORT).show()
}

fun Fragment.toastLong(text: String) {
    Toast.makeText(requireContext(), text, Toast.LENGTH_LONG).show()
}

fun Fragment.snackbar(text: String) {
    Snackbar.make(
        requireView(),
        text,
        Snackbar.LENGTH_LONG
    ).show()
}