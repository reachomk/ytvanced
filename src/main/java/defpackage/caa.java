package defpackage;

/* renamed from: caa */
final class caa {
    public final Class a;
    public final bzs b;
    private final Class c;

    public caa(Class cls, Class cls2, bzs bzs) {
        this.c = cls;
        this.a = cls2;
        this.b = bzs;
    }

    public final boolean a(Class cls, Class cls2) {
        return a(cls) && this.a.isAssignableFrom(cls2);
    }

    public final boolean a(Class cls) {
        return this.c.isAssignableFrom(cls);
    }
}
