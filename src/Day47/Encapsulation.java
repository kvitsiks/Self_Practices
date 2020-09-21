package Day47;

public class Encapsulation {
    private long ssn = 123456789;
    private String username;

    public long getSsn(){
        return ssn;
    }
    public void setSsn(long ssn){
        this.ssn = ssn;
    }

    public String getUsername(){
        return username;
    }
    public void setUsername(String username){
        this.username = username;
    }
}
