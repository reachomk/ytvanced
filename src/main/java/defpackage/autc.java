package defpackage;

/* renamed from: autc */
public final class autc extends anxl implements anzf {
    public static final autc d;
    private static volatile anzq e;
    public int a;
    public int b;
    public auta c;

    private autc() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0000\u0002\t\u0001", new Object[]{"a", "b", auti.a, "c"});
            case 3:
                return new autc();
            case 4:
                return new autb();
            case 5:
                return d;
            case 6:
                Object obj3 = e;
                if (obj3 == null) {
                    synchronized (autc.class) {
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
        autc autc = new autc();
        d = autc;
        anxl.registerDefaultInstance(autc.class, autc);
    }
}
