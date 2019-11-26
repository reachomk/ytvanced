package defpackage;

/* renamed from: tsd */
public abstract class tsd {
    private static final ThreadLocal a = new tsc();

    public abstract void a(tsf tsf);

    public abstract void b(tsf tsf);

    public static tsd a() {
        return (tsd) a.get();
    }
}
