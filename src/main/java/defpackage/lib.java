package defpackage;

/* renamed from: lib */
final class lib implements lix {
    private static final amwi a;
    private amwi b = a;

    public final int a() {
        return 0;
    }

    public final amwi a(float f) {
        amqw.a(f > 0.0f);
        if (f == ((Float) this.b.a()).floatValue()) {
            return this.b;
        }
        if (f >= 1.777f) {
            return a;
        }
        this.b = amwi.a(Float.valueOf(f), Float.valueOf(1.777f));
        return this.b;
    }

    static {
        Comparable valueOf = Float.valueOf(1.777f);
        a = amwi.a(valueOf, valueOf);
    }
}
