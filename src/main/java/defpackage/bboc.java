package defpackage;

/* renamed from: bboc */
public enum bboc implements bboz {
    INSTANCE,
    NEVER;

    public final int a(int i) {
        return i & 2;
    }

    public final boolean b() {
        return true;
    }

    public final Object bI_() {
        return null;
    }

    public final void bK_() {
    }

    public final void e() {
    }

    public final boolean c() {
        return this == INSTANCE;
    }

    public static void a(bbmo bbmo) {
        bbmo.a(INSTANCE);
        bbmo.a();
    }

    public static void a(Throwable th, bbmo bbmo) {
        bbmo.a(INSTANCE);
        bbmo.a(th);
    }

    public static void a(Throwable th, bblv bblv) {
        bblv.a(INSTANCE);
        bblv.a_(th);
    }

    public final boolean a(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }
}
