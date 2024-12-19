package com.example.ezquiz.navigation

sealed class Screen(val route: String) {
    data object QuizListScreen: Screen("quiz_list_screen")
}