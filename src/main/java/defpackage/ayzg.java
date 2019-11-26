package defpackage;

/* renamed from: ayzg */
public enum ayzg implements anxv {
    TEXT_STICKER_FONT_NAME_UNKNOWN(0),
    TEXT_STICKER_FONT_NAME_CLASSIC(1),
    TEXT_STICKER_FONT_NAME_LIGHT(2),
    TEXT_STICKER_FONT_NAME_HEAVY(3),
    TEXT_STICKER_FONT_NAME_MARKER(4),
    TEXT_STICKER_FONT_NAME_BRUSH(5),
    TEXT_STICKER_FONT_NAME_TYPEWRITER(6);
    
    public final int g;

    public final int getNumber() {
        return this.g;
    }

    public static ayzg a(int i) {
        switch (i) {
            case 0:
                return TEXT_STICKER_FONT_NAME_UNKNOWN;
            case 1:
                return TEXT_STICKER_FONT_NAME_CLASSIC;
            case 2:
                return TEXT_STICKER_FONT_NAME_LIGHT;
            case 3:
                return TEXT_STICKER_FONT_NAME_HEAVY;
            case 4:
                return TEXT_STICKER_FONT_NAME_MARKER;
            case 5:
                return TEXT_STICKER_FONT_NAME_BRUSH;
            case 6:
                return TEXT_STICKER_FONT_NAME_TYPEWRITER;
            default:
                return null;
        }
    }

    public static anxx a() {
        return ayzf.a;
    }

    private ayzg(int i) {
        this.g = i;
    }

    public final String toString() {
        return Integer.toString(this.g);
    }
}
