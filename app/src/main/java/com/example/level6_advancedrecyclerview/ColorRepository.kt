package com.example.level6_advancedrecyclerview

/*
* The ColorRepository will be used for generating a list of predefined ColorItems using the
* method getColorItems.
* */
class ColorRepository {
    fun getColorItems(): List<ColorItem> {
        return arrayListOf(
            ColorItem("000000", "Black"),
            ColorItem("FF0000", "Red"),
            ColorItem("0000FF", "Blue"),
            ColorItem("FFFF00", "Yellow"),
            ColorItem("008000", "Green")
        )
    }
}