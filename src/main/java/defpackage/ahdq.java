package defpackage;

/* renamed from: ahdq */
public final class ahdq implements ahdy {
    private final ahdp a;
    private final ahdr b;

    public ahdq() {
        this.a = new ahdp();
        this.b = ahdp.c();
    }

    public ahdq(boolean z) {
        this.a = new ahdp(z);
        this.b = ahdp.a(z);
    }

    public final void a(byte[] bArr, int i) {
        int i2 = 0;
        while (i > 0) {
            int min = Math.min(i, 4096 - this.b.b());
            this.b.a(bArr, i2, min);
            if (this.b.b() == 4096) {
                this.a.a(this.b.c());
                this.b.a();
            }
            i2 += min;
            i -= min;
        }
    }

    public final byte[] a() {
        if (this.b.b() != 0) {
            this.a.a(this.b.c());
        }
        return this.a.b();
    }
}
