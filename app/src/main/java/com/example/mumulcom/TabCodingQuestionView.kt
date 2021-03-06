package com.example.mumulcom

import com.example.mumulcom.Question

interface TabCodingQuestionView {
    fun onGetCodingQuestionsLoading()
    fun onGetCodingQuestionsSuccess(result: ArrayList<Question>?)
    fun onGetCodingQuestionsFailure(code:Int, message:String)
}