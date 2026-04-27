package Interview150;

public class RotateString796 {
    public boolean rotateString(String s, String goal) {
        if(s.length() != goal.length()){
            return false;
        }
        return (s+s).contains(goal);
    }
}
