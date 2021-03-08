public class ThreadTest01 extends Thread{
    @Override
    public void run() {
        for(int i=0;i<10;i++){
            System.out.println(Thread.currentThread().getName()+"------"+i);
        }
    }

    public static void main(String[] args) {
        ThreadTest01 threadDemo=new ThreadTest01();
        threadDemo.start();
        for(int i=0;i<5;i++){
            System.out.println(Thread.currentThread().getName()+"======"+i);
        }
    }
}
