package defpackage;

/* renamed from: qns */
public final class qns extends rio {
    public String a;
    public Long b;
    private String c;
    private String d;
    private String e;
    private Long f;
    private Long g;
    private String h;
    private Long i;
    private String j;

    public qns() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = null;
        this.i = null;
        this.j = null;
        this.W = -1;
    }

    public final void a(rim rim) {
        String str = this.a;
        if (str != null) {
            rim.a(1, str);
        }
        Long l = this.b;
        if (l != null) {
            rim.a(2, l.longValue());
        }
        str = this.c;
        if (str != null) {
            rim.a(3, str);
        }
        str = this.d;
        if (str != null) {
            rim.a(4, str);
        }
        str = this.e;
        if (str != null) {
            rim.a(5, str);
        }
        l = this.f;
        if (l != null) {
            rim.a(6, l.longValue());
        }
        l = this.g;
        if (l != null) {
            rim.a(7, l.longValue());
        }
        str = this.h;
        if (str != null) {
            rim.a(8, str);
        }
        l = this.i;
        if (l != null) {
            rim.a(9, l.longValue());
        }
        str = this.j;
        if (str != null) {
            rim.a(10, str);
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
        Long l = this.b;
        if (l != null) {
            a += rim.b(2, l.longValue());
        }
        str = this.c;
        if (str != null) {
            a += rim.b(3, str);
        }
        str = this.d;
        if (str != null) {
            a += rim.b(4, str);
        }
        str = this.e;
        if (str != null) {
            a += rim.b(5, str);
        }
        l = this.f;
        if (l != null) {
            a += rim.b(6, l.longValue());
        }
        l = this.g;
        if (l != null) {
            a += rim.b(7, l.longValue());
        }
        str = this.h;
        if (str != null) {
            a += rim.b(8, str);
        }
        l = this.i;
        if (l != null) {
            a += rim.b(9, l.longValue());
        }
        str = this.j;
        return str != null ? a + rim.b(10, str) : a;
    }
}
