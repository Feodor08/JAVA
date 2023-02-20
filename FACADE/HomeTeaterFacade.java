public class HomeTheaterFacade {
	Amplifer amp;
	Tuner tuner;
	Dvdplayer dvd;
	Cdplayer cd;
	Projector projector;
	TheaterLights lights;
	Screen screen;
	PopcornPopper popper;

	public HomeTheaterFacade (Amplifer amp,
		Tuner tuner,
		Dvdplayer dvd,
		Cdplayer cd,
		Projector projector,
		TheaterLights lights,
		Screen screen,
		PopcornPopper popper) {

	this.amp = amp;
	this.tuner = tuner;
	this.dvd = dvd;
	this.cd = cd;
	this.projector = projector;
	this.lights = lights;
	this.screen = screen;
	this.popper = popper;
	}
}