class DemoThread extends Thread{
    public void run(){
        for(int i=1;i<=3;i++){
            System.out.println(i);

            try{
                Thread.sleep(1000);
            }catch(InterruptedException e){
                Thread.currentThread().interrupt();
                return;
            }
        }
    }
}

public class threading {
    public static void main(String[] args) {
        DemoThread t1 = new DemoThread();
        DemoThread t2 = new DemoThread();
        t1.start();
        t2.start();
    }
}