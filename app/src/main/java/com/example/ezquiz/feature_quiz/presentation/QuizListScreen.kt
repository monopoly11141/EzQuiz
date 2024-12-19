package com.example.ezquiz.feature_quiz.presentation

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewLightDark
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.navigation.NavController
import com.example.ezquiz.ui.theme.EzQuizTheme
import kotlinx.coroutines.flow.Flow

@Composable
fun QuizListScreenRoot(
    modifier: Modifier = Modifier,
    navController: NavController,
    viewModel: QuizViewModel = hiltViewModel()
) {
    QuizListScreen(
        modifier = modifier,
        state = viewModel.state.collectAsStateWithLifecycle().value,
        onAction = { action ->
            viewModel.onAction(action)
        }
    )
}

@Composable
fun QuizListScreen(
    modifier : Modifier = Modifier,
    state: QuizListState = QuizListState(),
    onAction: (QuizAction) -> Unit = {}
) {
    Scaffold(
        modifier = modifier
    ) { paddingValues ->
        Column(
            modifier = modifier
                .padding(paddingValues)
        ) {
            Text(
                text = "Hello Quiz List Screen"
            )
        }
    }
}

@PreviewLightDark
@Composable
private fun QuizListScreenPreview() {
    EzQuizTheme {
        QuizListScreen()
    }
}