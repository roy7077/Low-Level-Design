import components.childs.NormalDriveChild;
import components.childs.SportDriveChild;


public class Main {
  public static void main(String[] args) {

    // normal drive
    NormalDriveChild objN = new NormalDriveChild();
    SportDriveChild objS = new SportDriveChild();

    objN.startDrive();
    objS.startDrive();
  }
}