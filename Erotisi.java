//Theo B
// Question Class 
public  class Erotisi { 
    private String question; // Description of question 
    private String answer;// answer to the question
    private int value;// value of the question 
    
   
    public Erotisi(String q,String a ,int val){ // constructor that creates a question
            question=q; // sets the description text
            answer=a;//sets the answer text
            value=val;// sets the value of the question 
            
            }
    // ACCESSORS
    public String getQuestion()
       {
           return question;
       };
    public String getAnswer()
       {
           return answer;
       };
    public int getValue()
       {
           return value;
       };
    
    
    public void setQuestion( String newQuestion)
       {
           question=newQuestion;
       };
    public void setAnswer(String newAnswer)
       {
            answer=newAnswer;
       };
    public void setValue(int newValue)
       {
       value=newValue;
       };
    
}
