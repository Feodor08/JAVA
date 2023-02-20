public void endMovie() {
	System.out.println.("Shutting movie theater down...");
	popper.off();
	lights.on();
	screen.up();
	projector.off();
	amp.off();
	dvd.stop();
	dvd.eject();
	dvd.off();
}