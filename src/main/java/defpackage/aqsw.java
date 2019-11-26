package defpackage;

/* renamed from: aqsw */
public final class aqsw extends anxl implements anzf {
    public static final aqsw d;
    private static volatile anzq e;
    public int a;
    public aqsu b;
    public String c = "";

    private aqsw() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0000\u0002\b\u0001", new Object[]{"a", "b", "c"});
            case 3:
                return new aqsw();
            case 4:
                return new aqsz();
            case 5:
                return d;
            case 6:
                Object obj3 = e;
                if (obj3 == null) {
                    synchronized (aqsw.class) {
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
        aqsw aqsw = new aqsw();
        d = aqsw;
        anxl.registerDefaultInstance(aqsw.class, aqsw);
    }
}
