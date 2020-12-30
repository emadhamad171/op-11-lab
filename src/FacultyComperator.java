import java.util.Comparator;

public class FacultyComperator implements Comparator<Faculty> {
  @Override
  public int compare(Faculty o1, Faculty o2){
    return o1.getName().compareTo(o2.getName());
  }
}
