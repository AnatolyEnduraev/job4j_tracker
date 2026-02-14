package ru.job4j.collection;

import org.junit.jupiter.api.Test;
import java.util.Comparator;
import static org.assertj.core.api.Assertions.assertThat;

public class JobTest {

    @Test
    public void whenComparatorAscByName() {
        Comparator<Job> cmp = new JobAscByName();
        int result = cmp.compare(
                new Job("Anna", 1),
                new Job("Ivan", 2)
        );
        assertThat(result).isLessThan(0);
    }

    @Test
    public void whenComparatorAscByPriority() {
        Comparator<Job> cmp = new JobAscByPriority();
        int result = cmp.compare(
                new Job("Task", 1),
                new Job("Bug", 5)
        );
        assertThat(result).isLessThan(0);
    }

    @Test
    public void whenComparatorDescByName() {
        Comparator<Job> cmp = new JobDescByName();
        int result = cmp.compare(
                new Job("Zebra", 1),
                new Job("Alpha", 2)
        );
        assertThat(result).isLessThan(0);
    }

    @Test
    public void whenComparatorDescByPriority() {
        Comparator<Job> cmp = new JobDescByPriority();
        int result = cmp.compare(
                new Job("Task", 10),
                new Job("Bug", 5)
        );
        assertThat(result).isLessThan(0);
    }

    @Test
    public void whenComparatorByNameAndPriority() {
        Comparator<Job> cmpNamePriority = new JobDescByName().thenComparing(new JobDescByPriority());
        int rsl = cmpNamePriority.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1)
        );
        assertThat(rsl).isLessThan(0);
    }

    @Test
    public void whenComparatorByNameAscThenPriorityAsc() {
        Comparator<Job> cmp = new JobAscByName().thenComparing(new JobAscByPriority());
        int result1 = cmp.compare(
                new Job("Anna", 5),
                new Job("Boris", 1)
        );
        assertThat(result1).isLessThan(0);
        int result2 = cmp.compare(
                new Job("Task", 1),
                new Job("Task", 5)
        );
        assertThat(result2).isLessThan(0);
    }

    @Test
    public void whenComparatorByPriorityDescThenNameAsc() {
        Comparator<Job> cmp = new JobDescByPriority().thenComparing(new JobAscByName());
        int result1 = cmp.compare(
                new Job("Task", 10),
                new Job("Bug", 5)
        );
        assertThat(result1).isLessThan(0);
        int result2 = cmp.compare(
                new Job("Anna", 5),
                new Job("Boris", 5)
        );
        assertThat(result2).isLessThan(0);
    }

    @Test
    public void whenComparatorCombinedComplex() {
        Comparator<Job> cmp = new JobDescByName().thenComparing(new JobDescByPriority());
        int result1 = cmp.compare(
                new Job("Zebra", 1),
                new Job("Alpha", 10)
        );
        assertThat(result1).isLessThan(0);
        int result2 = cmp.compare(
                new Job("Task", 10),
                new Job("Task", 1)
        );
        assertThat(result2).isLessThan(0);
        int result3 = cmp.compare(
                new Job("Task", 5),
                new Job("Task", 5)
        );
        assertThat(result3).isEqualTo(0);
    }
}
