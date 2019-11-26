package defpackage;

/* renamed from: fsw */
public final class fsw implements yfg, zcj {
    private final akpb a = new aknw();
    private final bcaa b;
    private final bcaa c;
    private final bcaa d;

    public fsw(bcaa bcaa, bcaa bcaa2, bcaa bcaa3) {
        this.b = bcaa;
        this.c = bcaa2;
        this.d = bcaa3;
    }

    public final void b(Class cls) {
        if (ajts.class.isAssignableFrom(cls)) {
            ((fsz) this.b.get()).a(this.a);
        }
    }

    public final void a(Class cls) {
        if (aqml.class.isAssignableFrom(cls)) {
            ((fsy) this.c.get()).a(this.a);
        } else if (awzr.class.isAssignableFrom(cls)) {
            ((ftb) this.d.get()).a(this.a);
        }
    }

    public final /* bridge */ /* synthetic */ Object get() {
        return this.a;
    }
}
