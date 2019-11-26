package defpackage;

/* renamed from: aebg */
public final class aebg implements aebe, xcp {
    private final afpu a;
    private final afqa b;
    private final xci c;

    public aebg(afpu afpu, afqa afqa, xci xci) {
        this.a = (afpu) amqw.a((Object) afpu);
        this.b = (afqa) amqw.a((Object) afqa);
        this.c = (xci) amqw.a((Object) xci);
    }

    private final boolean c() {
        return this.a.a();
    }

    public final String a() {
        if (c() && this.b != null) {
            afpt c = this.a.c();
            afpz b = this.b.a(c).b(c);
            if (b.a()) {
                return b.c();
            }
        }
        return null;
    }

    public final String b() {
        return c() ? this.a.c().c() : null;
    }

    public final Class[] a(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{afqf.class, afqh.class};
        } else if (i == 0) {
            this.c.d(aebb.a);
            return null;
        } else if (i == 1) {
            this.c.d(aebb.a);
            return null;
        } else {
            StringBuilder stringBuilder = new StringBuilder(32);
            stringBuilder.append("unsupported op code: ");
            stringBuilder.append(i);
            throw new IllegalStateException(stringBuilder.toString());
        }
    }

    static {
        xtl.b("MDX.user");
    }
}
