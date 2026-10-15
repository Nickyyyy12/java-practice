package se08.methodref;

public class PassLine {
    int line;

    public PassLine(int line){
        this.line = line;
    }

    public boolean isPass(int score){
        return score>= line;
    }
}
