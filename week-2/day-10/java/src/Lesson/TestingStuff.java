package Lesson;

import org.jetbrains.annotations.Contract;

public class TestingStuff {

//    madlibs sort of method


//    methods can have many parameters, I can't say there is an upper limit to the amount
//    can you try and find one?
    public static String madLibs(String name, String noun, String adj, String verb, String otherVerb, String otherNoun, String otherName, String yetAnotherNoun){

        return "Hello, my name is "+name+" \n" +
                "I am a "+noun+" and I like to "+verb+" "+adj+"!"+" \n" +
                "I'm not a "+otherNoun+" that likes to "+otherVerb+" like a certain "+otherName+"\n" +
                "I still use Amazon a lot though. It's the only place where I can find "+yetAnotherNoun;
    }

    public static int intsReturner(int a, int b, int c, int d, int e, int f, int g, int h, int i, int j, int k, int l, int m, int n, int o, int p){
        return a+b+c+d+e+f+g+h+i+j+k+l+m+n+o+p;
    }

    public static void main(String[] args) {

        System.out.println(madLibs("Lionel", "coder","vigorously","code","hoard wealth","billionaire","Jeff Bezos", "toilet paper."));
        System.out.println(intsReturner(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16));
    }
}
