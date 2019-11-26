package defpackage;

/* renamed from: aqzw */
public final class aqzw extends anxl implements anzf {
    public static final aqzw c;
    private static volatile anzq d;
    public int a = 0;
    public Object b;

    private aqzw() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(c, "\u0001\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000", new Object[]{"b", "a", araa.class, aqzy.class});
            case 3:
                return new aqzw();
            case 4:
                return new aqzz();
            case 5:
                return c;
            case 6:
                Object obj3 = d;
                if (obj3 == null) {
                    synchronized (aqzw.class) {
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
        aqzw aqzw = new aqzw();
        c = aqzw;
        anxl.registerDefaultInstance(aqzw.class, aqzw);
    }
}
