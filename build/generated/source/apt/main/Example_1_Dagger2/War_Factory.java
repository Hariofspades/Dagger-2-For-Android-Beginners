package Example_1_Dagger2;

import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class War_Factory implements Factory<War> {
  private final Provider<Starks> starksProvider;

  private final Provider<Boltons> boltonProvider;

  public War_Factory(Provider<Starks> starksProvider, Provider<Boltons> boltonProvider) {
    this.starksProvider = starksProvider;
    this.boltonProvider = boltonProvider;
  }

  @Override
  public War get() {
    return new War(starksProvider.get(), boltonProvider.get());
  }

  public static Factory<War> create(
      Provider<Starks> starksProvider, Provider<Boltons> boltonProvider) {
    return new War_Factory(starksProvider, boltonProvider);
  }
}
