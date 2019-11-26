package defpackage;

/* renamed from: arcm */
public final class arcm extends anxl implements anzf {
    public static final arcm e;
    private static volatile anzq f;
    public int a;
    public boolean b;
    public boolean c;
    public boolean d;

    private arcm() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(e, "\u0001\u0003\u0000\u0001\u0001\u0006\u0003\u0000\u0000\u0000\u0001\u0007\u0000\u0002\u0007\u0001\u0006\u0007\u0005", new Object[]{"a", "b", "c", "d"});
            case 3:
                return new arcm();
            case 4:
                return new arco();
            case 5:
                return e;
            case 6:
                Object obj3 = f;
                if (obj3 == null) {
                    synchronized (arcm.class) {
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
        arcm arcm = new arcm();
        e = arcm;
        anxl.registerDefaultInstance(arcm.class, arcm);
    }
}
