package defpackage;

/* renamed from: lvt */
public final class lvt extends ekk implements xcp {
    private final xci a;
    private final bcaa b;
    private boolean c;

    public lvt(elm elm, xci xci, bcaa bcaa) {
        super(elm);
        this.a = xci;
        this.b = bcaa;
    }

    public final void A_() {
        this.a.a((Object) this);
    }

    public final void ar_() {
        this.a.b(this);
    }

    public final Class[] a(Class cls, Object obj, int i) {
        Class[] clsArr = null;
        if (i == -1) {
            clsArr = new Class[]{wuu.class, wux.class};
        } else if (i == 0) {
            if (this.c) {
                ((aizy) this.b.get()).a();
            }
            this.c = false;
        } else if (i == 1) {
            boolean c = ((aizy) this.b.get()).c();
            this.c = c;
            if (c) {
                ((aizy) this.b.get()).b();
                return null;
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
