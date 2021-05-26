public class Main {
    public static void main(String[] args)  {
        Main klasa = new Main();
        System.out.println(klasa.checkIfPositiveNumber(6));
        System.out.println(klasa.checkIfPositiveNumber(-1));
    }

    boolean checkIfPositiveNumber(int num) {
        try {
            if (num < 0) {
                throw new IllegalParameterException();
            }
        } catch (IllegalParameterException exception) {
            exception.printStackTrace();
        }
        return (num >= 0);
    }
}
