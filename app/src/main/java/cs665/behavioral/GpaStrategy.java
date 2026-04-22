package cs665.behavioral;

import java.util.Map;

public interface GpaStrategy {
    double calculate(Map<String, Character> grades);
}