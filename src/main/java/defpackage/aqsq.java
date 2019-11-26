package defpackage;

/* renamed from: aqsq */
public final class aqsq extends anxl implements anzf {
    public static final anyb e = new aqsp();
    public static final aqsq h;
    private static volatile anzq i;
    public int a;
    public long b;
    public aqso c;
    public anxz d = anxl.emptyIntList();
    public boolean f;
    public boolean g;

    private aqsq() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(h, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001\u0002\u0000\u0002\t\u0001\u0003\u001e\u0004\u0007\u0002\u0005\u0007\u0003", new Object[]{"a", "b", "c", "d", avae.a(), "f", "g"});
            case 3:
                return new aqsq();
            case 4:
                return new aqsr();
            case 5:
                return h;
            case 6:
                Object obj3 = i;
                if (obj3 == null) {
                    synchronized (aqsq.class) {
                        obj3 = i;
                        if (obj3 == null) {
                            obj3 = new anxn(h);
                            i = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        aqsq aqsq = new aqsq();
        h = aqsq;
        anxl.registerDefaultInstance(aqsq.class, aqsq);
    }
}
