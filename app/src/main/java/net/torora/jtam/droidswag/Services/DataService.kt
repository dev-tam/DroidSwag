package net.torora.jtam.droidswag.Services

import net.torora.jtam.droidswag.Model.Category
import net.torora.jtam.droidswag.Model.Product

/**
 * Created by jtam on 12/8/17.
 */
object DataService {
    val categories = listOf(
            Category("SHIRTS","shirtimage"),
            Category("HOODIES","hoodieimage"),
            Category("HATS","hatimage"),
            Category("DIGITAL","digitalgoodsimage")
    )
    val hats = listOf(
            Product("Droidslopes Graphic Beanie","$18","hat01"),
            Product("Droidslopes Hat Black","$28","hat02"),
            Product("Droidslopes Hat Black","$22","hat03"),
            Product("Droidslopes Hat Snapback","$19","hat04")
    )
    val hoodies = listOf(
            Product("Droidslopes Hoodie Gray","$43","hoodie01"),
            Product("Droidslopes Hoodie Red","$34","hoodie02"),
            Product("Droidslopes Hoodie Blue","$40","hoodie03"),
            Product("Droidslopes Hoodie Green","$35","hoodie04")
    )
    val shirts = listOf(
            Product("Droidslopes Shirt Gray","$53","shirt01"),
            Product("Droidslopes Shirt Red","$54","shirt02"),
            Product("Droidslopes Shirt Blue","$64","shirt03"),
            Product("Droidslopes Shirt Green","$75","shirt04"),
            Product("Kickflip Studios","$18","shirt05")
    )

}