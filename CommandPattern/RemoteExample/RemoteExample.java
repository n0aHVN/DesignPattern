package CommandPattern.RemoteExample;

import CommandPattern.RemoteExample.Command.LightCommand;
import CommandPattern.RemoteExample.Command.StereoCommand;
import CommandPattern.RemoteExample.Receiver.Light;
import CommandPattern.RemoteExample.Receiver.Stereo;

public class RemoteExample {
    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();
        
        // Create devices
        Light livingRoomLight = new Light("Living Room");
        Light kitchenLight = new Light("Kitchen");
        Stereo livingRoomStereo = new Stereo("Living Room");
        
        // Create commands
        LightCommand livingRoomLightOn = new LightCommand(livingRoomLight);
        LightCommand livingRoomLightOff = new LightCommand(livingRoomLight);
        
        LightCommand kitchenLightOn = new LightCommand(kitchenLight);
        LightCommand kitchenLightOff = new LightCommand(kitchenLight);
        
        StereoCommand stereoOnWithCD = new StereoCommand(livingRoomStereo);
        StereoCommand stereoOff = new StereoCommand(livingRoomStereo);
        
        // Load commands into remote slots
        remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);
        remoteControl.setCommand(1, kitchenLightOn, kitchenLightOff);
        remoteControl.setCommand(2, stereoOnWithCD, stereoOff);
        
        // Print remote
        System.out.println(remoteControl);
        
        // Test the remote
        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);
        remoteControl.onButtonWasPushed(1);
        remoteControl.offButtonWasPushed(1);
        remoteControl.onButtonWasPushed(2);
        remoteControl.offButtonWasPushed(2);
    }
}
