package defpackage;

/* renamed from: oxv */
public final class oxv implements ovg {
    private final ovg a;
    private final byte[] b;
    private final byte[] c;
    private oxx d;

    public oxv(byte[] bArr, ovg ovg, byte[] bArr2) {
        this.a = ovg;
        this.b = bArr;
        this.c = bArr2;
    }

    public final void a(ovm ovm) {
        this.a.a(ovm);
        this.d = new oxx(1, this.b, oya.a(ovm.g), ovm.d);
    }

    public final void a(byte[] bArr, int i, int i2) {
        if (this.c == null) {
            this.d.a(bArr, i, i2, bArr, i);
            this.a.a(bArr, i, i2);
            return;
        }
        int i3 = 0;
        while (i3 < i2) {
            int min = Math.min(i2 - i3, this.c.length);
            this.d.a(bArr, i + i3, min, this.c, 0);
            this.a.a(this.c, 0, min);
            i3 += min;
        }
    }

    public final void a() {
        this.d = null;
        this.a.a();
    }
}
