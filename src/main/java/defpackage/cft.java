package defpackage;

/* renamed from: cft */
final class cft {
    public final Class a;
    public final bsp b;
    private final Class c;

    public cft(Class cls, Class cls2, bsp bsp) {
        this.c = cls;
        this.a = cls2;
        this.b = bsp;
    }

    public final boolean a(Class cls, Class cls2) {
        return this.c.isAssignableFrom(cls) && cls2.isAssignableFrom(this.a);
    }
}
