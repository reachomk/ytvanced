package defpackage;

/* renamed from: awxk */
public final class awxk extends anxl implements anzf {
    public static final awxk f;
    private static volatile anzq g;
    public int a;
    public boolean b;
    public boolean c;
    public boolean d;
    public awxz e;

    private awxk() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(f, "\u0001\u0004\u0000\u0001\u0001\f\u0004\u0000\u0000\u0000\u0001\u0007\u0000\u0002\u0007\u0001\t\u0007\b\f\t\u000b", new Object[]{"a", "b", "c", "d", "e"});
            case 3:
                return new awxk();
            case 4:
                return new awxm();
            case 5:
                return f;
            case 6:
                Object obj3 = g;
                if (obj3 == null) {
                    synchronized (awxk.class) {
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
        awxk awxk = new awxk();
        f = awxk;
        anxl.registerDefaultInstance(awxk.class, awxk);
    }
}
