package defpackage;

/* renamed from: awcw */
public final class awcw extends anxl implements anzf {
    public static final awcw i;
    private static volatile anzq j;
    public int a;
    public String b = "";
    public anxz c = anxl.emptyIntList();
    public int d;
    public boolean e;
    public int f;
    public boolean g;
    public int h;

    private awcw() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(i, "\u0001\u0007\u0000\u0001\u0002\b\u0007\u0000\u0001\u0000\u0002\u0016\u0003\u0004\u0001\u0004\u0004\u0003\u0005\f\u0005\u0006\u0007\u0002\u0007\u0007\u0004\b\b\u0000", new Object[]{"a", "c", "d", "f", "h", awcy.a(), "e", "g", "b"});
            case 3:
                return new awcw();
            case 4:
                return new awcv();
            case 5:
                return i;
            case 6:
                Object obj3 = j;
                if (obj3 == null) {
                    synchronized (awcw.class) {
                        obj3 = j;
                        if (obj3 == null) {
                            obj3 = new anxn(i);
                            j = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        awcw awcw = new awcw();
        i = awcw;
        anxl.registerDefaultInstance(awcw.class, awcw);
    }
}
