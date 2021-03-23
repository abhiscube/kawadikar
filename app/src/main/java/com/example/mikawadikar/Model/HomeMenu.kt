package com.example.mikawadikar.Model

data class Menu(var title: String)
object MenuHome {

    val menu = listOf<Menu>(Menu("Map"),
        Menu("General"),
        Menu("General 1"),
        Menu("General 2"),
        Menu("General 3"),
        Menu("General 4"))

}