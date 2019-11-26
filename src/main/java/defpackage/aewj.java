package defpackage;

/* renamed from: aewj */
public final class aewj extends aewi {
    private final afjj b;
    private final long c;
    private boolean d = false;
    private boolean e = false;
    private boolean f = false;
    private boolean g = false;
    private final int h;

    public final void a() {
        if (!this.d) {
            this.d = true;
            if (this.h == 2) {
                this.b.a.a(new aeji());
            } else {
                this.b.a.a(new aegk());
            }
        }
    }

    public final void b() {
        if (!this.e) {
            this.e = true;
            if (this.h == 2) {
                this.b.a.a(new aejh());
            } else {
                this.b.a.a(new aegj());
            }
        }
    }

    public final void a(long j) {
        if (j >= this.c / 2 && !this.f) {
            this.f = true;
            if (this.h == 2) {
                this.b.g();
            } else {
                this.b.i();
            }
        }
        if (j >= this.c && !this.g) {
            this.g = true;
            if (this.h == 2) {
                this.b.h();
            } else {
                this.b.j();
            }
        }
    }

    public aewj(afjj afjj, int i, long j) {
        this.b = afjj;
        this.h = i;
        this.c = j;
    }
}
