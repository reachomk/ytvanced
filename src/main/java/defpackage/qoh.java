package defpackage;

/* renamed from: qoh */
public final class qoh extends rio {
    public qok a;
    public qom b;

    public qoh() {
        this.a = null;
        this.b = null;
        this.W = -1;
    }

    public final void a(rim rim) {
        riu riu = this.a;
        if (riu != null) {
            rim.a(1, riu);
        }
        riu = this.b;
        if (riu != null) {
            rim.a(2, riu);
        }
        super.a(rim);
    }

    /* Access modifiers changed, original: protected|final */
    public final int a() {
        int a = super.a();
        riu riu = this.a;
        if (riu != null) {
            a += rim.b(1, riu);
        }
        riu = this.b;
        return riu != null ? a + rim.b(2, riu) : a;
    }
}
