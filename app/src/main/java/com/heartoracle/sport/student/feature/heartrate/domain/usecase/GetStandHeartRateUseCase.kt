package com.heartoracle.sport.student.feature.heartrate.domain.usecase

import com.heartoracle.sport.student.feature.heartrate.data.repository.HeartRateRepository
import io.reactivex.Single
import io.reactivex.android.schedulers.AndroidSchedulers
import javax.inject.Inject

interface GetStandHeartRateUseCase {
    fun getSitHeartRate(): Single<Int>
}

class GetStandHeartRateUseCaseImpl @Inject constructor(private val repository: HeartRateRepository) :
    GetStandHeartRateUseCase {

    override fun getSitHeartRate(): Single<Int> =
        repository.getStandHeartRate().observeOn(AndroidSchedulers.mainThread())

}