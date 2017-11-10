package Example_1_Dagger2;

import javax.inject.Inject;

/**
 * Created by Hari on 04/11/17.
 */
public class War {

    private Starks starks;

    private Boltons boltons;

    @Inject
    public War(Starks starks, Boltons bolton){
        this.starks = starks;
        this.boltons = bolton;
    }

    public void prepare(){
        starks.prepareForWar();
        boltons.prepareForWar();
    }

    public void report(){
        starks.reportForWar();
        boltons.reportForWar();
    }

}
