package Day53_FinalKeyword;

public class BreaktimeException extends  RuntimeException{  // custom unchecked exception

    public BreaktimeException(){
        super("It's time for a break");
        System.err.println("Time to take 15 minutes break");
    }

    public BreaktimeException(String str){
        super(str);
        System.err.println("Time to take 15 minutes break");
    }


}

