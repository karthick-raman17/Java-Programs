package logical_programs;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collections;

public class PasswordGenerator {

    private SecureRandom srand;
    private ArrayList<Object> validchar;

    public PasswordGenerator() {
        srand = new SecureRandom();
        validchar = new ArrayList<>();

        for (int i = 65; i < 91; i++) {
            validchar.add((char) i);
            validchar.add((char) (i + 32));
        }
        for (int i = 48; i < 58; i++) {
            validchar.add((char) i);
        }
        for (int i = 35; i < 39; i++) {
            validchar.add((char) i);
        }
        validchar.add((char) 64);
        Collections.shuffle(validchar);
    }

    public char randChar() {
        return (char) this.validchar.get(srand.nextInt(this.validchar.size()));
    }

    public static void main(String[] args){

        PasswordGenerator pg = new PasswordGenerator();

        StringBuilder sb = new StringBuilder();
        for (int j = 0; j < 1; j++) { 
            for (int i = 0; i < 10; i++) { 
                sb.append(pg.randChar());
            }
            System.out.println(sb.toString());
            sb.setLength(0);
        }

    }

}