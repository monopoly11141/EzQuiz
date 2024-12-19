package com.example.ezquiz.feature_quiz.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.onStart
import kotlinx.coroutines.flow.stateIn
import javax.inject.Inject

@HiltViewModel
class QuizViewModel @Inject constructor(

): ViewModel() {
    private val _state = MutableStateFlow(
        QuizListState()
    )
    val state = _state
        .stateIn(
            viewModelScope,
            SharingStarted.WhileSubscribed(5000L),
            QuizListState()
        )

    fun onAction(action: QuizAction) {
        when(action) {
            else -> {}
        }
    }
}