package application;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;

public class ClickTime {

    public static Robot robot = null;
    public static int previousCoordinatesX = 0;
    public static int previousCoordinatesY = 0;
    public static int coordinatesEqualControl = 3;
    public static long totalMilliSeconds;
    public static long totalMilliSecondsControle;
    public static boolean statusClickDragFirstPass = true;
    private static final int INTERVALCLICK = 50;    

    public static Configuration config = new Configuration();    
    
    public static String amb = "dev";

    public ClickTime() {                 
        totalMilliSeconds = System.currentTimeMillis();
        totalMilliSecondsControle = totalMilliSeconds;
                        

        try {
            robot = new Robot();
        } catch (AWTException e) {
            System.out.println("ClickTime.java -> Robot() -> AWTException e: "+e);
        }        
    }

    public static void mousePositionReading() {
        System.out.println("isStatusTimeClic: "+config.isStatusTimeClick());
        if(config.isStatusTimeClick()){            
            java.awt.Point p = java.awt.MouseInfo.getPointerInfo().getLocation();

            if (previousCoordinatesX == p.x && previousCoordinatesY == p.y && coordinatesEqualControl == 0) {
                totalMilliSecondsControle = totalMilliSeconds;
                coordinatesEqualControl = 1;
            }

            if (previousCoordinatesX != p.x && previousCoordinatesY != p.y) {
                coordinatesEqualControl = 0;
                totalMilliSecondsControle = totalMilliSeconds;
            }

            totalMilliSeconds = System.currentTimeMillis();
            
            if ((totalMilliSeconds - totalMilliSecondsControle) >= config.getTimeClick()) {
                if (config.isStatusClickSecondary()) {
                    clickMouseSecondary();
                } else if (config.isStatusClickPrimary()) {
                    clickMousePrimary();
                } else if (config.isStatusClickPrimaryDouble()) {
                    clickMousePrimaryDouble();
                } else if (config.isStatusClickDrag()) {
                    drag();
                }
            }            

            previousCoordinatesX = p.x;
            previousCoordinatesY = p.y;            
        }
        
    }

    private static void clickMousePrimary() {
        robot.delay(INTERVALCLICK);
        robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.delay(INTERVALCLICK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        robot.delay(INTERVALCLICK);
        totalMilliSecondsControle = totalMilliSeconds;
        console("ClickTime.java -> ClickMousePrimary()");
    }

    private static void clickMouseSecondary() {
        robot.delay(INTERVALCLICK);
        robot.mousePress(InputEvent.BUTTON3_MASK);
        robot.delay(INTERVALCLICK);
        robot.mouseRelease(InputEvent.BUTTON3_MASK);
        robot.delay(INTERVALCLICK);
        totalMilliSecondsControle = totalMilliSeconds;
        console("ClickTime.java -> ClickMouseSecondary()");
    }

    private static void clickMousePrimaryDouble() {
        robot.delay(INTERVALCLICK);
        robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.delay(INTERVALCLICK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        robot.delay(INTERVALCLICK);
        robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.delay(INTERVALCLICK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        totalMilliSecondsControle = totalMilliSeconds;
        console("ClickTime.java -> ClickMousePrimaryDouble()");
    }

    private static void drag() {
        if (statusClickDragFirstPass == true) {
            robot.delay(INTERVALCLICK);
            robot.mousePress(InputEvent.BUTTON1_MASK);
            statusClickDragFirstPass = false;
            console("ClickTime.java -> ClickMouseDrag()-FirstPass");
        } else {
            robot.delay(INTERVALCLICK);
            robot.mouseRelease(InputEvent.BUTTON1_MASK);
            statusClickDragFirstPass = true;
            console("ClickTime.java -> ClickMouseDrag()-Release");
        }
        totalMilliSecondsControle = totalMilliSeconds;
        mousePositionReading();
    }
    
    private static void console(String str){
        if(amb=="dev")
            System.out.println(str);
    }
}
