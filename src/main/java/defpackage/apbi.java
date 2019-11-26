package defpackage;

/* renamed from: apbi */
public final class apbi extends anxl implements anzf {
    public static final apbi e;
    private static volatile anzq f;
    public int a;
    public float b;
    public float c;
    public int d;

    private apbi() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0001\u0000\u0002\u0001\u0001\u0003\u0004\u0002", new Object[]{"a", "b", "c", "d"});
            case 3:
                return new apbi();
            case 4:
                return new apbh();
            case 5:
                return e;
            case 6:
                Object obj3 = f;
                if (obj3 == null) {
                    synchronized (apbi.class) {
                        obj3 = f;
                        if (obj3 == null) {
                            obj3 = new anxn(e);
                            f = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        apbi apbi = new apbi();
        e = apbi;
        anxl.registerDefaultInstance(apbi.class, apbi);
    }
}
