package defpackage;

/* renamed from: auky */
public enum auky implements anxv {
    LOGGING_QUEUE_TYPE_UNKNOWN(0),
    LOGGING_QUEUE_TYPE_PIXIE_DUST(1),
    LOGGING_QUEUE_TYPE_CACHE_METADATA(2);
    
    public final int c;

    public final int getNumber() {
        return this.c;
    }

    public static auky a(int i) {
        if (i == 0) {
            return LOGGING_QUEUE_TYPE_UNKNOWN;
        }
        if (i != 1) {
            return i != 2 ? null : LOGGING_QUEUE_TYPE_CACHE_METADATA;
        } else {
            return LOGGING_QUEUE_TYPE_PIXIE_DUST;
        }
    }

    public static anxx a() {
        return aulb.a;
    }

    private auky(int i) {
        this.c = i;
    }

    public final String toString() {
        return Integer.toString(this.c);
    }
}
