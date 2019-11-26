package defpackage;

/* renamed from: ump */
public final class ump extends nnj {
    private long a;
    private final /* synthetic */ umo b;

    /* Access modifiers changed, original: protected|final */
    public final nmx a(int i) {
        return nmx.a(null, "application/octet-stream", -2);
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean a() {
        return true;
    }

    /* Access modifiers changed, original: protected|final */
    public final int b() {
        return 1;
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean d() {
        return true;
    }

    /* Access modifiers changed, original: protected|final */
    public final void e() {
    }

    /* Access modifiers changed, original: protected|final */
    public final long f() {
        return -2;
    }

    /* Access modifiers changed, original: protected|final */
    public final long g() {
        return -3;
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean c() {
        return this.a >= this.b.f() * 1000;
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(int i, long j, boolean z) {
        this.a = j;
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(long j, long j2) {
        this.a = j;
        umo umo = this.b;
        if (umo.e != null) {
            if (this.i == 3 && j >= umo.f() * 1000) {
                this.b.e.a(false);
            }
            if (this.b.e.d()) {
                umo umo2 = this.b;
                umo2.post(umo2.a);
            }
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(long j) {
        this.a = j;
        umo umo = this.b;
        umo.post(umo.a);
    }

    public /* synthetic */ ump(umo umo) {
        this.b = umo;
    }
}
