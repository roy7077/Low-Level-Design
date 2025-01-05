package Buttons;

import ElevatorCar.ElevatorCar;

public class InternalButtons extends Buttons{
    public void keyPress(int key,ElevatorCar ele){

        if(!(this.buttons.contains(key))){
            System.out.println("There is no key like "+key);
            return ;
        }

        // make a call to dispatcher
        // pending ?
    }
}
