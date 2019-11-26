package defpackage;

/* renamed from: nys */
public abstract class nys implements oal, oao {
    public oan a;
    public int b;
    public int c;
    public nzw[] d;
    private final int e;
    private opr f;
    private long g;
    private long h = Long.MIN_VALUE;
    private boolean i;

    public nys(int i) {
        this.e = i;
    }

    public void a(float f) {
    }

    public void a(int i, Object obj) {
    }

    /* Access modifiers changed, original: protected */
    public void a(long j, boolean z) {
    }

    /* Access modifiers changed, original: protected */
    public void a(boolean z) {
    }

    /* Access modifiers changed, original: protected */
    public void a(nzw[] nzwArr, long j) {
    }

    public final oao b() {
        return this;
    }

    public oyr c() {
        return null;
    }

    public int o() {
        return 0;
    }

    /* Access modifiers changed, original: protected */
    public void p() {
    }

    /* Access modifiers changed, original: protected */
    public void q() {
    }

    /* Access modifiers changed, original: protected */
    public void r() {
    }

    /* Access modifiers changed, original: protected */
    public void s() {
    }

    public final int a() {
        return this.e;
    }

    public final void a(int i) {
        this.b = i;
    }

    public final int d() {
        return this.c;
    }

    public final void a(oan oan, nzw[] nzwArr, opr opr, long j, boolean z, long j2) {
        oxz.b(this.c == 0);
        this.a = oan;
        this.c = 1;
        a(z);
        a(nzwArr, opr, j2);
        a(j, z);
    }

    public final void e() {
        boolean z = true;
        if (this.c != 1) {
            z = false;
        }
        oxz.b(z);
        this.c = 2;
        p();
    }

    public final void a(nzw[] nzwArr, opr opr, long j) {
        oxz.b(this.i ^ 1);
        this.f = opr;
        this.h = j;
        this.d = nzwArr;
        this.g = j;
        a(nzwArr, j);
    }

    public final opr f() {
        return this.f;
    }

    public final boolean g() {
        return this.h == Long.MIN_VALUE;
    }

    public final long h() {
        return this.h;
    }

    public final void i() {
        this.i = true;
    }

    public final boolean j() {
        return this.i;
    }

    public final void k() {
        this.f.b();
    }

    public final void a(long j) {
        this.i = false;
        this.h = j;
        a(j, false);
    }

    public final void l() {
        oxz.b(this.c == 2);
        this.c = 1;
        q();
    }

    public final void m() {
        boolean z = true;
        if (this.c != 1) {
            z = false;
        }
        oxz.b(z);
        this.c = 0;
        this.f = null;
        this.d = null;
        this.i = false;
        r();
    }

    public final void n() {
        oxz.b(this.c == 0);
        s();
    }

    /* Access modifiers changed, original: protected|final */
    public final int a(nzy nzy, odj odj, boolean z) {
        int a = this.f.a(nzy, odj, z);
        if (a == -4) {
            if (odj.isEndOfStream()) {
                this.h = Long.MIN_VALUE;
                if (this.i) {
                    return -4;
                }
                return -3;
            }
            long j = odj.c + this.g;
            odj.c = j;
            this.h = Math.max(this.h, j);
        } else if (a == -5) {
            nzw nzw = nzy.a;
            long j2 = nzw.m;
            if (j2 != Long.MAX_VALUE) {
                nzy.a = nzw.a(j2 + this.g);
                return -5;
            }
        }
        return a;
    }

    /* Access modifiers changed, original: protected|final */
    public final int b(long j) {
        return this.f.c_(j - this.g);
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean t() {
        return !g() ? this.f.a() : this.i;
    }

    protected static boolean a(odw odw, odq odq) {
        if (odq == null) {
            return true;
        }
        return odw != null ? odw.a(odq) : false;
    }
}
