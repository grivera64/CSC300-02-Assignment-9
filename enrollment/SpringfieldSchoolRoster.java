//package assignment9.enrollment;

import java.util.HashSet;
import java.util.Set;

public class SpringfieldSchoolRoster<T> {

    private final Set<T> studentRoster;

    public SpringfieldSchoolRoster() {

        this.studentRoster = new HashSet<>();

    }

    public boolean addStudent(T student) {

        return this.studentRoster.add(student);

    }

}
