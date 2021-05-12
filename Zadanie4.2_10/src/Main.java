public class Main {
    public static void main(String[] args) {
	    Safe safe1 = new Safe("1234");
	    SoundAlarm soundAlarm = new SoundAlarm();
	    BarsAlarm barsAlarm = new BarsAlarm();
	    PoliceAlarm policeAlarm = new PoliceAlarm();
	    DogsAlarm dogsAlarm = new DogsAlarm();

	    safe1.addAlarm(soundAlarm);
	    safe1.addAlarm(barsAlarm);
	    safe1.addAlarm(policeAlarm);
	    safe1.addAlarm(dogsAlarm);

		System.out.println("Wpisano błędny pin");
	    safe1.enterPin("1111");
		System.out.print("\nWpisano poprawny pin\n");
        safe1.enterPin("1234");

        safe1.removeAlarm(policeAlarm);
        safe1.removeAlarm(dogsAlarm);

		System.out.printf("\nWłaściciela nie stać na utrzymanie ochrony i kupno nowych psów.\n");
		System.out.printf("Nowi włamywacze wpisali zły pin\n");
        safe1.enterPin("1212");
		System.out.print("\nWpisano poprawny pin\n");
        safe1.enterPin("1234");
    }
}
