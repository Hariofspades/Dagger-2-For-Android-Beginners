package Example_1_Dagger2_alt;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class BraavosModule_ProvideSoldiersFactory implements Factory<Soldiers> {
  private final BraavosModule module;

  public BraavosModule_ProvideSoldiersFactory(BraavosModule module) {
    this.module = module;
  }

  @Override
  public Soldiers get() {
    return Preconditions.checkNotNull(
        module.provideSoldiers(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<Soldiers> create(BraavosModule module) {
    return new BraavosModule_ProvideSoldiersFactory(module);
  }

  public static Soldiers proxyProvideSoldiers(BraavosModule instance) {
    return instance.provideSoldiers();
  }
}
