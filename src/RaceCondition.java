public class RaceCondition {
    public static int sharedCounter=0;
    public static void main(String[] args) {
        Thread t1=new Thread(() ->{
            for(int i=0;i<100;i++){
                incrementCounter();
            }
        });
        Thread t2=new Thread(() ->{
            for(int i=0;i<100;i++){
                incrementCounter();
            }
        });
        t1.start();
        t2.start();
        try{
            t1.join();
            t2.join();
        } catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("Final value of shared counter is:"+sharedCounter);
    }
    public static void incrementCounter(){
        int currentVal=sharedCounter;
        sharedCounter=currentVal+1;
    }
}
