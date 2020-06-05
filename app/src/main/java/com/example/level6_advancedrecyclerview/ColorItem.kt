package com.example.level6_advancedrecyclerview

class ColorItem (
    var hex: String,
    var name: String
)
{
    /*
    * We are using http://www.singlecolorimage.com/ to generate image urls of the specified hex
    * color. The method getImageUrl returns an image url of the hex color in 1080x1080 format.
    * */
    fun getImageUrl() = "http://singlecolorimage.com/get/$hex/1080x1080"

}


