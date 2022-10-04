package com.example.birdwatcher.model

data class User (
    val userId: Int? = null,
    var userName: String,
    var userList: MutableList<Listing>
)