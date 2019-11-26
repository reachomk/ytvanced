package defpackage;

/* renamed from: bacp */
public final class bacp extends anxl implements anzf {
    public static final bacp c;
    private static volatile anzq d;
    public int a = 0;
    public Object b;

    private bacp() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(c, "\u0001\u0007\u0001\u0000\u0001\u0007\u0007\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007<\u0000", new Object[]{"b", "a", bada.class, bacr.class, bact.class, bacn.class, bacv.class, bacl.class, bacz.class});
            case 3:
                return new bacp();
            case 4:
                return new baco();
            case 5:
                return c;
            case 6:
                Object obj3 = d;
                if (obj3 == null) {
                    synchronized (bacp.class) {
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
        bacp bacp = new bacp();
        c = bacp;
        anxl.registerDefaultInstance(bacp.class, bacp);
    }
}
