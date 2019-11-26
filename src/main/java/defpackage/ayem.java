package defpackage;

/* renamed from: ayem */
public enum ayem implements anxv {
    THEME_ATTRIBUTE_UNKNOWN(0),
    THEME_ATTRIBUTE_BACKGROUND1(1),
    THEME_ATTRIBUTE_BACKGROUND2(2),
    THEME_ATTRIBUTE_BACKGROUND3(3),
    THEME_ATTRIBUTE_SEPARATOR(4),
    THEME_ATTRIBUTE_CHIP_BACKGROUND(6),
    THEME_ATTRIBUTE_TEXT1(7),
    THEME_ATTRIBUTE_TEXT2(8),
    THEME_ATTRIBUTE_TEXT3(9),
    THEME_ATTRIBUTE_SELECTED_NAV_TEXT(10),
    THEME_ATTRIBUTE_TEXT_DISABLED(39),
    THEME_ATTRIBUTE_BRAND_LINK_TEXT(40),
    THEME_ATTRIBUTE_BRAND_RED(11),
    THEME_ATTRIBUTE_STATIC_BLUE(12),
    THEME_ATTRIBUTE_STATIC_YELLOW(13),
    THEME_ATTRIBUTE_STATIC_GREEN(14),
    THEME_ATTRIBUTE_STATIC_WHITE(15),
    THEME_ATTRIBUTE_STATIC_GREY(16),
    THEME_ATTRIBUTE_ICON1(17),
    THEME_ATTRIBUTE_ICON2(18),
    THEME_ATTRIBUTE_UNSELECTED_NAV_ICON(19),
    THEME_ATTRIBUTE_SELECTED_NAV_ICON(20),
    THEME_ATTRIBUTE_HEADER_ICON(21),
    THEME_ATTRIBUTE_ICON_DISABLED(38),
    THEME_ATTRIBUTE_ICON_ACTIVE_BUTTON_LINK(41),
    THEME_ATTRIBUTE_ICON_INACTIVE(42),
    THEME_ATTRIBUTE_BADGE_BACKGROUND1(22),
    THEME_ATTRIBUTE_BADGE_BACKGROUND2(23),
    THEME_ATTRIBUTE_BADGE_TEXT1(24),
    THEME_ATTRIBUTE_BADGE_TEXT2(25),
    THEME_ATTRIBUTE_STATIC_DARK_BACKGROUND1(26),
    THEME_ATTRIBUTE_AD_MUTED_BACKGROUND(27),
    THEME_ATTRIBUTE_AD_BLUE(28),
    THEME_ATTRIBUTE_AD_BACKGROUND1(29),
    THEME_ATTRIBUTE_AD_BACKGROUND2(30),
    THEME_ATTRIBUTE_AD_OVERLAY_BACKGROUND(31),
    THEME_ATTRIBUTE_AD_TEXT1(32),
    THEME_ATTRIBUTE_AD_TEXT2(33),
    THEME_ATTRIBUTE_AD_TEXT3(34),
    THEME_ATTRIBUTE_AD_TEXT4(35),
    THEME_ATTRIBUTE_AD_SEPARATOR1(36),
    THEME_ATTRIBUTE_AD_SEPARATOR2(37);
    
    public final int N;

    public final int getNumber() {
        return this.N;
    }

    public static ayem a(int i) {
        switch (i) {
            case 0:
                return THEME_ATTRIBUTE_UNKNOWN;
            case 1:
                return THEME_ATTRIBUTE_BACKGROUND1;
            case 2:
                return THEME_ATTRIBUTE_BACKGROUND2;
            case 3:
                return THEME_ATTRIBUTE_BACKGROUND3;
            case 4:
                return THEME_ATTRIBUTE_SEPARATOR;
            case 6:
                return THEME_ATTRIBUTE_CHIP_BACKGROUND;
            case 7:
                return THEME_ATTRIBUTE_TEXT1;
            case 8:
                return THEME_ATTRIBUTE_TEXT2;
            case 9:
                return THEME_ATTRIBUTE_TEXT3;
            case 10:
                return THEME_ATTRIBUTE_SELECTED_NAV_TEXT;
            case 11:
                return THEME_ATTRIBUTE_BRAND_RED;
            case 12:
                return THEME_ATTRIBUTE_STATIC_BLUE;
            case 13:
                return THEME_ATTRIBUTE_STATIC_YELLOW;
            case 14:
                return THEME_ATTRIBUTE_STATIC_GREEN;
            case 15:
                return THEME_ATTRIBUTE_STATIC_WHITE;
            case 16:
                return THEME_ATTRIBUTE_STATIC_GREY;
            case 17:
                return THEME_ATTRIBUTE_ICON1;
            case 18:
                return THEME_ATTRIBUTE_ICON2;
            case 19:
                return THEME_ATTRIBUTE_UNSELECTED_NAV_ICON;
            case 20:
                return THEME_ATTRIBUTE_SELECTED_NAV_ICON;
            case 21:
                return THEME_ATTRIBUTE_HEADER_ICON;
            case 22:
                return THEME_ATTRIBUTE_BADGE_BACKGROUND1;
            case 23:
                return THEME_ATTRIBUTE_BADGE_BACKGROUND2;
            case 24:
                return THEME_ATTRIBUTE_BADGE_TEXT1;
            case 25:
                return THEME_ATTRIBUTE_BADGE_TEXT2;
            case 26:
                return THEME_ATTRIBUTE_STATIC_DARK_BACKGROUND1;
            case 27:
                return THEME_ATTRIBUTE_AD_MUTED_BACKGROUND;
            case 28:
                return THEME_ATTRIBUTE_AD_BLUE;
            case 29:
                return THEME_ATTRIBUTE_AD_BACKGROUND1;
            case 30:
                return THEME_ATTRIBUTE_AD_BACKGROUND2;
            case 31:
                return THEME_ATTRIBUTE_AD_OVERLAY_BACKGROUND;
            case 32:
                return THEME_ATTRIBUTE_AD_TEXT1;
            case 33:
                return THEME_ATTRIBUTE_AD_TEXT2;
            case 34:
                return THEME_ATTRIBUTE_AD_TEXT3;
            case 35:
                return THEME_ATTRIBUTE_AD_TEXT4;
            case 36:
                return THEME_ATTRIBUTE_AD_SEPARATOR1;
            case 37:
                return THEME_ATTRIBUTE_AD_SEPARATOR2;
            case 38:
                return THEME_ATTRIBUTE_ICON_DISABLED;
            case 39:
                return THEME_ATTRIBUTE_TEXT_DISABLED;
            case 40:
                return THEME_ATTRIBUTE_BRAND_LINK_TEXT;
            case 41:
                return THEME_ATTRIBUTE_ICON_ACTIVE_BUTTON_LINK;
            case 42:
                return THEME_ATTRIBUTE_ICON_INACTIVE;
            default:
                return null;
        }
    }

    public static anxx a() {
        return ayel.a;
    }

    private ayem(int i) {
        this.N = i;
    }

    public final String toString() {
        return Integer.toString(this.N);
    }
}
