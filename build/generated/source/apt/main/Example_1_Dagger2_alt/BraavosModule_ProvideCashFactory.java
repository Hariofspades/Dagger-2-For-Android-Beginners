package Example_1_Dagger2_alt;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class BraavosModule_ProvideCashFactory implements Factory<Cash> {
  private final BraavosModule module;

  public BraavosModule_ProvideCashFactory(BraavosModule module) {
    this.module = module;
  }

  @Override
  public Cash get() {
    return Preconditions.checkNotNull(
        module.provideCash(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<Cash> create(BraavosModule module) {
    return new BraavosModule_ProvideCashFactory(module);
  }

  public static Cash proxyProvideCash(BraavosModule instance) {
    return instance.provideCash();
  }
}
