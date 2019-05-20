/**
 * Created by Sakshi
 * date- 17/05/19
 * This program is used to perform sorting on a list of Student objects
 */

package Programs;

import java.util.Collections;
import java.util.List;

public class Maintest {

    //sort List<Student> return List<Student>
    public List<Student> sorting(List<Student> stu) {
        StudentSorter ss=new StudentSorter();
        Collections.sort(stu,ss);
        return stu;
    }
}
