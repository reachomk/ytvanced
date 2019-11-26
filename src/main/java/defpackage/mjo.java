package defpackage;

/* renamed from: mjo */
public final class mjo implements ejc, fjk {
    public final lyl a;
    public int b;
    public boolean c;
    private fiw d;
    private ejd e;

    public mjo(lyl lyl) {
        this.a = lyl;
    }

    private final void a() {
        fiw fiw = this.d;
        if (fiw != null) {
            int f = gub.f(fiw) ^ 1;
            ejd ejd = this.e;
            if ((ejd == null || !(ejd.b() || this.e == ejd.INLINE_FULLSCREEN)) && f == 0) {
                this.a.getWindow().setSoftInputMode(48);
                this.c = false;
            } else {
                if (!this.c) {
                    this.a.getWindow().setSoftInputMode(this.b);
                }
            }
        }
    }

    public final void a(ejd ejd, ejd ejd2) {
        this.e = ejd2;
        a();
    }

    public final void a(fja fja) {
        this.d = fiw.a(fja);
        a();
    }
}
