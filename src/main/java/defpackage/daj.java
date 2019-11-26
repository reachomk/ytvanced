package defpackage;

/* renamed from: daj */
final class daj implements dbv {
    private final /* synthetic */ int a;
    private final /* synthetic */ int b;
    private final /* synthetic */ int c;
    private final /* synthetic */ dad d;

    daj(dad dad, int i, int i2, int i3) {
        this.d = dad;
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public final boolean a(int i) {
        boolean z;
        dad dad = this.d;
        int i2 = this.a;
        int i3 = this.b;
        int i4 = this.c;
        synchronized (dad) {
            z = true;
            if (i4 != dad.b.size()) {
                z = false;
            } else {
                cyl cyl = (cyl) dad.b.get(i);
                if (cyl.e().f()) {
                } else {
                    int b = dad.b(cyl);
                    int c = dad.c(cyl);
                    if (i >= i2 && i <= i3) {
                        if (!cyl.a(b, c)) {
                            cyl.a(dad.g, b, c);
                            return true;
                        }
                    } else if (cro.a()) {
                        dad.a(cyl);
                    } else {
                        dad.i.post(new dam(cyl));
                    }
                }
            }
        }
        return z;
    }
}
