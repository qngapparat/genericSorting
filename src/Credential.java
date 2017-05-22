/**
 * Created by qngapparat on 22.05.17.
 */
public class Credential implements Comparable<Credential> {

    private String userName;
    private String passWord;

    public Credential(){

    }

    public Credential(String userName, String passWord){
        this.userName = userName;
        this.passWord = passWord;
    }

    @Override
    public String toString(){
        return String.format("%s (%s)", this.userName, this.passWord);
    }


    @Override
    public int compareTo(Credential o) {
        return this.userName.compareTo(o.userName);
    }
}
