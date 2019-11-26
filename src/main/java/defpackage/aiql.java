package defpackage;

/* renamed from: aiql */
public abstract class aiql implements aiqv {
    public abstract nkm a(Object obj);

    public abstract boolean a(Object obj, Object obj2);

    public abstract String b(Object obj);

    public abstract String c(Object obj);

    private final Object d(apxu apxu) {
        amqw.a((Object) apxu);
        anxr access$000 = anxl.checkIsLite(a());
        apxu.a(access$000);
        amqw.a(apxu.h.a(access$000.d));
        access$000 = anxl.checkIsLite(a());
        apxu.a(access$000);
        Object b = apxu.h.b(access$000.d);
        if (b == null) {
            return access$000.b;
        }
        return access$000.a(b);
    }

    public final String a(apxu apxu) {
        return c(d(apxu));
    }

    public final String b(apxu apxu) {
        return b(d(apxu));
    }

    public final boolean a(apxu apxu, apxu apxu2) {
        return a(d(apxu), d(apxu2));
    }

    public final nkm c(apxu apxu) {
        return a(d(apxu));
    }
}
