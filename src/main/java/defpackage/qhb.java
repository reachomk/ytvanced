package defpackage;

/* renamed from: qhb */
public final class qhb extends rio {
    private int A;
    private String B;
    private int C;
    private long D;
    private int E;
    private int F;
    private String G;
    private int H;
    private boolean I;
    private String J;
    public String a;
    public String b;
    public String c;
    public String d;
    public int e;
    public long f;
    public int g;
    public String h;
    public int i;
    public int j;
    public boolean k;
    private int l = 0;
    private String m;
    private String n;
    private String o;
    private int p;
    private String q;
    private String r;
    private String s;
    private int t;
    private boolean u;
    private String v;
    private int w;
    private long x;
    private String y;
    private int z;

    public qhb() {
        String str = "";
        this.a = str;
        this.b = str;
        this.m = str;
        this.c = str;
        this.d = str;
        this.n = str;
        this.e = 0;
        this.o = str;
        this.p = 0;
        this.q = str;
        this.r = str;
        this.s = str;
        this.t = -1;
        this.u = false;
        this.v = str;
        this.w = 0;
        this.x = -1;
        this.y = str;
        this.z = -1;
        this.A = -1;
        this.B = str;
        this.C = 0;
        this.f = -1;
        this.D = -1;
        this.E = -1;
        this.F = -1;
        this.G = str;
        this.H = 0;
        this.g = 0;
        this.I = false;
        this.J = str;
        this.h = str;
        this.i = 0;
        this.j = 0;
        this.k = false;
        this.W = -1;
    }

    public final void a(rim rim) {
        int i = this.l;
        if (i != 0) {
            rim.a(1, i);
        }
        String str = this.a;
        String str2 = "";
        if (!(str == null || str.equals(str2))) {
            rim.a(2, this.a);
        }
        str = this.b;
        if (!(str == null || str.equals(str2))) {
            rim.a(3, this.b);
        }
        str = this.m;
        if (!(str == null || str.equals(str2))) {
            rim.a(4, this.m);
        }
        str = this.d;
        if (!(str == null || str.equals(str2))) {
            rim.a(5, this.d);
        }
        str = this.n;
        if (!(str == null || str.equals(str2))) {
            rim.a(6, this.n);
        }
        str = this.o;
        if (!(str == null || str.equals(str2))) {
            rim.a(7, this.o);
        }
        str = this.q;
        if (!(str == null || str.equals(str2))) {
            rim.a(8, this.q);
        }
        str = this.r;
        if (!(str == null || str.equals(str2))) {
            rim.a(9, this.r);
        }
        str = this.s;
        if (!(str == null || str.equals(str2))) {
            rim.a(10, this.s);
        }
        i = this.t;
        if (i != -1) {
            rim.a(11, i);
        }
        if (this.u) {
            rim.a(12, true);
        }
        str = this.v;
        if (!(str == null || str.equals(str2))) {
            rim.a(13, this.v);
        }
        long j = this.x;
        if (j != -1) {
            rim.a(14, j);
        }
        str = this.y;
        if (!(str == null || str.equals(str2))) {
            rim.a(15, this.y);
        }
        i = this.z;
        if (i != -1) {
            rim.a(16, i);
        }
        i = this.A;
        if (i != -1) {
            rim.a(17, i);
        }
        str = this.B;
        if (!(str == null || str.equals(str2))) {
            rim.a(18, this.B);
        }
        j = this.f;
        if (j != -1) {
            rim.a(19, j);
        }
        j = this.D;
        if (j != -1) {
            rim.a(20, j);
        }
        i = this.E;
        if (i != -1) {
            rim.a(21, i);
        }
        str = this.G;
        if (!(str == null || str.equals(str2))) {
            rim.a(22, this.G);
        }
        i = this.g;
        if (i != 0) {
            rim.a(23, i);
        }
        if (this.I) {
            rim.a(24, true);
        }
        i = this.e;
        if (i != 0) {
            rim.a(25, i);
        }
        i = this.p;
        if (i != 0) {
            rim.a(26, i);
        }
        i = this.w;
        if (i != 0) {
            rim.a(27, i);
        }
        i = this.C;
        if (i != 0) {
            rim.a(28, i);
        }
        i = this.H;
        if (i != 0) {
            rim.a(29, i);
        }
        i = this.F;
        if (i != -1) {
            rim.a(30, i);
        }
        str = this.J;
        if (!(str == null || str.equals(str2))) {
            rim.a(31, this.J);
        }
        str = this.h;
        if (!(str == null || str.equals(str2))) {
            rim.a(32, this.h);
        }
        str = this.c;
        if (!(str == null || str.equals(str2))) {
            rim.a(33, this.c);
        }
        i = this.i;
        if (i != 0) {
            rim.a(34, i);
        }
        i = this.j;
        if (i != 0) {
            rim.a(35, i);
        }
        if (this.k) {
            rim.a(36, true);
        }
        super.a(rim);
    }

    /* Access modifiers changed, original: protected|final */
    public final int a() {
        int a = super.a();
        int i = this.l;
        if (i != 0) {
            a += rim.b(1, i);
        }
        String str = this.a;
        String str2 = "";
        if (!(str == null || str.equals(str2))) {
            a += rim.b(2, this.a);
        }
        str = this.b;
        if (!(str == null || str.equals(str2))) {
            a += rim.b(3, this.b);
        }
        str = this.m;
        if (!(str == null || str.equals(str2))) {
            a += rim.b(4, this.m);
        }
        str = this.d;
        if (!(str == null || str.equals(str2))) {
            a += rim.b(5, this.d);
        }
        str = this.n;
        if (!(str == null || str.equals(str2))) {
            a += rim.b(6, this.n);
        }
        str = this.o;
        if (!(str == null || str.equals(str2))) {
            a += rim.b(7, this.o);
        }
        str = this.q;
        if (!(str == null || str.equals(str2))) {
            a += rim.b(8, this.q);
        }
        str = this.r;
        if (!(str == null || str.equals(str2))) {
            a += rim.b(9, this.r);
        }
        str = this.s;
        if (!(str == null || str.equals(str2))) {
            a += rim.b(10, this.s);
        }
        i = this.t;
        if (i != -1) {
            a += rim.b(11, i);
        }
        if (this.u) {
            a += rim.b(12) + 1;
        }
        str = this.v;
        if (!(str == null || str.equals(str2))) {
            a += rim.b(13, this.v);
        }
        long j = this.x;
        if (j != -1) {
            a += rim.b(14, j);
        }
        str = this.y;
        if (!(str == null || str.equals(str2))) {
            a += rim.b(15, this.y);
        }
        i = this.z;
        if (i != -1) {
            a += rim.b(16, i);
        }
        i = this.A;
        if (i != -1) {
            a += rim.b(17, i);
        }
        str = this.B;
        if (!(str == null || str.equals(str2))) {
            a += rim.b(18, this.B);
        }
        j = this.f;
        if (j != -1) {
            a += rim.b(19, j);
        }
        j = this.D;
        if (j != -1) {
            a += rim.b(20, j);
        }
        i = this.E;
        if (i != -1) {
            a += rim.b(21, i);
        }
        str = this.G;
        if (!(str == null || str.equals(str2))) {
            a += rim.b(22, this.G);
        }
        i = this.g;
        if (i != 0) {
            a += rim.b(23, i);
        }
        if (this.I) {
            a += rim.b(24) + 1;
        }
        i = this.e;
        if (i != 0) {
            a += rim.b(25, i);
        }
        i = this.p;
        if (i != 0) {
            a += rim.b(26, i);
        }
        i = this.w;
        if (i != 0) {
            a += rim.b(27, i);
        }
        i = this.C;
        if (i != 0) {
            a += rim.b(28, i);
        }
        i = this.H;
        if (i != 0) {
            a += rim.b(29, i);
        }
        i = this.F;
        if (i != -1) {
            a += rim.b(30, i);
        }
        str = this.J;
        if (!(str == null || str.equals(str2))) {
            a += rim.b(31, this.J);
        }
        str = this.h;
        if (!(str == null || str.equals(str2))) {
            a += rim.b(32, this.h);
        }
        str = this.c;
        if (!(str == null || str.equals(str2))) {
            a += rim.b(33, this.c);
        }
        i = this.i;
        if (i != 0) {
            a += rim.b(34, i);
        }
        i = this.j;
        if (i != 0) {
            a += rim.b(35, i);
        }
        return this.k ? a + (rim.b(36) + 1) : a;
    }
}
