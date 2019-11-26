package defpackage;

/* renamed from: aqvj */
public final class aqvj extends anxl implements anzf {
    public static final aqvj f;
    private static volatile anzq g;
    public int a;
    public float b;
    public float c;
    public float d;
    public float e;

    private aqvj() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0001\u0000\u0002\u0001\u0001\u0003\u0001\u0002\u0004\u0001\u0003", new Object[]{"a", "b", "c", "d", "e"});
            case 3:
                return new aqvj();
            case 4:
                return new aqvi();
            case 5:
                return f;
            case 6:
                Object obj3 = g;
                if (obj3 == null) {
                    synchronized (aqvj.class) {
                        obj3 = g;
                        if (obj3 == null) {
                            obj3 = new anxn(f);
                            g = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        aqvj aqvj = new aqvj();
        f = aqvj;
        anxl.registerDefaultInstance(aqvj.class, aqvj);
    }
}
