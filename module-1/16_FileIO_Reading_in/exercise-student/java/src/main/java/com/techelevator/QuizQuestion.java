package com.techelevator;

public class QuizQuestion {
    private String question;
    private String[] answers;
    private String correctAnswer;

    public QuizQuestion(String line) {
        if ((line != null) && (!line.isEmpty())) {
            String[] parts = line.split("\\|");
            this.question = parts[0];
            answers = new String[parts.length-1];
            for(int i = 1; i < parts.length; i++) {
                String answer = parts[i].trim();
                if (answer.endsWith("*")) {
                    answer = answer.substring(0, answer.length() - 1);    // Pull-off trailing "*" character
                    this.correctAnswer = Integer.toString(i);
                }
                answers[i - 1] = answer;
            }
        }
    }
    public String getQuestion() {
        return this.question;
    }
    public String[] getAnswers() {
        return this.answers.clone();
    }
    public boolean isCorrectAnswer(String selectedAnswer){
        return this.correctAnswer.equals(selectedAnswer);
    }
}
