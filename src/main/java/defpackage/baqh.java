package defpackage;

/* renamed from: baqh */
public final class baqh implements bcaa {
    private static final Object a = new Object();
    private volatile bcaa b;
    private volatile Object c = a;

    private baqh(bcaa bcaa) {
        this.b = bcaa;
    }

    public final Object get() {
        Object obj = this.c;
        if (obj != a) {
            return obj;
        }
        bcaa bcaa = this.b;
        if (bcaa == null) {
            return this.c;
        }
        obj = bcaa.get();
        this.c = obj;
        this.b = null;
        return obj;
    }

    public static bcaa a(bcaa bcaa) {
        return ((bcaa instanceof baqh) || (bcaa instanceof bapx)) ? bcaa : new baqh((bcaa) baqd.a(bcaa));
    }
}
