package com.example.roomdbdemo.domain.utils

sealed class OrderType {
    object Ascending : OrderType()
    object Descending : OrderType()
}