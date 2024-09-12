package ClassesAndObjectsInJava.StopWatch;

public class StopWatch {
    public long startTime;
    public long stopTime;

    public StopWatch() {
        this.startTime = System.currentTimeMillis();
        this.stopTime = System.currentTimeMillis();
    }

    public void start(){
        this.startTime = System.currentTimeMillis();
    }
    public void stop(){
        this.stopTime = System.currentTimeMillis();
    }
    public long getElapsedTime(){
        return stopTime - startTime;
    }

}
