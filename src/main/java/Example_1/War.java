package Example_1;

/**
 * Created by Hari on 04/11/17.
 */
public class War {

    private Starks starks;

    private Boltons boltons;

    public War(){
        starks = new Starks();
        boltons = new Boltons();

        starks.prepareForWar();
        starks.reportForWar();
        boltons.prepareForWar();
        starks.reportForWar();
    }

}
