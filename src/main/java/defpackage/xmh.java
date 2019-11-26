package defpackage;

/* renamed from: xmh */
public final class xmh extends xmf implements xcp {
    public static final String e = xmh.class.getCanonicalName();
    private final xhv f;

    public xmh(xci xci, xhv xhv) {
        super(xci);
        this.f = (xhv) amqw.a((Object) xhv);
        xci.a((Object) this);
    }

    public final void c() {
    }

    public final boolean a() {
        amqw.b(this.b ^ 1);
        return this.f.c();
    }

    public final Class[] a(Class cls, Object obj, int i) {
        Class[] clsArr = null;
        if (i == -1) {
            clsArr = new Class[]{xgg.class};
        } else if (i != 0) {
            StringBuilder stringBuilder = new StringBuilder(32);
            stringBuilder.append("unsupported op code: ");
            stringBuilder.append(i);
            throw new IllegalStateException(stringBuilder.toString());
        } else if (((xgg) obj).a) {
            this.d.c(new xmi());
            return null;
        }
        return clsArr;
    }
}
