package Example_1_Dagger2_alt;

import dagger.internal.Preconditions;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class DaggerBattleComponent implements BattleComponent {
  private BraavosModule braavosModule;

  private DaggerBattleComponent(Builder builder) {
    initialize(builder);
  }

  public static Builder builder() {
    return new Builder();
  }

  @SuppressWarnings("unchecked")
  private void initialize(final Builder builder) {
    this.braavosModule = builder.braavosModule;
  }

  @Override
  public War getWar() {
    return new War(new Starks(), new Boltons());
  }

  @Override
  public Cash getCash() {
    return Preconditions.checkNotNull(
        braavosModule.provideCash(), "Cannot return null from a non-@Nullable @Provides method");
  }

  @Override
  public Soldiers getSoldiers() {
    return Preconditions.checkNotNull(
        braavosModule.provideSoldiers(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static final class Builder {
    private BraavosModule braavosModule;

    private Builder() {}

    public BattleComponent build() {
      if (braavosModule == null) {
        throw new IllegalStateException(BraavosModule.class.getCanonicalName() + " must be set");
      }
      return new DaggerBattleComponent(this);
    }

    public Builder braavosModule(BraavosModule braavosModule) {
      this.braavosModule = Preconditions.checkNotNull(braavosModule);
      return this;
    }
  }
}
