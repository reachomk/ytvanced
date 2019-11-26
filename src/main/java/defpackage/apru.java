package defpackage;

/* renamed from: apru */
public final class apru extends anxl implements anzf {
    public static final apru c;
    private static volatile anzq d;
    public int a = 0;
    public Object b;

    private apru() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(c, "\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001<\u0000", new Object[]{"b", "a", apry.class});
            case 3:
                return new apru();
            case 4:
                return new aprx();
            case 5:
                return c;
            case 6:
                Object obj3 = d;
                if (obj3 == null) {
                    synchronized (apru.class) {
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
        apru apru = new apru();
        c = apru;
        anxl.registerDefaultInstance(apru.class, apru);
    }
}
