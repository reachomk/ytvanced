package defpackage;

/* renamed from: qok */
public final class qok extends rio {
    public Integer a;

    public qok() {
        this.W = -1;
    }

    public final void a(rim rim) {
        Integer num = this.a;
        if (num != null) {
            rim.a(27, num.intValue());
        }
        super.a(rim);
    }

    /* Access modifiers changed, original: protected|final */
    public final int a() {
        int a = super.a();
        Integer num = this.a;
        return num != null ? a + rim.b(27, num.intValue()) : a;
    }
}
