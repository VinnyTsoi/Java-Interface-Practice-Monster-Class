import java.util.ArrayList;
import java.util.List;

/**
 * Created	by Vinny Tsoi on 06/01/2019
 */
public class Zombie implements ISaveable {

    private String name;
    private int strength;
    private String weapon;

    public Zombie(String name, int strength, String weapon) {
        this.name = name;
        this.strength = strength;
        this.weapon = weapon;
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

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    @Override
    public String toString() {
        return "\nZombie{" +
                "name='" + name + '\'' +
                ", strength='" + strength + '\'' +
                ", weapon=" + weapon +
                '}';
    }

    @Override
    public List<String> write() {
        List<String> values = new ArrayList<>();

        values.add(0, this.name);
        values.add(1, "" + this.strength);
        values.add(2, this.weapon);


        return values;
    }

    @Override
    public void read(List<String> savedValues) {
        if(savedValues != null && savedValues.size() > 0){
            this.name = savedValues.get(0);
            this.strength = Integer.parseInt(savedValues.get(1));
            this.weapon = savedValues.get(2);

        }
    }


} //class