package defpackage;

/* renamed from: qnd */
public final class qnd extends rio {
    public static volatile qnd[] a;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public Boolean g;
    public Boolean h;
    public Integer i;
    private qnc j;

    public qnd() {
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = null;
        this.i = null;
        this.j = null;
        this.V = null;
        this.W = -1;
    }

    public final void a(rim rim) {
        String str = this.b;
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
        Boolean bool = this.g;
        if (bool != null) {
            rim.a(6, bool.booleanValue());
        }
        bool = this.h;
        if (bool != null) {
            rim.a(7, bool.booleanValue());
        }
        Integer num = this.i;
        if (num != null) {
            rim.a(8, num.intValue());
        }
        qnc qnc = this.j;
        if (qnc != null) {
            rim.a(9, qnc.a);
        }
        super.a(rim);
    }

    /* Access modifiers changed, original: protected|final */
    public final int a() {
        int a = super.a();
        String str = this.b;
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
        Boolean bool = this.g;
        if (bool != null) {
            bool.booleanValue();
            a += rim.b(6) + 1;
        }
        bool = this.h;
        if (bool != null) {
            bool.booleanValue();
            a += rim.b(7) + 1;
        }
        Integer num = this.i;
        if (num != null) {
            a += rim.b(8, num.intValue());
        }
        qnc qnc = this.j;
        if (qnc == null) {
            return a;
        }
        return a + rim.b(9, qnc.a);
    }
}
