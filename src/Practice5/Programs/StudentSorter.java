/**
 * Created by Sakshi
 * date- 17/05/19
 * This program is used to sort the Student objects by implementing Comparator interface
 */

package Programs;

import java.util.Comparator;

class StudentSorter implements Comparator {

    //override compare method to compare objects
    @Override
    public int compare(Object o1, Object o2) {
        Student s1=(Student)o1;
        Student s2=(Student)o2;

        if(s1.getAge()>s2.getAge()) {
            return -1;
        }
        else if(s1.getAge()==s2.getAge()) {
            if(s1.getName().compareTo(s2.getName())==1) {
                return 1;
            }
            else if(s1.getName().compareTo(s2.getName())==0) {
                if(s1.getId()>s2.getId()) {
                    return -1;
                }
                else {
                    return 1;
                }
            }
            else {
                return -1;
            }
        }
        else {
            return 1;
        }
    }
}
