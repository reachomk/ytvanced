package defpackage;

/* renamed from: awbd */
public final class awbd extends anxl implements anzf {
    public static final awbd j;
    private static volatile anzq k;
    public int a;
    public boolean b;
    public boolean c;
    public boolean d;
    public awbb e;
    public int f;
    public int g;
    public boolean h;
    public boolean i;

    private awbd() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(j, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001\u0007\u0000\u0002\u0007\u0001\u0003\u0007\u0002\u0004\t\u0003\u0005\f\u0004\u0006\f\u0005\u0007\u0007\u0006\b\u0007\u0007", new Object[]{"a", "b", "c", "d", "e", "f", awbj.a, "g", awbi.a, "h", "i"});
            case 3:
                return new awbd();
            case 4:
                return new awbc();
            case 5:
                return j;
            case 6:
                Object obj3 = k;
                if (obj3 == null) {
                    synchronized (awbd.class) {
                        obj3 = k;
                        if (obj3 == null) {
                            obj3 = new anxn(j);
                            k = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        awbd awbd = new awbd();
        j = awbd;
        anxl.registerDefaultInstance(awbd.class, awbd);
    }
}
