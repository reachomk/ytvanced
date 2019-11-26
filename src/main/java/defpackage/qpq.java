package defpackage;

/* renamed from: qpq */
public final class qpq extends rio {
    public String a;

    public qpq() {
        this.a = null;
        this.W = -1;
    }

    public final void a(rim rim) {
        String str = this.a;
        if (str != null) {
            rim.a(1, str);
        }
        super.a(rim);
    }

    /* Access modifiers changed, original: protected|final */
    public final int a() {
        int a = super.a();
        String str = this.a;
        return str != null ? a + rim.b(1, str) : a;
    }
}
