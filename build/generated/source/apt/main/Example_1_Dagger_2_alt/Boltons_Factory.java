package Example_1_Dagger_2_alt;

import Example_1_Dagger2_alt.Boltons;
import dagger.internal.Factory;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class Boltons_Factory implements Factory<Boltons> {
  private static final Boltons_Factory INSTANCE = new Boltons_Factory();

  @Override
  public Boltons get() {
    return new Boltons();
  }

  public static Factory<Boltons> create() {
    return INSTANCE;
  }
}
