package com.catfacts.Models.NasaImagesAndVieoJson

data class Item(
    val `data`: List<Data>,
    val href: String,
    val links: List<Link>
)