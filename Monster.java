import java.util.ArrayList;
import java.util.List;

/**
 * Created	by Vinny Tsoi on 06/01/2019
 */
public class Monster implements ISaveable {

    private String name;
    private int strength;
    private boolean isGood;

    public Monster(String name, int strength, boolean isGood) {
        this.name = name;
        this.strength = strength;
        this.isGood = isGood;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public boolean isGood() {
        return isGood;
    }

    public void setGood(boolean good) {
        isGood = good;
    }

    @Override
    public String toString() {
        return "Monster{" +
                "name='" + name + '\'' +
                ", strength='" + strength + '\'' +
                ", isGood=" + isGood +
                '}';
    }

    @Override
    public List<String> write() {
        List<String> values = new ArrayList<>();

        values.add(0, this.name);
        values.add(1, "" + this.strength);
        if(isGood){
            values.add(2, "Is Good");
        } else {
            values.add(2, "Is Bad");
        }

        return values;
    }

    @Override
    public void read(List<String> savedValues) {
        if(savedValues != null && savedValues.size() > 0){
            this.name = savedValues.get(0);
            this.strength = Integer.parseInt(savedValues.get(1));
            if (savedValues.get(2).equalsIgnoreCase("true")){
                this.isGood = true;
            } else {
                this.isGood = false;
            }
        }
    }









} //class