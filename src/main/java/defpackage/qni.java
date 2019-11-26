package defpackage;

/* renamed from: qni */
public final class qni extends rio {
    public static volatile qni[] a;
    public Integer b;
    public String c;
    private String d;

    public qni() {
        this.d = null;
        this.b = null;
        this.c = null;
        this.V = null;
        this.W = -1;
    }

    public final void a(rim rim) {
        String str = this.d;
        if (str != null) {
            rim.a(1, str);
        }
        Integer num = this.b;
        if (num != null) {
            rim.a(2, num.intValue());
        }
        str = this.c;
        if (str != null) {
            rim.a(3, str);
        }
        super.a(rim);
    }

    /* Access modifiers changed, original: protected|final */
    public final int a() {
        int a = super.a();
        String str = this.d;
        if (str != null) {
            a += rim.b(1, str);
        }
        Integer num = this.b;
        if (num != null) {
            a += rim.b(2, num.intValue());
        }
        str = this.c;
        return str != null ? a + rim.b(3, str) : a;
    }
}
