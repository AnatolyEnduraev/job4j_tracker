package ru.job4j.hashmap;

import java.util.*;

public class AnalyzeByMap {
    public static double averageScore(List<Pupil> pupils) {
        double totalScore = 0;
        int totalSubjects = 0;
        for (Pupil pupil : pupils) {
            for (Subject subject : pupil.subjects()) {
                totalScore += subject.score();
                totalSubjects++;
            }
        }
        return totalSubjects == 0 ? 0 : totalScore / totalSubjects;
    }

    public static List<Label> averageScoreByPupil(List<Pupil> pupils) {
        List<Label> result = new ArrayList<>();
        for (Pupil pupil : pupils) {
            double sum = 0;
            for (Subject subject : pupil.subjects()) {
                sum += subject.score();
            }
            double average = pupil.subjects().isEmpty() ? 0 : sum / pupil.subjects().size();
            result.add(new Label(pupil.name(), average));
        }
        return result;
    }

    public static List<Label> averageScoreBySubject(List<Pupil> pupils) {
        Map<String, int[]> stats = new LinkedHashMap<>();
        for (Pupil pupil : pupils) {
            for (Subject subject : pupil.subjects()) {
                String name = subject.name();
                int score = subject.score();

                stats.merge(name,
                        new int[]{score, 1},
                        (oldArr, newArr) -> new int[]{
                                oldArr[0] + newArr[0],
                                oldArr[1] + newArr[1]});
            }
        }

        List<Label> result = new ArrayList<>();
        for (Map.Entry<String, int[]> e : stats.entrySet()) {
            int sum = e.getValue()[0];
            int cnt = e.getValue()[1];
            double avg = cnt == 0 ? 0 : (double) sum / cnt;
            result.add(new Label(e.getKey(), avg));
        }
        return result;
    }

    public static Label bestStudent(List<Pupil> pupils) {
        List<Label> students = new ArrayList<>();
        for (Pupil pupil : pupils) {
            double sum = 0;
            for (Subject subject : pupil.subjects()) {
                sum += subject.score();
            }
            students.add(new Label(pupil.name(), sum));
        }
        Collections.sort(students);
        return students.isEmpty() ? null : students.get(students.size() - 1);
    }

    public static Label bestSubject(List<Pupil> pupils) {
        Map<String, Integer> subjectScores = new HashMap<>();
        for (Pupil pupil : pupils) {
            for (Subject subject : pupil.subjects()) {
                String name = subject.name();
                int score = subject.score();
                subjectScores.merge(name, score, Integer::sum);
            }
        }

        List<Label> subjects = new ArrayList<>();
        for (Map.Entry<String, Integer> e : subjectScores.entrySet()) {
            subjects.add(new Label(e.getKey(), e.getValue()));
        }
        Collections.sort(subjects);
        return subjects.isEmpty() ? null : subjects.get(subjects.size() - 1);
    }
}
