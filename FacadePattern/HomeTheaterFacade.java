package FacadePattern;

import FacadePattern.Subclasses.Amplifier;
import FacadePattern.Subclasses.DVDPlayer;
import FacadePattern.Subclasses.PopcornPopper;
import FacadePattern.Subclasses.Projector;
import FacadePattern.Subclasses.Screen;
import FacadePattern.Subclasses.TheaterLights;

public class HomeTheaterFacade{
    private Amplifier amp;
    private DVDPlayer dvd;
    private Projector projector;
    private TheaterLights lights;
    private Screen screen;
    private PopcornPopper popper;

    public HomeTheaterFacade(Amplifier amp, DVDPlayer dvd, Projector projector,
                             TheaterLights lights, Screen screen, PopcornPopper popper) {
        this.amp = amp;
        this.dvd = dvd;
        this.projector = projector;
        this.lights = lights;
        this.screen = screen;
        this.popper = popper;
    }

    public void watchMovie(String movie) {
        System.out.println("Get ready to watch a movie...");
        popper.on();
        popper.pop();
        lights.dim(10);
        screen.down();
        projector.on();
        projector.wideScreenMode();
        amp.on();
        amp.setDVD(dvd);
        amp.setSurroundSound();
        amp.setVolume(5);
        dvd.on();
        dvd.play(movie);
    }

    public void endMovie() {
        System.out.println("Shutting movie theater down...");
        popper.off();
        lights.on();
        screen.up();
        projector.off();
        amp.off();
        dvd.stop();
        dvd.eject();
        dvd.off();
    }
}
