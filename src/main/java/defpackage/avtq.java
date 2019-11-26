package defpackage;

/* renamed from: avtq */
public final class avtq extends anxl implements anzf {
    public static final avtq d;
    private static volatile anzq e;
    public int a;
    public avtk b;
    public avtm c;

    private avtq() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(d, "\u0001\u0002\u0000\u0001ﯟ☇☔\u0002\u0000\u0000\u0000ﯟ☇\t\u0001☔\t\u0000", new Object[]{"a", "c", "b"});
            case 3:
                return new avtq();
            case 4:
                return new avts();
            case 5:
                return d;
            case 6:
                Object obj3 = e;
                if (obj3 == null) {
                    synchronized (avtq.class) {
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
        avtq avtq = new avtq();
        d = avtq;
        anxl.registerDefaultInstance(avtq.class, avtq);
    }
}
