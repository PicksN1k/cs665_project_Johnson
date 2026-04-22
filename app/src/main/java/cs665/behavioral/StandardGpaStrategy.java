package cs665.behavioral;

import java.util.Map;

public class StandardGpaStrategy implements GpaStrategy {

    @Override
    public double calculate(Map<String, Character> grades) {
        int total = 0;

        for (char grade : grades.values()) {
            switch (grade) {
                case 'A':
                    total += 4;
                    break;
                case 'B':
                    total += 3;
                    break;
                case 'C':
                    total += 2;
                    break;
                case 'D':
                    total += 1;
                    break;
                default:
                    total += 0;
                    break;
            }
        }

        if (grades.isEmpty()) {
            return 0.0;
        }

        return (double) total / grades.size();
    }
}