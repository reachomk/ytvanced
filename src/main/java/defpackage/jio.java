package defpackage;

/* renamed from: jio */
public final class jio extends akvm implements xcp {
    private final xci a;
    private final akao b;
    private final jje c;

    public jio(akvz akvz, xci xci, akdk akdk, amqp amqp, akao akao, ajwd ajwd, akvj akvj, akyd akyd) {
        xci xci2 = xci;
        akyd akyd2 = akyd;
        super(akvz, xci, akao, ajwd, akvj, akdk, akyd.a(akyd), amqp);
        this.a = xci2;
        this.b = akao;
        if (akyd2 instanceof jin) {
            this.c = new jje(((jin) akyd2).a);
        } else {
            this.c = new jje();
        }
        xci.a((Object) this, jio.class);
    }

    public final akyd E_() {
        return new jin(super.E_(), this.c.E_());
    }

    public final void c() {
        super.c();
        this.a.b(this);
    }

    public final Class[] a(Class cls, Object obj, int i) {
        if (cls != jio.class) {
            return akuj.a((akty) this, obj, i);
        }
        Class[] clsArr = null;
        if (i == -1) {
            clsArr = new Class[]{gzx.class, aaxc.class, akwd.class};
        } else if (i == 0) {
            gzx gzx = (gzx) obj;
            if (gzx.a() != null) {
                this.c.a(gzx.a(), gzx.d);
                a(gzx.d, gzx.a());
                return null;
            }
        } else if (i == 1) {
            aaxc aaxc = (aaxc) obj;
            if (this.b.equals(aaxc.c)) {
                a(true);
            } else {
                amqp a;
                amqp c = amqp.c(aaxc.b);
                if (c.a()) {
                    a = this.c.a(c.b());
                } else {
                    a = ampo.a;
                }
                if (c.a() && a.a()) {
                    a(c.b(), a.b());
                    return null;
                }
            }
        } else if (i == 2) {
            a(((akwd) obj).a);
        } else {
            StringBuilder stringBuilder = new StringBuilder(32);
            stringBuilder.append("unsupported op code: ");
            stringBuilder.append(i);
            throw new IllegalStateException(stringBuilder.toString());
        }
        return clsArr;
    }
}
