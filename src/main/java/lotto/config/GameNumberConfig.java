package lotto.config;

public enum GameNumberConfig {
    LOTTO_RANGE_MIN(1),
    LOTTO_RANGE_MAX(45),
    LOTTO_PRICE(1000),
    LOTTO_NUMBERS(6),
    BONUS_NUMBERS(1);

    private final int number;

    GameNumberConfig(int number) {
        this.number = number;
    }

    public int getNumber() { return this.number; }

}
