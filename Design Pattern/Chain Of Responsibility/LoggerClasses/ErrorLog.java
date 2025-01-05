package LoggerClasses;

public class ErrorLog extends LogProcessor{
    public ErrorLog(LogProcessor nextLogProcessor){
        super(nextLogProcessor);
    }

    @Override
    public void log(int level,String message){
        if(level==ERROR){
            System.out.println("Error , "+message);
        }
        else
        super.log(level, message);
    }
}
