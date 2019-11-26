package defpackage;

/* renamed from: mko */
public final class mko implements xcp {
    public final mlg a;
    public final xci b;
    public final xhv c;
    public final aizy d;
    public boolean e;
    public boolean f;
    public bcuo g;

    public mko(mlg mlg, xci xci, xhv xhv, aizy aizy) {
        this.a = mlg;
        this.b = xci;
        this.c = xhv;
        this.d = aizy;
    }

    public final Class[] a(Class cls, Object obj, int i) {
        Class[] clsArr = null;
        if (i == -1) {
            clsArr = new Class[]{xgg.class, ahkr.class};
        } else if (i != 0) {
            if (i != 1) {
                StringBuilder stringBuilder = new StringBuilder(32);
                stringBuilder.append("unsupported op code: ");
                stringBuilder.append(i);
                throw new IllegalStateException(stringBuilder.toString());
            } else if (((ahkr) obj).a == 2 && this.c.c()) {
                this.a.c();
                this.f = false;
            } else {
                this.a.d();
            }
        } else if (!((xgg) obj).a) {
            this.a.d();
        } else if (this.d.c()) {
            this.a.c();
            return null;
        }
        return clsArr;
    }
}
