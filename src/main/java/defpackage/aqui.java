package defpackage;

/* renamed from: aqui */
public enum aqui implements anxv {
    DELAYED_EVENT_TIER_UNSPECIFIED(0),
    DELAYED_EVENT_TIER_DEFAULT(100),
    DELAYED_EVENT_TIER_DISPATCH_TO_EMPTY(200),
    DELAYED_EVENT_TIER_FAST(300),
    DELAYED_EVENT_TIER_IMMEDIATE(400);
    
    public final int f;

    public final int getNumber() {
        return this.f;
    }

    public static aqui a(int i) {
        if (i == 0) {
            return DELAYED_EVENT_TIER_UNSPECIFIED;
        }
        if (i == 100) {
            return DELAYED_EVENT_TIER_DEFAULT;
        }
        if (i == 200) {
            return DELAYED_EVENT_TIER_DISPATCH_TO_EMPTY;
        }
        if (i != 300) {
            return i != 400 ? null : DELAYED_EVENT_TIER_IMMEDIATE;
        } else {
            return DELAYED_EVENT_TIER_FAST;
        }
    }

    public static anxx a() {
        return aqul.a;
    }

    private aqui(int i) {
        this.f = i;
    }

    public final String toString() {
        return Integer.toString(this.f);
    }
}
