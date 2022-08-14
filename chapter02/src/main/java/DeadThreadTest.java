/**
 * @author 郭正龙
 * @date 2022-08-14
 */

/**
 * 虚拟机必须保证一个类的clinit方法在多线程下被同步加锁  这里：线程1和线程2都初始化开始，然后只有一个线程能一直加载DeadThread线程导致死锁
 */
public class DeadThreadTest {
    public static void main(String[] args) {
        Runnable r = ()->{
            System.out.println(Thread.currentThread().getName() + "开始");
            DeadThread dead = new DeadThread();
            System.out.println(Thread.currentThread().getName()+ "结束");
        };

        Thread t1 = new Thread(r,"线程1");
        Thread t2 = new Thread(r,"线程2");

        t1.start();
        t2.start();
    }
}

class DeadThread{
    static{
        if (true){
            System.out.println(Thread.currentThread().getName()+"初始化当前类");
            while (true){

            }
        }
    }
}
