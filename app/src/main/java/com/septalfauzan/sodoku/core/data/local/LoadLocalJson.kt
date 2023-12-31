package com.septalfauzan.sodoku.core.data.local

import android.content.Context
import com.google.gson.Gson
import com.septalfauzan.sodoku.R
import com.septalfauzan.sodoku.core.data.local.entity.BoardResponse

object LoadLocalJson {
    fun getBoard(jsonStr: String): BoardResponse {
        try {
            val gson = Gson()
            return gson.fromJson(jsonStr, BoardResponse::class.java)
        }catch (e: Exception){
            throw e
        }
    }
}