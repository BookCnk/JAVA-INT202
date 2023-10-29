package com.example.quiz.controller;


import com.example.quiz.model.Question;
import com.example.quiz.model.QuizSession;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet(name = "QuizController", value = "/QuizController")
public class QuizController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession(); // create session
        if (session == null || session.getAttribute("quizSession") == null) {
            QuizSession quizSession = new QuizSession(); //create form of question [question, currentIndex, score]
            quizSession.fetchQuestion();// fresh Data
            session.setAttribute("quizSession", quizSession); //save quiz session in quizSession
        }
        QuizSession quizSession = (QuizSession) session.getAttribute("quizSession");
        int currentQuestionIndex = quizSession.getCurrentQuestionIndex();
        Question question = quizSession.getQuestions().get(currentQuestionIndex);
        request.setAttribute("question", question); //set Value
        request.getRequestDispatcher("/quiz.jsp").forward(request, response); //send to jsp
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession(); //check session
        QuizSession quizSession = (QuizSession) session.getAttribute("quizSession"); // get Atb from quizSession
        if (request.getParameter("option") != null){
            int answer = Integer.parseInt(request.getParameter("option"));
            quizSession.checkCorrectQuestion(answer);
            quizSession.moveToNextQuestion();
        }
        else{
            request.setAttribute("errmsg", "pls Select Option");
            doGet(request, response);
        }
        if (quizSession.isQuizEnded()){
            int score = quizSession.getCorrectAnswersCount();
            request.setAttribute("score", score);
            request.getRequestDispatcher("/result.jsp").forward(request, response);
        }else {
            doGet(request, response);
        }
    }
}