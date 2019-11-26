package defpackage;

/* renamed from: ahp */
final class ahp {
    private static ahp i;
    private static final Object j = new Object();
    public ahp a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public Object h;

    ahp() {
    }

    /* Access modifiers changed, original: final */
    public final void a() {
        this.a = null;
        this.g = 0;
        this.f = 0;
        this.e = 0;
        this.d = 0;
        this.c = 0;
        this.b = 0;
        this.h = null;
        synchronized (j) {
            if (i != null) {
                this.a = i;
            }
            i = this;
        }
    }

    static ahp a(int i, int i2, int i3, int i4, int i5, int i6, Object obj) {
        ahp ahp;
        synchronized (j) {
            if (i == null) {
                ahp = new ahp();
            } else {
                ahp = i;
                i = i.a;
                ahp.a = null;
            }
            ahp.b = i;
            ahp.c = i2;
            ahp.d = i3;
            ahp.e = i4;
            ahp.f = i5;
            ahp.g = i6;
            ahp.h = obj;
        }
        return ahp;
    }

    static ahp a(int i, int i2, int i3) {
        return ahp.a(i, i2, i3, 0, 0, 0, null);
    }

    static ahp a(int i, int i2, Object obj) {
        return ahp.a(i, i2, 0, 0, 0, 0, obj);
    }
}
