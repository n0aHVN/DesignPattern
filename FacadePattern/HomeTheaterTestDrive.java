package FacadePattern;

import FacadePattern.Subclasses.Amplifier;
import FacadePattern.Subclasses.DVDPlayer;
import FacadePattern.Subclasses.PopcornPopper;
import FacadePattern.Subclasses.Projector;
import FacadePattern.Subclasses.Screen;
import FacadePattern.Subclasses.TheaterLights;

public class HomeTheaterTestDrive {
    public static void main(String[] args) {
        // Instantiate components
        Amplifier amp = new Amplifier();
        DVDPlayer dvd = new DVDPlayer();
        Projector projector = new Projector();
        TheaterLights lights = new TheaterLights();
        Screen screen = new Screen();
        PopcornPopper popper = new PopcornPopper();

        // Create the facade
        HomeTheaterFacade homeTheater = new HomeTheaterFacade(amp, dvd, projector, lights, screen, popper);

        // Use the facade to watch and end a movie
        homeTheater.watchMovie("Avengers: Endgame");
        System.out.println();
        homeTheater.endMovie();
    }
}