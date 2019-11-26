package defpackage;

/* renamed from: avrw */
public final class avrw extends anxl implements anzf {
    public static final avrw f;
    public static final anxr g;
    private static volatile anzq h;
    public int a;
    public String b = "";
    public int c;
    public long d;
    public long e;

    private avrw() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\b\u0000\u0002\f\u0001\u0003\u0002\u0002\u0004\u0002\u0003", new Object[]{"a", "b", "c", azal.a(), "d", "e"});
            case 3:
                return new avrw();
            case 4:
                return new avry();
            case 5:
                return f;
            case 6:
                Object obj3 = h;
                if (obj3 == null) {
                    synchronized (avrw.class) {
                        obj3 = h;
                        if (obj3 == null) {
                            obj3 = new anxn(f);
                            h = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        avrw avrw = new avrw();
        f = avrw;
        anxl.registerDefaultInstance(avrw.class, avrw);
        arfy arfy = arfy.a;
        avrw avrw2 = f;
        g = anxl.newSingularGeneratedExtension(arfy, avrw2, avrw2, null, 39, aobm.MESSAGE, avrw.class);
    }
}
