package LoggerClasses;

public class DebugLog extends LogProcessor{ 
    public DebugLog(LogProcessor nextLogProcessor){
        super(nextLogProcessor);
    }

    @Override
    public void log(int level,String message){
        if(level==DEBUG){
            System.out.println("Debug , "+message);
        }
        else
        super.log(level, message);
    }
}
