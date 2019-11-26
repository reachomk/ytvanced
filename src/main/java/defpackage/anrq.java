package defpackage;

/* renamed from: anrq */
public final class anrq extends anxl implements anzf {
    public static final anrq c;
    private static volatile anzq d;
    public int a = 0;
    public Object b;

    private anrq() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(c, "\u0001\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u00015\u0000\u00023\u0000\u0003<\u0000", new Object[]{"b", "a", anri.class});
            case 3:
                return new anrq();
            case 4:
                return new anrt();
            case 5:
                return c;
            case 6:
                Object obj3 = d;
                if (obj3 == null) {
                    synchronized (anrq.class) {
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
        anrq anrq = new anrq();
        c = anrq;
        anxl.registerDefaultInstance(anrq.class, anrq);
    }
}
