package Example_1_DI;

/**
 * Created by Hari on 04/11/17.
 */
public class BattleOfBastards {

    public static void main(String[] args){

        Starks starks = new Starks();
        Boltons boltons = new Boltons();

        War war = new War(starks,boltons);
        war.prepare();
        war.report();
    }
}
