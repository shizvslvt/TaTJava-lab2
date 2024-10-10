package lab2.tatjavalab2.controller;

import lab2.tatjavalab2.model.Command;
import lab2.tatjavalab2.model.FirstExerciseCommand;
import lab2.tatjavalab2.model.SecondExerciseCommand;

import java.util.HashMap;
import java.util.Map;

public class CommandController {
    private static final Map<String, Command> commands = new HashMap<>();

    static {
        commands.put("/first-exercise", new FirstExerciseCommand());
        commands.put("/second-exercise", new SecondExerciseCommand());
    }

    public static Command getCommand(String path) {
        return commands.get(path);
    }
}