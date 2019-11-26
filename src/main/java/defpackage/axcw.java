package defpackage;

/* renamed from: axcw */
public final class axcw extends anxl implements anzf {
    public static final axcw c;
    private static volatile anzq d;
    public int a = 0;
    public Object b;

    private axcw() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(c, "\u0001\u0001\u0001\u0000杻䶺杻䶺\u0001\u0000\u0000\u0000杻䶺<\u0000", new Object[]{"b", "a", axdc.class});
            case 3:
                return new axcw();
            case 4:
                return new axcz();
            case 5:
                return c;
            case 6:
                Object obj3 = d;
                if (obj3 == null) {
                    synchronized (axcw.class) {
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
        axcw axcw = new axcw();
        c = axcw;
        anxl.registerDefaultInstance(axcw.class, axcw);
    }
}
