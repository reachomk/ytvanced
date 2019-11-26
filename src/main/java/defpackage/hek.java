package defpackage;

/* renamed from: hek */
public final class hek extends aife implements xcp {
    private final adqf a;

    public hek(adqf adqf, aizy aizy, aifc aifc) {
        super(aizy, aifc);
        this.a = adqf;
    }

    public final void a() {
        adqe c = this.a.c();
        if (c != null) {
            c.m();
        } else {
            super.a();
        }
    }

    public final void b() {
        adqe c = this.a.c();
        if (c != null) {
            c.n();
        } else {
            super.b();
        }
    }

    public final Class[] a(Class cls, Object obj, int i) {
        if (cls != hek.class) {
            return aifa.a(this, obj, i);
        }
        Class[] clsArr;
        if (i == -1) {
            clsArr = new Class[]{ahkc.class};
        } else if (i == 0) {
            c();
            clsArr = null;
        } else {
            StringBuilder stringBuilder = new StringBuilder(32);
            stringBuilder.append("unsupported op code: ");
            stringBuilder.append(i);
            throw new IllegalStateException(stringBuilder.toString());
        }
        return clsArr;
    }
}
