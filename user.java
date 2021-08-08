package sample;

import java.util.Scanner;

public class user {
    private String name;
    private String ccno;

    public void setCcno(String ccno) {
        this.ccno = ccno;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public String getCcno(){
        return ccno;
    }
    int [] score = new int[5];
    public void Score(){
        for (int i=0;i<score.length;i++){
            System.out.println("输入"+this.name+ "成绩");
            Scanner sa = new Scanner(System.in);
            String a = " ";
            if(sa.next().equals(a)){
                break;
            }else{
                score[i] = sa.nextInt();
            }
        }

    }
}
