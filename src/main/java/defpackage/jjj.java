package defpackage;

/* renamed from: jjj */
public final class jjj extends akye implements xcp {
    private final xci a;

    public jjj(akvz akvz, xci xci, akdk akdk, akao akao, akbp akbp, akyd akyd, akoq akoq) {
        super(akvz, xci, akao, akbp, akdk, akyd);
        this.a = xci;
        if (akoq != null) {
            this.e.a(akoq);
        }
        xci.a((Object) this, jjj.class);
    }

    public final void c() {
        super.c();
        this.a.b(this);
    }

    /* Access modifiers changed, original: protected|final */
    public final void e() {
        super.e();
        a(new jji());
    }

    /* Access modifiers changed, original: protected|final */
    public final void f() {
        arbw arbw = this.d.o;
        if (arbw != null) {
            this.f.add(0, new kes(arbw));
            this.h.add(new kes(this.d.o));
            return;
        }
        this.h.clear();
    }

    public final Class[] a(Class cls, Object obj, int i) {
        if (cls != jjj.class) {
            return akuj.a((akty) this, obj, i);
        }
        Class[] clsArr = null;
        if (i == -1) {
            clsArr = new Class[]{fkw.class};
        } else if (i == 0) {
            String str = ((fkw) obj).a;
            for (Object next : this.l) {
                if ((next instanceof aqfs) && str.equals(((aqfs) next).b)) {
                    a(next);
                    break;
                }
            }
        } else {
            StringBuilder stringBuilder = new StringBuilder(32);
            stringBuilder.append("unsupported op code: ");
            stringBuilder.append(i);
            throw new IllegalStateException(stringBuilder.toString());
        }
        return clsArr;
    }
}
