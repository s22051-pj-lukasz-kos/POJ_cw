package com.company;

public class Main {

    public static void main(String[] args) {
	    Nowa nowaPusta = new Nowa();
	    Nowa nowaWszystko = new Nowa("AllArgsConstructor", 2, 0.2);

        System.out.printf("%s %d %.3f\n", nowaPusta.getLancuch(), nowaPusta.getLiczba(), nowaPusta.getUlamek());
        System.out.printf("%s %d %.3f\n", nowaWszystko.getLancuch(), nowaWszystko.getLiczba(), nowaWszystko.getUlamek());

        nowaPusta.setLancuch("SetterData");
        nowaPusta.setLiczba(1);
        nowaPusta.setUlamek(0.1);
        System.out.printf("%s %d %.3f\n", nowaPusta.getLancuch(), nowaPusta.getLiczba(), nowaPusta.getUlamek());
    }
}
