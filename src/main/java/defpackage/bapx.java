package defpackage;

/* renamed from: bapx */
public final class bapx implements bapu, bcaa {
    private static final Object a = new Object();
    private volatile bcaa b;
    private volatile Object c = a;

    private bapx(bcaa bcaa) {
        this.b = bcaa;
    }

    public final Object get() {
        Object obj = this.c;
        if (obj == a) {
            synchronized (this) {
                obj = this.c;
                if (obj == a) {
                    obj = this.b.get();
                    this.c = bapx.a(this.c, obj);
                    this.b = null;
                }
            }
        }
        return obj;
    }

    public static Object a(Object obj, Object obj2) {
        if (obj == a || (obj instanceof baqe) || obj == obj2) {
            return obj2;
        }
        String valueOf = String.valueOf(obj);
        String valueOf2 = String.valueOf(obj2);
        StringBuilder stringBuilder = new StringBuilder((valueOf.length() + 118) + valueOf2.length());
        stringBuilder.append("Scoped provider was invoked recursively returning different results: ");
        stringBuilder.append(valueOf);
        stringBuilder.append(" & ");
        stringBuilder.append(valueOf2);
        stringBuilder.append(". This is likely due to a circular dependency.");
        throw new IllegalStateException(stringBuilder.toString());
    }

    public static bcaa a(bcaa bcaa) {
        baqd.a(bcaa);
        return !(bcaa instanceof bapx) ? new bapx(bcaa) : bcaa;
    }

    public static bapu b(bcaa bcaa) {
        if (bcaa instanceof bapu) {
            return (bapu) bcaa;
        }
        return new bapx((bcaa) baqd.a(bcaa));
    }
}
