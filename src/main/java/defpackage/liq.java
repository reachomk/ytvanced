package defpackage;

/* renamed from: liq */
public final class liq implements lix {
    private static final amwi a;
    private static final amwi b;
    private amwi c = a;

    public final int a() {
        return 0;
    }

    public final amwi a(float f) {
        amqw.a(f > 0.0f);
        if (fnz.a(f, ((Float) this.c.a()).floatValue())) {
            return this.c;
        }
        amwi amwi;
        if (fnz.a(f)) {
            amwi = a;
            this.c = amwi;
            return amwi;
        } else if (fnz.b(f, 1.25f)) {
            amwi = b;
            this.c = amwi;
            return amwi;
        } else {
            Comparable valueOf = Float.valueOf(f);
            this.c = amwi.a(valueOf, valueOf);
            return this.c;
        }
    }

    static {
        Comparable valueOf = Float.valueOf(1.777f);
        a = amwi.a(valueOf, valueOf);
        valueOf = Float.valueOf(1.25f);
        b = amwi.a(valueOf, valueOf);
    }
}
