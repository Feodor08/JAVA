public void watchMovie(String movie) {
	System.out.println.("Get ready to watch a movie...");
	popper.on();
	popper.pop();
	lights.dim(10);
	screen.down();
	projector.on();
	projector.wideScreenMode();
	amp.on();
	amp.setDvd(dvd);
	amp.setSurroundSound();
	amp.setVolume(5);
	dvd.on();
	dvd.play(movie);
}