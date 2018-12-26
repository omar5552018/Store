package com.example.omaralsaedi.store.Services

import com.example.omaralsaedi.store.Model.Category
import com.example.omaralsaedi.store.Model.Product

object DataService {
    val categories = listOf(
        Category("SHIRTES", "shirtimage"),
        Category("HOODIES", "hoodieimage"),
        Category("HATS", "hatimage")
    )

    val hats = listOf(
        Product("Juventus Black hat", "hat", "12$"),
        Product("adidas Black hat", "hat1", "10$"),
        Product("adidas Blue hat", "hat2", "15$"),
        Product("adidas Gray hat", "hat3", "20$")
    )

    val hoodies = listOf(
        Product("Real Madrid White hoodie", "hoodie", "20$"),
        Product("Real Madrid Gray hoodie", "hoodie1", "22$"),
        Product("adidas white hoodie", "hoodie2", "25$"),
        Product("Juventus Black hoodie", "hoodie3", "18$")
    )

    val shirts = listOf(
        Product("Real Madrid White Shirt", "shirt", "23$"),
        Product("Real Madrid Black Shirt", "shirt1", "29$"),
        Product("Real Madrid Blue Shirt", "shirt2", "27$"),
        Product("Real Madrid Red Shirt", "shirt3", "28$"),
        Product("Real Madrid Gray Shirt", "shirt4", "30$")
    )
}