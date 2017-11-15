package Example_1_Dagger2;


import dagger.Component;

/**
 * Created by Hari on 04/11/17.
 */

@Component
interface BattleComponent {
    War getWar();
    Starks getStarks();
    Boltons getBoltons();
}

public class BattleOfBastards {

    public static void main(String[] args){

//        Starks starks = new Starks();
//        Boltons boltons = new Boltons();
//
//        War war = new War(starks,boltons);
//        war.prepare();
//        war.report();

        BattleComponent component = DaggerBattleComponent.create();
        War war = component.getWar();
        war.prepare();
        war.report();

    }
}
