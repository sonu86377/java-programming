/* Write a condition to check wheter the student is eligible for interview or not . If the student got star in java, sql and programming or only in java and sql or java and programming is eligible for the interview otherwise not sql,java and programming are boolean value and star is represented with true. */


public class Interview {
    public static void main(String[] args){
        boolean java = true;
        boolean sql = true;
        boolean programming = true;
        if((java == true && sql == true && programming == true) || (java == true && sql == true) || (java == true && programming == true)){
            System.out.println("Eligible for interview");
        }
        else{
            System.out.println("not eligible for interview");
        }
    }
}
