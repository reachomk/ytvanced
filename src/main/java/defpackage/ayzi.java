package defpackage;

/* renamed from: ayzi */
public enum ayzi implements anxv {
    TEXT_STICKER_FONT_STYLE_UNKNOWN(0),
    TEXT_STICKER_FONT_STYLE_ROBOTO(1),
    TEXT_STICKER_FONT_STYLE_QUICK_SAND_REGULAR(2),
    TEXT_STICKER_FONT_STYLE_OSWALD_BOLD(3),
    TEXT_STICKER_FONT_STYLE_PERMANENT_MARKER(4),
    TEXT_STICKER_FONT_STYLE_TEXT_PACIFICO(5),
    TEXT_STICKER_FONT_STYLE_TEXT_CUTIVE(6);
    
    public final int g;

    public final int getNumber() {
        return this.g;
    }

    public static ayzi a(int i) {
        switch (i) {
            case 0:
                return TEXT_STICKER_FONT_STYLE_UNKNOWN;
            case 1:
                return TEXT_STICKER_FONT_STYLE_ROBOTO;
            case 2:
                return TEXT_STICKER_FONT_STYLE_QUICK_SAND_REGULAR;
            case 3:
                return TEXT_STICKER_FONT_STYLE_OSWALD_BOLD;
            case 4:
                return TEXT_STICKER_FONT_STYLE_PERMANENT_MARKER;
            case 5:
                return TEXT_STICKER_FONT_STYLE_TEXT_PACIFICO;
            case 6:
                return TEXT_STICKER_FONT_STYLE_TEXT_CUTIVE;
            default:
                return null;
        }
    }

    public static anxx a() {
        return ayzh.a;
    }

    private ayzi(int i) {
        this.g = i;
    }

    public final String toString() {
        return Integer.toString(this.g);
    }
}
