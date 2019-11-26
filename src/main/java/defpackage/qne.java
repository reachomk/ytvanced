package defpackage;

/* renamed from: qne */
public final class qne extends rio {
    public static volatile qne[] a;
    private qna b;
    private String c;
    private String d;
    private String e;
    private Boolean f;
    private Boolean g;
    private Integer h;
    private String i;
    private Boolean j;
    private String k;
    private Boolean l;

    public qne() {
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = null;
        this.i = null;
        this.j = null;
        this.k = null;
        this.l = null;
        this.V = null;
        this.W = -1;
    }

    public final void a(rim rim) {
        qna qna = this.b;
        if (qna != null) {
            rim.a(1, qna.a);
        }
        String str = this.c;
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
        Boolean bool = this.f;
        if (bool != null) {
            rim.a(5, bool.booleanValue());
        }
        bool = this.g;
        if (bool != null) {
            rim.a(6, bool.booleanValue());
        }
        Integer num = this.h;
        if (num != null) {
            rim.a(7, num.intValue());
        }
        str = this.i;
        if (str != null) {
            rim.a(8, str);
        }
        bool = this.j;
        if (bool != null) {
            rim.a(9, bool.booleanValue());
        }
        str = this.k;
        if (str != null) {
            rim.a(10, str);
        }
        bool = this.l;
        if (bool != null) {
            rim.a(11, bool.booleanValue());
        }
        super.a(rim);
    }

    /* Access modifiers changed, original: protected|final */
    public final int a() {
        int a = super.a();
        qna qna = this.b;
        if (qna != null) {
            a += rim.b(1, qna.a);
        }
        String str = this.c;
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
        Boolean bool = this.f;
        if (bool != null) {
            bool.booleanValue();
            a += rim.b(5) + 1;
        }
        bool = this.g;
        if (bool != null) {
            bool.booleanValue();
            a += rim.b(6) + 1;
        }
        Integer num = this.h;
        if (num != null) {
            a += rim.b(7, num.intValue());
        }
        str = this.i;
        if (str != null) {
            a += rim.b(8, str);
        }
        bool = this.j;
        if (bool != null) {
            bool.booleanValue();
            a += rim.b(9) + 1;
        }
        str = this.k;
        if (str != null) {
            a += rim.b(10, str);
        }
        bool = this.l;
        if (bool == null) {
            return a;
        }
        bool.booleanValue();
        return a + (rim.b(11) + 1);
    }
}
