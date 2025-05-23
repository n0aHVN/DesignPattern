package CommandPattern.RemoteExample.Command;

import CommandPattern.RemoteExample.Receiver.Stereo;

public class StereoCommand implements Command{
    Stereo stereo;

    public StereoCommand(Stereo stereo) {
        this.stereo = stereo;        
    }
    @Override
    public void execute() {
        stereo.off();
    }
    @Override
    public void undo() {
        stereo.on();
        stereo.setCD();
        stereo.setVolume(10);
    }
}
