package Threads;

public class SleepMessages {

    public static void main(String[] args) throws InterruptedException{

        String importantInfo[] = {
                "Mares eat oats",
                "Does eat oats",
                "Little lambs eat ivy",
                "A kid will eat ivy too"
        };

        for (String info:importantInfo){

            try {
                Thread.sleep(4000);
//                throw new InterruptedException();
            } catch (InterruptedException e){
                return;
            }
            System.out.println(info);

        }



    }
}
