package defpackage;

/* renamed from: bapz */
public final class bapz implements bapu, baqa {
    private static final bapz a = new bapz(null);
    private final Object b;

    public static baqa a(Object obj) {
        return new bapz(baqd.a(obj, "instance cannot be null"));
    }

    public static baqa b(Object obj) {
        if (obj != null) {
            return new bapz(obj);
        }
        return a;
    }

    private bapz(Object obj) {
        this.b = obj;
    }

    public final Object get() {
        return this.b;
    }
}
