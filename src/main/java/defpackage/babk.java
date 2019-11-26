package defpackage;

/* renamed from: babk */
public enum babk implements anxv {
    FONT_FAMILY_UNSPECIFIED(0),
    CLASSIC(1),
    LIGHT(2),
    HEAVY(3),
    MARKER(4),
    BRUSH(5),
    TYPEWRITER(6);
    
    public final int h;

    public final int getNumber() {
        return this.h;
    }

    public static babk a(int i) {
        switch (i) {
            case 0:
                return FONT_FAMILY_UNSPECIFIED;
            case 1:
                return CLASSIC;
            case 2:
                return LIGHT;
            case 3:
                return HEAVY;
            case 4:
                return MARKER;
            case 5:
                return BRUSH;
            case 6:
                return TYPEWRITER;
            default:
                return null;
        }
    }

    public static anxx a() {
        return babn.a;
    }

    private babk(int i) {
        this.h = i;
    }

    public final String toString() {
        return Integer.toString(this.h);
    }
}
