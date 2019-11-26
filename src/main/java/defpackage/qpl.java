package defpackage;

/* renamed from: qpl */
public final class qpl extends rio {
    public byte[] a;
    public byte[] b;

    public qpl() {
        this.a = null;
        this.b = null;
        this.W = -1;
    }

    public final void a(rim rim) {
        byte[] bArr = this.a;
        if (bArr != null) {
            rim.a(1, bArr);
        }
        bArr = this.b;
        if (bArr != null) {
            rim.a(2, bArr);
        }
        super.a(rim);
    }

    /* Access modifiers changed, original: protected|final */
    public final int a() {
        int a = super.a();
        byte[] bArr = this.a;
        if (bArr != null) {
            a += rim.b(1, bArr);
        }
        bArr = this.b;
        return bArr != null ? a + rim.b(2, bArr) : a;
    }
}
