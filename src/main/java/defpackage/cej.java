package defpackage;

/* renamed from: cej */
final class cej {
    public final ceh a;
    private final Class b;
    private final Class c;

    cej(Class cls, Class cls2, ceh ceh) {
        this.b = cls;
        this.c = cls2;
        this.a = ceh;
    }

    public final boolean a(Class cls, Class cls2) {
        return this.b.isAssignableFrom(cls) && cls2.isAssignableFrom(this.c);
    }
}
