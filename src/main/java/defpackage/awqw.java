package defpackage;

/* renamed from: awqw */
public final class awqw extends anxl implements anzf {
    public static final awqw d;
    private static volatile anzq e;
    public int a;
    public int b;
    public float c;

    private awqw() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0000\u0002\u0001\u0001", new Object[]{"a", "b", awqx.a, "c"});
            case 3:
                return new awqw();
            case 4:
                return new awqz();
            case 5:
                return d;
            case 6:
                Object obj3 = e;
                if (obj3 == null) {
                    synchronized (awqw.class) {
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
        awqw awqw = new awqw();
        d = awqw;
        anxl.registerDefaultInstance(awqw.class, awqw);
    }
}
