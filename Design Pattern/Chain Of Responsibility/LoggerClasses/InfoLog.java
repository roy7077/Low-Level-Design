package LoggerClasses;

public class InfoLog extends LogProcessor{
    public InfoLog(LogProcessor nextLogProcessor){
        super(nextLogProcessor);
    }

    @Override
    public void log(int level,String message){
        if(level==INFO){
            System.out.println("Info , "+message);
        }
        else
        super.log(level, message);
    }
}
