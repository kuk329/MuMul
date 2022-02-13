package com.example.mumulcom.search

import com.google.gson.annotations.SerializedName

data class ConceptQuestionResponse(
    @SerializedName("isSuccess") val isSuccess: Boolean,
    @SerializedName("code") val code:Int,
    @SerializedName("message") val message:String,
    @SerializedName("result") val result: ArrayList<ConceptQuestion>?
)