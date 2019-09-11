package com.heartoracle.sport.student.feature.settings.data.repository.dagger

import com.heartoracle.sport.student.feature.settings.data.repository.NumberRepository
import com.heartoracle.sport.student.feature.settings.data.repository.NumberRepositoryImpl
import com.heartoracle.sport.student.feature.settings.data.datasource.NumberDataSource
import com.heartoracle.sport.student.feature.settings.data.datasource.dagger.NumberDataSourceModule
import dagger.Module
import dagger.Provides

@Module(includes = [NumberDataSourceModule::class])
class NumberRepositoryModule {

    @Provides
    fun provideRepository(numberDataSource: NumberDataSource): NumberRepository =
        NumberRepositoryImpl(numberDataSource)
}