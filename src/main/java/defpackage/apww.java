package defpackage;

/* renamed from: apww */
public final class apww extends anxl implements anzf {
    public static final apww d;
    private static volatile anzq e;
    public int a;
    public apwy b;
    public apxa c;

    private apww() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(d, "\u0001\u0002\u0000\u0001\u0005\u0006\u0002\u0000\u0000\u0000\u0005\t\u0001\u0006\t\u0002", new Object[]{"a", "b", "c"});
            case 3:
                return new apww();
            case 4:
                return new apwv();
            case 5:
                return d;
            case 6:
                Object obj3 = e;
                if (obj3 == null) {
                    synchronized (apww.class) {
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
        apww apww = new apww();
        d = apww;
        anxl.registerDefaultInstance(apww.class, apww);
    }
}
