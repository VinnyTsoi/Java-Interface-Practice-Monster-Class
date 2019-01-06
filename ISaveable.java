import java.util.List;

/**
 * Created	by Vinny Tsoi on 06/01/2019
 */
public interface ISaveable {

    //return an ArrayList of values to be saved
    List<String> write();

    //populate the object's fields from an ArrayList (parameter)
    void read(List<String> savedValues);

}
