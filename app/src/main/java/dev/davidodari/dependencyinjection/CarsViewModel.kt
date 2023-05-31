package dev.davidodari.dependencyinjection

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class CarsViewModel @Inject constructor(private val carsRepository: CarsRepository) : ViewModel() {
    fun getCars(): List<Car> {
        return carsRepository.getCars()
    }

}
