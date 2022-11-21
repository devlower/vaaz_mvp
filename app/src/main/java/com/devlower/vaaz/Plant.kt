package com.devlower.vaaz

import java.io.Serializable

data class Plant(val name: String, val sciName: String, val description: String, val linkImg: String, val temperature: Double, val humidity: Double): Serializable