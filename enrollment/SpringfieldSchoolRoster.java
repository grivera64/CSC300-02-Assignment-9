//package assignment9.enrollment;

/*
 *
 * Name: SpringfieldSchoolRoster.java
 * Purpose: Runs the addition of students to a Set
 * Author: grivera64
 * Date: 11/19/2021
 *
 */

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
