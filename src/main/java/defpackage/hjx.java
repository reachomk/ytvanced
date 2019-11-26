package defpackage;

/* renamed from: hjx */
public final class hjx {
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

    public hjx(bcaa bcaa, bcaa bcaa2, bcaa bcaa3, bcaa bcaa4, bcaa bcaa5, bcaa bcaa6, bcaa bcaa7, bcaa bcaa8, bcaa bcaa9, bcaa bcaa10, bcaa bcaa11, bcaa bcaa12, bcaa bcaa13, bcaa bcaa14, bcaa bcaa15, bcaa bcaa16, bcaa bcaa17, bcaa bcaa18, bcaa bcaa19, bcaa bcaa20) {
        bcaa bcaa21 = bcaa;
        this.a = (bcaa) hjx.a(bcaa, 1);
        bcaa21 = bcaa2;
        this.b = (bcaa) hjx.a(bcaa2, 2);
        bcaa21 = bcaa3;
        this.c = (bcaa) hjx.a(bcaa3, 3);
        bcaa21 = bcaa4;
        this.d = (bcaa) hjx.a(bcaa4, 4);
        bcaa21 = bcaa5;
        this.e = (bcaa) hjx.a(bcaa5, 5);
        bcaa21 = bcaa6;
        this.f = (bcaa) hjx.a(bcaa6, 6);
        bcaa21 = bcaa7;
        this.g = (bcaa) hjx.a(bcaa7, 7);
        bcaa21 = bcaa8;
        this.h = (bcaa) hjx.a(bcaa8, 8);
        bcaa21 = bcaa9;
        this.i = (bcaa) hjx.a(bcaa9, 9);
        bcaa21 = bcaa10;
        this.j = (bcaa) hjx.a(bcaa10, 10);
        bcaa21 = bcaa11;
        this.k = (bcaa) hjx.a(bcaa11, 11);
        bcaa21 = bcaa12;
        this.l = (bcaa) hjx.a(bcaa12, 12);
        this.m = (bcaa) hjx.a(bcaa13, 13);
        this.n = (bcaa) hjx.a(bcaa14, 14);
        this.o = (bcaa) hjx.a(bcaa15, 15);
        this.p = (bcaa) hjx.a(bcaa16, 16);
        this.q = (bcaa) hjx.a(bcaa17, 17);
        this.r = (bcaa) hjx.a(bcaa18, 18);
        this.s = (bcaa) hjx.a(bcaa19, 19);
        this.t = (bcaa) hjx.a(bcaa20, 20);
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
