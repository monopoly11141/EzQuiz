package com.example.ezquiz.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.ezquiz.feature_quiz.presentation.QuizListScreenRoot

@Composable
fun Navigation(
    navHostController: NavHostController
) {
    NavHost(
        navController = navHostController,
        startDestination = Screen.QuizListScreen.route
    ) {
        composable(Screen.QuizListScreen.route){
            QuizListScreenRoot(
                navController = navHostController
            )
        }
    }
}