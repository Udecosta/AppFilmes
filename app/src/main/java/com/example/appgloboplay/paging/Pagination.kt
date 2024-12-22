package com.example.appgloboplay.paging

interface Pagination<Key, Item> {
    suspend fun loadNextPage()
    fun reset()
}