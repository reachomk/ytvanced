package defpackage;

/* renamed from: elu */
public final class elu implements ahun, ejc, xcp {
    private final elt[] a = new elt[3];
    private boolean b;
    private boolean c;
    private boolean d;

    public elu() {
        for (int i = 0; i < 3; i++) {
            this.a[i] = new elt();
        }
    }

    public final void a(int i, elw elw) {
        if (elw != null) {
            elt elt = this.a[i];
            elt.a.add(elw);
            elw.a(elt.b);
            a();
        }
    }

    public final void a(ejd ejd, ejd ejd2) {
        boolean z = true;
        if (!(ejd2.f() || ejd2.n())) {
            z = false;
        }
        this.c = z;
        a();
    }

    public final void a(boolean z) {
        this.d = z;
        a();
    }

    private final void a() {
        if (this.c) {
            this.a[0].a(true);
            this.a[1].a(false);
            this.a[2].a(false);
            return;
        }
        int i = (this.b || !this.d) ? 0 : 1;
        int i2 = i ^ 1;
        this.a[0].a(i2);
        this.a[1].a(i2);
        this.a[2].a(i);
    }

    public final Class[] a(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{ahkk.class};
        } else if (i == 0) {
            this.b = ((ahkk) obj).a;
            a();
            return null;
        } else {
            StringBuilder stringBuilder = new StringBuilder(32);
            stringBuilder.append("unsupported op code: ");
            stringBuilder.append(i);
            throw new IllegalStateException(stringBuilder.toString());
        }
    }
}
