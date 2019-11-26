package defpackage;

/* renamed from: atzi */
public enum atzi implements anxv {
    UNKNOWN(0),
    FLASHACCESS(1),
    WIDEVINE_CLASSIC(2),
    FAIRPLAY(6),
    CLEARKEY(3),
    WIDEVINE(4),
    PLAYREADY(5);
    
    public final int c;

    public final int getNumber() {
        return this.c;
    }

    public static atzi a(int i) {
        switch (i) {
            case 0:
                return UNKNOWN;
            case 1:
                return FLASHACCESS;
            case 2:
                return WIDEVINE_CLASSIC;
            case 3:
                return CLEARKEY;
            case 4:
                return WIDEVINE;
            case 5:
                return PLAYREADY;
            case 6:
                return FAIRPLAY;
            default:
                return null;
        }
    }

    public static anxx a() {
        return atzh.a;
    }

    private atzi(int i) {
        this.c = i;
    }

    public final String toString() {
        return Integer.toString(this.c);
    }
}
