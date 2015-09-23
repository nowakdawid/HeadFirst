package _483;

public class QuizCard {

    private String question = "";
    private String answer = "";

    public QuizCard(String q, String a) {

        question = q;
        answer = a;

    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public String getQuestion() {
        return question;
    }

    public String getAnswer() {
        return answer;
    }

}
