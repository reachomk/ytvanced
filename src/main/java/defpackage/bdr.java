package defpackage;

/* renamed from: bdr */
public final class bdr {
    public static final bdr a;
    public static final bdr b;
    public static final bdr c;
    public static final bdr d;
    public static final bdr e;
    public static final bdr f;
    public final float[] g = new float[3];
    public final float[] h = new float[3];
    public final float[] i = new float[3];
    public final boolean j = true;

    bdr() {
        bdr.a(this.g);
        bdr.a(this.h);
        float[] fArr = this.i;
        fArr[0] = 0.24f;
        fArr[1] = 0.52f;
        fArr[2] = 0.24f;
    }

    public final float a() {
        return this.i[0];
    }

    public final float b() {
        return this.i[1];
    }

    public final float c() {
        return this.i[2];
    }

    private static void a(float[] fArr) {
        fArr[0] = 0.0f;
        fArr[1] = 0.5f;
        fArr[2] = 1.0f;
    }

    private static void a(bdr bdr) {
        float[] fArr = bdr.h;
        fArr[1] = 0.26f;
        fArr[2] = 0.45f;
    }

    private static void b(bdr bdr) {
        float[] fArr = bdr.h;
        fArr[0] = 0.3f;
        fArr[1] = 0.5f;
        fArr[2] = 0.7f;
    }

    private static void c(bdr bdr) {
        float[] fArr = bdr.h;
        fArr[0] = 0.55f;
        fArr[1] = 0.74f;
    }

    private static void d(bdr bdr) {
        float[] fArr = bdr.g;
        fArr[0] = 0.35f;
        fArr[1] = 1.0f;
    }

    private static void e(bdr bdr) {
        float[] fArr = bdr.g;
        fArr[1] = 0.3f;
        fArr[2] = 0.4f;
    }

    static {
        bdr bdr = new bdr();
        a = bdr;
        bdr.c(bdr);
        bdr.d(a);
        bdr = new bdr();
        b = bdr;
        bdr.b(bdr);
        bdr.d(b);
        bdr = new bdr();
        c = bdr;
        bdr.a(bdr);
        bdr.d(c);
        bdr = new bdr();
        d = bdr;
        bdr.c(bdr);
        bdr.e(d);
        bdr = new bdr();
        e = bdr;
        bdr.b(bdr);
        bdr.e(e);
        bdr = new bdr();
        f = bdr;
        bdr.a(bdr);
        bdr.e(f);
    }
}
