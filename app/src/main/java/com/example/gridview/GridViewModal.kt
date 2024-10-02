package com.example.gridview



class GridViewModal(
    val name: String,
    val image: Int,
    val site: String
) {
    companion object {
        val list = mutableListOf(
            GridViewModal("Яндекс", R.drawable.yandex_pic, "http://www.yandex.ru"),
            GridViewModal("Google", R.drawable.google_pic, "http://google.com"),
            GridViewModal("Urban University", R.drawable.urban_pic, "http://urban-university.ru"),
            GridViewModal("Kotlin Lang", R.drawable.kotlin_pic, "http://kotlinlang.org"),
            GridViewModal("GitHub", R.drawable.github_pic, "http://github.com")
        )
    }
}