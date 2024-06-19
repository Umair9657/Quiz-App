package quizapp;

public class Main {
    public static void main(String[] args) {
        Quiz quiz = new Quiz();

        String[] options1 = {"Delhi", "Mumbai", "Rajasthan", "Goa"};
        quiz.addQuestion(new Question("What is the capital of India?", options1, 0));

        String[] options2 = {"Rohit Sharma", "Rishab Pant", "Virat", "Hardik"};
        quiz.addQuestion(new Question("Who Score 82 runs in T20 World cup Against Pak?", options2, 2));

        String[] options3 = {"3", "7", "5", "6"};
        quiz.addQuestion(new Question("How many continents are there?", options3, 1));

        quiz.start();
        
    }
}