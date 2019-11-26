package defpackage;

/* renamed from: asau */
public enum asau implements anxv {
    UNKNOWN(0),
    KIDS_RECS_AUTO_OFFLINE(1),
    MAIN_DAILY_AUTO_OFFLINE(2),
    MUSIC_OFFLINE_MIXTAPE(3);
    
    public final int c;

    public final int getNumber() {
        return this.c;
    }

    public static asau a(int i) {
        if (i == 0) {
            return UNKNOWN;
        }
        if (i == 1) {
            return KIDS_RECS_AUTO_OFFLINE;
        }
        if (i != 2) {
            return i != 3 ? null : MUSIC_OFFLINE_MIXTAPE;
        } else {
            return MAIN_DAILY_AUTO_OFFLINE;
        }
    }

    public static anxx a() {
        return asax.a;
    }

    private asau(int i) {
        this.c = i;
    }

    public final String toString() {
        return Integer.toString(this.c);
    }
}
