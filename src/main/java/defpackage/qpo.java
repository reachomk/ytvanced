package defpackage;

/* renamed from: qpo */
public final class qpo extends rio {
    public byte[] a;
    public byte[] b;
    public byte[] c;
    public byte[] d;

    public qpo() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
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
        bArr = this.c;
        if (bArr != null) {
            rim.a(3, bArr);
        }
        bArr = this.d;
        if (bArr != null) {
            rim.a(4, bArr);
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
        if (bArr != null) {
            a += rim.b(2, bArr);
        }
        bArr = this.c;
        if (bArr != null) {
            a += rim.b(3, bArr);
        }
        bArr = this.d;
        return bArr != null ? a + rim.b(4, bArr) : a;
    }
}
