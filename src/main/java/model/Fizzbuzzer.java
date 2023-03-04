package model;

public class Fizzbuzzer {
    public void printSequence(int upperBound) {
        //Toma un parámetro upperBound de límite superior, y llama al método getLine por cada número
        //hasta llegar a ese límite.
        for (int i = 1; i <= upperBound; i++) {
            System.out.println(getLine(i));
        }
    }
    public String getLine(int i) {
        //Toma un número y lo convierte a cadena para pasarlo a los métodos fizz y buzz,
        //agregando las subcadenas que correspondan en cada caso.
        //Devuelve la cadena completa luego.
        String line = Integer.toString(i);
        line = fizz(line, i);
        line = buzz(line, i);
        return line;
    }
    public String fizz(String line, int i) {
        //Recibe un número y una cadena, y le agrega la subcadena de fizz si el número es múltiplo de 3
        //o si la subcadena contiene 3.
        //Devuelve la cadena tras procesarla.
        if (i % 3 == 0 || line.contains("3"))
            return line += " xxFIZZxx";
        return line;
    }
    public String buzz(String line, int i) {
        //Recibe un número y una cadena, y le agrega la subcadena de buzz si el número es múltiplo de 5
        //o si la subcadena contiene 5.
        //Devuelve la cadena tras procesarla.
        if (i % 5 == 0 || line.contains("5"))
            return line += " xxBUZZxx";
        return line;
    }
}