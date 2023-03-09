public class SDThreads3 {
    String importantinfo[] = {
            "Mares eat oates",
            "Does eat oats",
            "Little lambs eat ivy",
            "A kid will eat ivy too"
    };
    public static void main (String[] args){
        SDThreads3 sd3 = new SDThreads3();
        for (int i = 0; i< 4; i++){
            System.out.println(sd3.importantinfo[i]);
            try {
                Thread.sleep(4000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
