package Example_1_Dagger2;

import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class DaggerBattleComponent implements BattleComponent {

  private DaggerBattleComponent(Builder builder) {}

  public static Builder builder() {
    return new Builder();
  }

  public static BattleComponent create() {
    return new Builder().build();
  }

  @Override
  public War getWar() {
    return new War(new Starks(), new Boltons());
  }

  public static final class Builder {
    private Builder() {}

    public BattleComponent build() {
      return new DaggerBattleComponent(this);
    }
  }
}
