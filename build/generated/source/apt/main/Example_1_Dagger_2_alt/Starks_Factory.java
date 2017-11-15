package Example_1_Dagger_2_alt;

import Example_1_Dagger2_alt.Starks;
import dagger.internal.Factory;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class Starks_Factory implements Factory<Starks> {
  private static final Starks_Factory INSTANCE = new Starks_Factory();

  @Override
  public Starks get() {
    return new Starks();
  }

  public static Factory<Starks> create() {
    return INSTANCE;
  }
}
