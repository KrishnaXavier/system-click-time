package application;

import java.util.Timer;
import java.util.TimerTask;

/**
 *
 * @author Krishna Xavier
 */
public class Main {

    public static final long task1_TEMPO = 100;
    private static ClickTime clickTime;
   
    public static void main(String[] args) {
        System.out.println("main");
        ConfigurationWindow config = new ConfigurationWindow();
        config.setVisible(true);
        startTask();
    }
    
    public static void startTask(){
        clickTime = new ClickTime();
         /* Tarefa 1 */        
        Timer task1_timer = null;
        if (task1_timer == null) {
            task1_timer = new Timer();
            TimerTask task1 = new TimerTask() {
                public void run() {
                    try {                        
                        clickTime.mousePositionReading();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            };
            task1_timer.scheduleAtFixedRate(task1, task1_TEMPO, task1_TEMPO);
        }          
    }
    
}
