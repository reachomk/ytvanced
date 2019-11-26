package defpackage;

/* renamed from: qpn */
public final class qpn extends rio {
    public Long a;
    private String b;
    private byte[] c;

    public qpn() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.W = -1;
    }

    public final void a(rim rim) {
        Long l = this.a;
        if (l != null) {
            rim.a(1, l.longValue());
        }
        String str = this.b;
        if (str != null) {
            rim.a(3, str);
        }
        byte[] bArr = this.c;
        if (bArr != null) {
            rim.a(4, bArr);
        }
        super.a(rim);
    }

    /* Access modifiers changed, original: protected|final */
    public final int a() {
        int a = super.a();
        Long l = this.a;
        if (l != null) {
            a += rim.b(1, l.longValue());
        }
        String str = this.b;
        if (str != null) {
            a += rim.b(3, str);
        }
        byte[] bArr = this.c;
        return bArr != null ? a + rim.b(4, bArr) : a;
    }
}
