package defpackage;

/* renamed from: asu */
public final class asu {
    private static zy d = new aab(20);
    public int a;
    public api b;
    public api c;

    private asu() {
    }

    public static asu a() {
        asu asu = (asu) d.a();
        return asu == null ? new asu() : asu;
    }

    public static void a(asu asu) {
        asu.a = 0;
        asu.b = null;
        asu.c = null;
        d.a(asu);
    }

    public static void b() {
        do {
        } while (d.a() != null);
    }
}
