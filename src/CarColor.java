public enum CarColor {
    BLUE("Синий"),
    RED("Красный"),
    GRAY("Серый"),
    YELLOW("Желтый"),
    WHITE("Белый"),
    BLACK("Черный"),
    GREEN("Зеленый"),
    ORANGE("Оранжевый"),
    PINK("Розовый")
    ;

    private final String carColor;

    CarColor(String carColor) {
        this.carColor = carColor;
    }

    public String getCarColor() {
        return carColor;
    }
}
