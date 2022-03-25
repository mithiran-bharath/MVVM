package com.example.mvvmapplication.userlist.data.fakedatasource

import com.example.mvvmapplication.userlist.domain.model.User
import kotlin.random.Random

object FakeDataSource {
    val imageUrl = listOf(
        "https://developers.google.com/speed/webp/gallery/1.jpg",
        "https://www.gstatic.com/webp/gallery/5.jpg",
        "https://www.gstatic.com/webp/gallery/5.webp",
        "https://www.gstatic.com/webp/gallery/2.webp",
        "https://www.gstatic.com/webp/gallery/3.webp",
        "https://www.gstatic.com/webp/gallery/4.webp",
    )

    val list = listOf(
        User(
            "Bharath",
            "Murugesan",
            "AndroidDeveloper",
            "bharath@gmail.com",
            profile = imageUrl[Random.nextInt(6)]
        ),
        User(
            "Bharath", "Murugesan", "AndroidDeveloper", "bharath@gmail.com",
            profile = imageUrl[Random.nextInt(6)]
        ),
        User(
            "Bharath", "Murugesan", "AndroidDeveloper", "bharath@gmail.com",
            profile = imageUrl[Random.nextInt(6)]
        ),
        User(
            "Bharath", "Murugesan", "AndroidDeveloper", "bharath@gmail.com",
            profile = imageUrl[Random.nextInt(6)]
        ),
        User(
            "Bharath", "Murugesan", "AndroidDeveloper", "bharath@gmail.com",
            profile = imageUrl[Random.nextInt(6)]
        ),
        User(
            "Bharath", "Murugesan", "AndroidDeveloper", "bharath@gmail.com",
            profile = imageUrl[Random.nextInt(6)]
        ),
        User(
            "Bharath", "Murugesan", "AndroidDeveloper", "bharath@gmail.com",
            profile = imageUrl[Random.nextInt(6)]
        ),
        User(
            "Bharath", "Murugesan", "AndroidDeveloper", "bharath@gmail.com",
            profile = imageUrl[Random.nextInt(6)]
        ),
        User(
            "Bharath", "Murugesan", "AndroidDeveloper", "bharath@gmail.com",
            profile = imageUrl[Random.nextInt(6)]
        ),
        User(
            "Bharath", "Murugesan", "AndroidDeveloper", "bharath@gmail.com",
            profile = imageUrl[Random.nextInt(6)]
        ),
        User(
            "Bharath", "Murugesan", "AndroidDeveloper", "bharath@gmail.com",
            profile = imageUrl[Random.nextInt(6)]
        ),
        User(
            "Bharath", "Murugesan", "AndroidDeveloper", "bharath@gmail.com",
            profile = imageUrl[Random.nextInt(6)]
        ),
        User(
            "Bharath", "Murugesan", "AndroidDeveloper", "bharath@gmail.com",
            profile = imageUrl[Random.nextInt(6)]
        ),
        User(
            "Bharath", "Murugesan", "AndroidDeveloper", "bharath@gmail.com",
            profile = imageUrl[Random.nextInt(6)]
        ),
        User(
            "Bharath", "Murugesan", "AndroidDeveloper", "bharath@gmail.com",
            profile = imageUrl[Random.nextInt(6)]
        ),
    )


}