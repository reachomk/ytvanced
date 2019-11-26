package defpackage;

/* renamed from: afal */
public final class afal {
    private static final oav d = new oav();
    public int a;
    public boolean b;
    public boolean c;
    private final afaj e;

    afal(afaj afaj) {
        this.e = afaj;
    }

    public final void a(obb obb, boolean z, int i) {
        long j;
        afgp b = this.e.b();
        if (obb.b.c()) {
            j = -9223372036854775807L;
        } else {
            obb.b.a(obb.c, d);
            j = nyr.a(d.j);
        }
        j = afan.a(j, obb.d);
        afaj afaj;
        if (i == 2) {
            if (z) {
                this.e.c.g();
            } else {
                this.e.c.h();
            }
            if (b.b(j)) {
                afaj = this.e;
                afaj.f.c(afaj);
            }
        } else if (i != 3) {
            if (i == 4) {
                this.e.c.f();
                this.e.f.y();
            }
        } else if (!z) {
            this.e.c.d();
            b.d();
        } else if (b.a(j)) {
            afaj = this.e;
            afaj.f.c(afaj);
        } else {
            this.e.c.c();
        }
    }
}
