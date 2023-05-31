package dev.davidodari.dependencyinjection

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
abstract class CarDataModule {

    @Binds
    abstract fun bindsCarsRepository(carsRepositoryImpl: CarsRepositoryImpl): CarsRepository

    @Binds
    abstract fun bindsCarsRepository(carsLocalStorage: CarsLocalStorageImpl): CarsLocalStorage


}
