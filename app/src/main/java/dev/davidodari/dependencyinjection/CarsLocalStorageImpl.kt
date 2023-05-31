package dev.davidodari.dependencyinjection

import javax.inject.Inject

class CarsLocalStorageImpl @Inject constructor(val roomDao: RoomDao) :CarsLocalStorage {
    override fun getCars(): List<Car> {
        TODO("Not yet implemented")
    }
}
