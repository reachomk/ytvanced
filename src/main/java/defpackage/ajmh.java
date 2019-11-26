package defpackage;

/* renamed from: ajmh */
public final class ajmh extends ajps {
    private final bapu a;
    private final aajk b;
    private final xsc c;
    private long d = -1;
    private float e = 1.0f;
    private boolean f = false;
    private boolean g = false;

    public ajmh(bapu bapu, aajk aajk, xsc xsc) {
        this.a = bapu;
        this.b = aajk;
        this.c = xsc;
    }

    public final void a_(ahjd ahjd) {
        if (!this.f) {
            this.e = ahjd.b;
        }
    }

    public final void a(ahkn ahkn) {
        int ordinal = ahkn.a.ordinal();
        if (ordinal == 2) {
            boolean z = ahkn.h;
            this.g = z;
            if (z && this.e > 1.0f) {
                b();
            }
            ((ajmk) this.a.get()).b(this.e);
        } else if (ordinal == 4) {
            this.f = true;
        } else if (ordinal != 7) {
            if (ordinal == 9) {
                e();
            }
        } else {
            this.f = false;
        }
    }

    public final void b(String str) {
        e();
    }

    public final void a(ahkr ahkr) {
        int i = ahkr.a;
        if (i != 3) {
            if (i == 2) {
                long b = this.c.b();
                awdg awdg = ((aajj) this.b.get()).c;
                if ((awdg.b & 1) != 0) {
                    aywv aywv = awdg.t;
                    if (aywv == null) {
                        aywv = aywv.f;
                    }
                    i = aywv.c;
                } else {
                    i = 0;
                }
                i *= 1000;
                long j = this.d;
                if (j != -1 && i > 0 && b - j > ((long) i)) {
                    this.e = 1.0f;
                }
                this.d = -1;
                ((ajmk) this.a.get()).b(this.e);
            }
            return;
        }
        e();
    }

    public final void a(ahkm ahkm) {
        long j = ahkm.a;
        if (ahkm.g && this.g) {
            float f = this.e;
            if ((f > 1.0f && ahkm.d - j < 500) || (f < 1.0f && j - ahkm.c < 500)) {
                b();
                ((ajmk) this.a.get()).b(this.e);
            }
        }
    }

    private final void e() {
        this.d = this.c.b();
    }

    public final void b() {
        this.d = -1;
        this.e = 1.0f;
    }
}
