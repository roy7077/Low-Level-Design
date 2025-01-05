import LoggerClasses.DebugLog;
import LoggerClasses.ErrorLog;
import LoggerClasses.InfoLog;
import LoggerClasses.LogProcessor;

public class main {
    public static void main(String[] args) {
        LogProcessor obj = new InfoLog(new ErrorLog(new DebugLog(null)));
        obj.log(obj.ERROR, "hello Error in Data fetching from DB");
        obj.log(obj.INFO, "SuccessFully Logged IN");
        obj.log(obj.DEBUG, "Entered in trace");
    }
}