package com.plcoding.cleanarchitecturenoteapp.features.domain.util

sealed class OrderType {
    object Ascending : OrderType()
    object Descending : OrderType()
}
