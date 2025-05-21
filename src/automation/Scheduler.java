package automation;

import java.util.Timer;
import java.util.TimerTask;

public class Scheduler {
    public void schedule(Runnable task, int delaySeconds) {
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            public void run() {
                task.run();
                timer.cancel();
            }
        }, delaySeconds* 1000L);
    }
}
