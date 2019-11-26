package defpackage;

/* renamed from: apvc */
public final class apvc extends anxl implements anzf {
    public static final apvc c;
    private static volatile anzq d;
    public int a = 0;
    public Object b;

    private apvc() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(c, "\u0001\u0002\u0001\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002<\u0000\u0003<\u0000", new Object[]{"b", "a", apuu.class, apuw.class});
            case 3:
                return new apvc();
            case 4:
                return new apvb();
            case 5:
                return c;
            case 6:
                Object obj3 = d;
                if (obj3 == null) {
                    synchronized (apvc.class) {
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
        apvc apvc = new apvc();
        c = apvc;
        anxl.registerDefaultInstance(apvc.class, apvc);
    }
}
