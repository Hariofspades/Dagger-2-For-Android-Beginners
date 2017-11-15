package Example_1_Dagger2_alt;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Hari on 15/11/17.
 */
@Module
public class BraavosModule {

    Cash cash;

    Soldiers soldiers;

    public BraavosModule(Cash cash, Soldiers soldiers){
        this.cash=cash;
        this.soldiers=soldiers;
    }

    @Provides
    Cash provideCash(){
        return cash;
    }

    @Provides
    Soldiers provideSoldiers(){
        return soldiers;
    }

}
