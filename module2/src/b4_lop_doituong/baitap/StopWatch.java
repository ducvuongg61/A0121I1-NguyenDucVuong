package b4_lop_doituong.baitap;

import javafx.scene.paint.Stop;

import java.util.Arrays;

public class StopWatch {
    private long startTime;
    private long endTime;

    public StopWatch() {
        this.startTime = System.currentTimeMillis();
    }

    public StopWatch(long startTime, long endTime) {
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public long getStartTime() {
        return startTime;
    }

    public void setStartTime(long startTime) {
        this.startTime = startTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public void setEndTime(long endTime) {
        this.endTime = endTime;
    }

    public void start(){
        this.startTime = System.currentTimeMillis();
    }

    public void stop(){
        this.endTime = System.currentTimeMillis();
    }

    public long getElapsedTime(){
        return endTime - startTime;
    }

    public static void main(String[] args) {
        int [] time = new int[1000000];
        for (int i = 0; i < time.length; i++) {
            time[i]  = (int)(Math.random()*1000000);
        }
        StopWatch watch = new StopWatch();
        Arrays.sort(time);
        watch.stop();
        System.out.println(watch.getElapsedTime());
    }
}
