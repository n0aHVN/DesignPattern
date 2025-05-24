package FacadePattern.Subclasses;

public class Amplifier {
    public void on() { System.out.println("Amplifier on"); }
    public void off() { System.out.println("Amplifier off"); }
    public void setDVD(DVDPlayer dvd) { System.out.println("Amplifier setting DVD player"); }
    public void setSurroundSound() { System.out.println("Amplifier surround sound on"); }
    public void setVolume(int level) { System.out.println("Amplifier setting volume to " + level); }
}
