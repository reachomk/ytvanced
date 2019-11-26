package defpackage;

/* renamed from: cno */
public final class cno {
    public static final cnn a = new cnq();
    private static volatile cnp b = null;

    private cno() {
    }

    public static void a() {
        cno.e().a();
    }

    public static cnn b() {
        return cno.e().c();
    }

    public static void c() {
        cno.e().d();
    }

    public static boolean d() {
        return cno.e().f();
    }

    public static cnp e() {
        if (b == null) {
            synchronized (cno.class) {
                if (b == null) {
                    b = new cnv();
                }
            }
        }
        return b;
    }
}
