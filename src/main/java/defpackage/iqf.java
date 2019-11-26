package defpackage;

/* renamed from: iqf */
public final class iqf {
    public final bcaa a;
    public final bcaa b;
    public final bcaa c;
    public final bcaa d;
    public final bcaa e;
    public final bcaa f;
    public final bcaa g;
    public final bcaa h;
    public final bcaa i;
    public final bcaa j;
    public final bcaa k;
    public final bcaa l;
    public final bcaa m;
    public final bcaa n;
    public final bcaa o;
    public final bcaa p;
    public final bcaa q;
    public final bcaa r;
    public final bcaa s;
    public final bcaa t;
    public final bcaa u;
    public final bcaa v;

    public iqf(bcaa bcaa, bcaa bcaa2, bcaa bcaa3, bcaa bcaa4, bcaa bcaa5, bcaa bcaa6, bcaa bcaa7, bcaa bcaa8, bcaa bcaa9, bcaa bcaa10, bcaa bcaa11, bcaa bcaa12, bcaa bcaa13, bcaa bcaa14, bcaa bcaa15, bcaa bcaa16, bcaa bcaa17, bcaa bcaa18, bcaa bcaa19, bcaa bcaa20, bcaa bcaa21, bcaa bcaa22) {
        bcaa bcaa23 = bcaa;
        this.a = (bcaa) iqf.a(bcaa, 1);
        bcaa23 = bcaa2;
        this.b = (bcaa) iqf.a(bcaa2, 2);
        bcaa23 = bcaa3;
        this.c = (bcaa) iqf.a(bcaa3, 3);
        bcaa23 = bcaa4;
        this.d = (bcaa) iqf.a(bcaa4, 4);
        bcaa23 = bcaa5;
        this.e = (bcaa) iqf.a(bcaa5, 5);
        bcaa23 = bcaa6;
        this.f = (bcaa) iqf.a(bcaa6, 6);
        bcaa23 = bcaa7;
        this.g = (bcaa) iqf.a(bcaa7, 7);
        bcaa23 = bcaa8;
        this.h = (bcaa) iqf.a(bcaa8, 8);
        bcaa23 = bcaa9;
        this.i = (bcaa) iqf.a(bcaa9, 9);
        bcaa23 = bcaa10;
        this.j = (bcaa) iqf.a(bcaa10, 10);
        bcaa23 = bcaa11;
        this.k = (bcaa) iqf.a(bcaa11, 11);
        bcaa23 = bcaa12;
        this.l = (bcaa) iqf.a(bcaa12, 12);
        this.m = (bcaa) iqf.a(bcaa13, 13);
        this.n = (bcaa) iqf.a(bcaa14, 14);
        this.o = (bcaa) iqf.a(bcaa15, 15);
        this.p = (bcaa) iqf.a(bcaa16, 16);
        this.q = (bcaa) iqf.a(bcaa17, 17);
        this.r = (bcaa) iqf.a(bcaa18, 18);
        this.s = (bcaa) iqf.a(bcaa19, 19);
        this.t = (bcaa) iqf.a(bcaa20, 20);
        this.u = (bcaa) iqf.a(bcaa21, 21);
        this.v = (bcaa) iqf.a(bcaa22, 22);
    }

    public static Object a(Object obj, int i) {
        if (obj != null) {
            return obj;
        }
        StringBuilder stringBuilder = new StringBuilder(93);
        stringBuilder.append("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        stringBuilder.append(i);
        throw new NullPointerException(stringBuilder.toString());
    }
}
