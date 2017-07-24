package application;

public class Configuration {
    private static int     timeClick                = 3000;
    private static boolean statusTimeClick          = false;     
    private static boolean statusClickPrimary       = false;  /* Button Left Mouse          */
    private static boolean statusClickSecondary     = false; /* Button Right Mouse          */
    private static boolean statusClickPrimaryDouble = false; /* Button Left Double Mouse    */
    private static boolean statusClickDrag          = false; /* Function Drag Itens/Folder  */
    public static ConfigurationWindow configWindow;

    public static int getTimeClick() {        
        return timeClick;
    }

    public static boolean isStatusTimeClick() {
        return statusTimeClick;
    }

    public static boolean isStatusClickPrimary() {
        return statusClickPrimary;
    }

    public static boolean isStatusClickSecondary() {
        return statusClickSecondary;
    }

    public static boolean isStatusClickPrimaryDouble() {
        return statusClickPrimaryDouble;
    }

    public static boolean isStatusClickDrag() {
        return statusClickDrag;
    }

    public static void setTimeClick(int timeClick) {
        Configuration.timeClick = timeClick;
    }

    public static void setStatusTimeClick(boolean statusTimeClick) {
        Configuration.statusTimeClick = statusTimeClick;
    }

    public static void setStatusClickPrimary(boolean statusClickPrimary) {
        Configuration.statusClickPrimary = statusClickPrimary;
    }

    public static void setStatusClickSecondary(boolean statusClickSecondary) {
        Configuration.statusClickSecondary = statusClickSecondary;
    }

    public static void setStatusClickPrimaryDouble(boolean statusClickPrimaryDouble) {
        Configuration.statusClickPrimaryDouble = statusClickPrimaryDouble;
    }

    public static void setStatusClickDrag(boolean statusClickDrag) {
        Configuration.statusClickDrag = statusClickDrag;
    }
   
    
}
