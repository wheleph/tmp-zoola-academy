package _8;

import java.util.concurrent.ForkJoinPool;

public class ForkJoinPlayground {
    public static void main(String[] args) {
        ForkJoinPool fjPool = ForkJoinPool.commonPool();
        CustomRecursiveTask task = new CustomRecursiveTask(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10});
//        fjPool.execute(task);
        task.fork();
        int result = task.join();
        System.out.println(result);
    }
}
