package defpackage;

/* renamed from: aswt */
public final class aswt extends anxl implements anzf {
    public static final aswt d;
    private static volatile anzq e;
    public int a;
    public String b = "";
    public boolean c;

    private aswt() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(d, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002\b\u0001\u0003\u0007\u0002", new Object[]{"a", "b", "c"});
            case 3:
                return new aswt();
            case 4:
                return new asww();
            case 5:
                return d;
            case 6:
                Object obj3 = e;
                if (obj3 == null) {
                    synchronized (aswt.class) {
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
        aswt aswt = new aswt();
        d = aswt;
        anxl.registerDefaultInstance(aswt.class, aswt);
    }
}
