package defpackage;

/* renamed from: baaz */
public enum baaz implements anxv {
    CHANNEL_MENTION_STYLE_UNSPECIFIED(0),
    CHANNEL_MENTION_NORMAL(1),
    CHANNEL_MENTION_LIGHT(2);
    
    public final int d;

    public final int getNumber() {
        return this.d;
    }

    public static baaz a(int i) {
        if (i == 0) {
            return CHANNEL_MENTION_STYLE_UNSPECIFIED;
        }
        if (i != 1) {
            return i != 2 ? null : CHANNEL_MENTION_LIGHT;
        } else {
            return CHANNEL_MENTION_NORMAL;
        }
    }

    public static anxx a() {
        return baay.a;
    }

    private baaz(int i) {
        this.d = i;
    }

    public final String toString() {
        return Integer.toString(this.d);
    }
}
