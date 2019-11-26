package defpackage;

/* renamed from: dfk */
public final class dfk extends anxl implements anzf {
    public static final dfk c;
    private static volatile anzq d;
    public int a;
    public dfm b;

    private dfk() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t\u0000", new Object[]{"a", "b"});
            case 3:
                return new dfk();
            case 4:
                return new dfn();
            case 5:
                return c;
            case 6:
                Object obj3 = d;
                if (obj3 == null) {
                    synchronized (dfk.class) {
                        obj3 = d;
                        if (obj3 == null) {
                            obj3 = new anxn(c);
                            d = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        dfk dfk = new dfk();
        c = dfk;
        anxl.registerDefaultInstance(dfk.class, dfk);
    }
}
