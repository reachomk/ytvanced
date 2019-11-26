package defpackage;

/* renamed from: anfq */
public final class anfq extends anxl implements anzf {
    public static final anfq d;
    private static volatile anzq e;
    public int a;
    public float b;
    public float c;

    static {
        anfq anfq = new anfq();
        d = anfq;
        anxl.registerDefaultInstance(anfq.class, anfq);
    }

    private anfq() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0001\u0000\u0002\u0001\u0001", new Object[]{"a", "b", "c"});
            case 3:
                return new anfq();
            case 4:
                return new anfp();
            case 5:
                return d;
            case 6:
                Object obj3 = e;
                if (obj3 == null) {
                    synchronized (anfq.class) {
                        obj3 = e;
                        if (obj3 == null) {
                            obj3 = new anxn(d);
                            e = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
