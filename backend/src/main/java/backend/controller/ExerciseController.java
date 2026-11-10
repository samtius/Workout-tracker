package backend.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import java.util.ArrayList;


@RestController
@RequestMapping("/api/exercises")
public class ExerciseController {



    @GetMapping
    public List<String> getExercises() {
        List<String> exercises = new ArrayList<>();
        
        exercises.add("Bench Press");
        exercises.add("Squat");
        exercises.add("Deadlift");

        return exercises;
    }

}