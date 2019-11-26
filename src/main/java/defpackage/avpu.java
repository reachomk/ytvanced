package defpackage;

/* renamed from: avpu */
public final class avpu extends anxl implements anzf {
    public static final avpu d;
    private static volatile anzq e;
    public int a;
    public anvu b = anvu.a;
    public boolean c;

    private avpu() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(d, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002\n\u0001\u0003\u0007\u0002", new Object[]{"a", "b", "c"});
            case 3:
                return new avpu();
            case 4:
                return new avpt();
            case 5:
                return d;
            case 6:
                Object obj3 = e;
                if (obj3 == null) {
                    synchronized (avpu.class) {
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

    static {
        avpu avpu = new avpu();
        d = avpu;
        anxl.registerDefaultInstance(avpu.class, avpu);
    }
}
