package com.example.insomniadiary.domain.sleepdiary;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.Map;

@Data
@Getter
@Setter
public class SleepDiary {

    private Long Id;
    private String date;
    private String email;
    private int caffeineIntake;
    private int caffeineIntakeTime;
    private int Exercise;
    private int ExerciseTime;
    private Map<String, Integer> pill;
    private int SleepTime;
    private int wakeUpTime;

    public SleepDiary(String date,
                      int caffeineIntake,
                      int caffeineIntakeTime,
                      int exercise,
                      int exerciseTime,
                      Map<String, Integer> pill,
                      int sleepTime,
                      int wakeUpTime) {

                        this.date = date;
                        this.caffeineIntake = caffeineIntake;
                        this.caffeineIntakeTime = caffeineIntakeTime;
                        Exercise = exercise;
                        ExerciseTime = exerciseTime;
                        this.pill = pill;
                        SleepTime = sleepTime;
                        this.wakeUpTime = wakeUpTime;
    }
}
