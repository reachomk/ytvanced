package defpackage;

/* renamed from: a */
public final class a extends g {
    private static volatile a a;
    private final g b = this.c;
    private final g c = new e();

    private a() {
    }

    public static a a() {
        if (a != null) {
            return a;
        }
        synchronized (a.class) {
            if (a == null) {
                a = new a();
            }
        }
        return a;
    }

    public final void a(Runnable runnable) {
        this.b.a(runnable);
    }

    public final void b(Runnable runnable) {
        this.b.b(runnable);
    }

    public final boolean b() {
        return this.b.b();
    }

    static {
        c cVar = new c();
        b bVar = new b();
    }
}
