package com.zebrunner.carina.demo.gui.components.common.brands;

public enum PhoneBrands {
    SAMSUNG("Samsung"),
    APPLE("Apple"),
    HUAWEI("Huawei"),
    NOKIA("Nokia"),
    SONY("Sony"),
    LG("LG"),
    HTC("HTC"),
    MOTOROLA("Motorola"),
    LENOVO("Lenovo"),

    XIAOMI("Xiaomi"),
    GOOGLE("Google"),
    HONOR("Honor"),
    OPPO("Oppo"),
    REALME("Realme"),
    ONEPLUS("OnePlus"),
    NOTHING("Nothing"),
    VIVO("Vivo"),
    MEIZU("Meizu"),

    ASUS("Asus"),
    ALCATEL("Alcatel"),
    ZTE("ZTE"),
    MICROSOFT("Microsoft"),
    UMIDIGI("Umidigi"),
    ENERGIZER("Energizer"),
    CAT("CAT"),
    SHARP("Sharp"),
    MICROMAX("Micromax"),

    INFINIX("Infinix"),
    ULEFONE("Ulefone"),
    TECNO("Tecno"),
    DOOGEE("Doogee"),
    BLACKVIEW("Blackview"),
    CUBOT("Cubot"),
    OUKITEL("Oukitel"),
    ITEL("Itel"),
    TCL("TCL");

    private final String displayName;

    PhoneBrands(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}