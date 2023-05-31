package dev.davidodari.dependencyinjection

import javax.inject.Inject

class CarsRepositoryImpl @Inject constructor(
    private val carsService: CarsService,
    private val localStorage: CarsLocalStorage
) : CarsRepository {

    override fun getCars(): List<Car> {
        localStorage.getCars()
        carsService.fetchCars()
        return emptyList()
    }
}
