package defpackage;

/* renamed from: qom */
public final class qom extends rio {
    public String a;
    public String b;
    private String c;
    private String d;
    private String e;
    private String f;

    public qom() {
        this.a = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.b = null;
        this.W = -1;
    }

    public final void a(rim rim) {
        String str = this.a;
        if (str != null) {
            rim.a(1, str);
        }
        str = this.c;
        if (str != null) {
            rim.a(2, str);
        }
        str = this.d;
        if (str != null) {
            rim.a(3, str);
        }
        str = this.e;
        if (str != null) {
            rim.a(4, str);
        }
        str = this.f;
        if (str != null) {
            rim.a(5, str);
        }
        str = this.b;
        if (str != null) {
            rim.a(6, str);
        }
        super.a(rim);
    }

    /* Access modifiers changed, original: protected|final */
    public final int a() {
        int a = super.a();
        String str = this.a;
        if (str != null) {
            a += rim.b(1, str);
        }
        str = this.c;
        if (str != null) {
            a += rim.b(2, str);
        }
        str = this.d;
        if (str != null) {
            a += rim.b(3, str);
        }
        str = this.e;
        if (str != null) {
            a += rim.b(4, str);
        }
        str = this.f;
        if (str != null) {
            a += rim.b(5, str);
        }
        str = this.b;
        return str != null ? a + rim.b(6, str) : a;
    }
}
