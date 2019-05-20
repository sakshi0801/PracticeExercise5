/**
 * Created by Sakshi
 * date- 17/05/19
 * This program test the sorting of list of student objects
 */

package Programs;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class MaintestTest {

    private static Maintest mt;
    @BeforeClass
    public static void setup() {
        mt=new Maintest();
    }

    @AfterClass
    public static void teardown()
    {
        mt=null;
    }

    //Test scenario 1: Given a list of student objects, perform sorting and return list of student
    @Test
    public void sorting_GivenListOfStudent_ReturnSortedList() {
        Student s1=new Student();
        s1.setId(2);
        s1.setAge(21);
        s1.setName("kajal");

        Student s2=new Student();
        s2.setId(1);
        s2.setAge(20);
        s2.setName("deepa");

        Student s3=new Student();
        s3.setId(5);
        s3.setAge(22);
        s3.setName("anu");

        Student s4=new Student();
        s4.setId(9);
        s4.setAge(22);
        s4.setName("anu");

        Student s5=new Student();
        s5.setId(3);
        s5.setAge(22);
        s5.setName("sweety");

        List<Student> stu=new ArrayList<>();
        stu.add(s1);
        stu.add(s2);
        stu.add(s3);
        stu.add(s4);
        stu.add(s5);

        List<Student> expectOutput=new ArrayList<>();
        expectOutput.add(s5);
        expectOutput.add(s4);
        expectOutput.add(s3);
        expectOutput.add(s1);
        expectOutput.add(s2);

        assertEquals(expectOutput,mt.sorting(stu));
    }

    //Test scenario 2: failure for test scenario 1
    @Test
    public void sorting_GivenListOfStudent_ReturnSortedListFailure() {
        Student s1=new Student();
        s1.setId(2);
        s1.setAge(21);
        s1.setName("kajal");

        Student s2=new Student();
        s2.setId(1);
        s2.setAge(20);
        s2.setName("deepa");

        Student s3=new Student();
        s3.setId(5);
        s3.setAge(22);
        s3.setName("anu");

        Student s4=new Student();
        s4.setId(9);
        s4.setAge(22);
        s4.setName("anu");

        Student s5=new Student();
        s5.setId(3);
        s5.setAge(22);
        s5.setName("sweety");

        List<Student> stu=new ArrayList<>();
        stu.add(s1);
        stu.add(s2);
        stu.add(s3);
        stu.add(s4);
        stu.add(s5);

        List<Student> expectOutput=new ArrayList<>();
        expectOutput.add(s4);
        expectOutput.add(s3);
        expectOutput.add(s5);
        expectOutput.add(s1);
        expectOutput.add(s2);

        assertNotEquals(expectOutput,mt.sorting(stu));
    }
}