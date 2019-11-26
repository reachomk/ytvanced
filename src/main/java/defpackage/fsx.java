package defpackage;

/* renamed from: fsx */
public final class fsx implements fgt {
    private final fgc a;
    private final fjz b;
    private boolean c;
    private boolean d;
    private Object e;

    public fsx(fgc fgc, fjz fjz) {
        this.a = fgc;
        this.b = fjz;
    }

    public final void a(ffu ffu, int i, int i2) {
        if (i2 == 3) {
            b(true);
        } else if (i == 3) {
            b(false);
        }
    }

    public final void a() {
        this.a.a((fgt) this);
    }

    public final void b() {
        this.a.b((fgt) this);
    }

    public final void a(boolean z) {
        this.c = z;
        c();
    }

    private final void b(boolean z) {
        this.d = z;
        c();
    }

    private final void c() {
        if (!this.c || this.d) {
            Object obj = this.e;
            if (obj != null) {
                this.b.a(obj);
                this.e = null;
            }
            return;
        }
        if (this.e == null) {
            this.e = this.b.a();
        }
    }
}
