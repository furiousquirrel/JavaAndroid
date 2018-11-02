package lesson2;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    private static ExecutorService mExecutorService;
    public static void main (String[] args) throws InterruptedException, ExecutionException {
        mExecutorService = Executors.newFixedThreadPool(2);
        Robot robot=new Robot(0,0,Direction.UP,"Вася");
        Robot robot2=new Robot (5,5,Direction.DOWN,"Гога");
        mExecutorService.submit(new MoveRobot(robot,5,7));
        mExecutorService.submit(new MoveRobot(robot2,7,15));
    }
}
