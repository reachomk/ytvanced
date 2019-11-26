package defpackage;

/* renamed from: nkk */
public final class nkk extends anxl implements anzf {
    public static final nkk e;
    private static volatile anzq f;
    public int a;
    public boolean b;
    public boolean c;
    public anxz d = anxl.emptyIntList();

    private nkk() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u0007\u0000\u0002\u0007\u0001\u0003\u0016", new Object[]{"a", "b", "c", "d"});
            case 3:
                return new nkk();
            case 4:
                return new nkj();
            case 5:
                return e;
            case 6:
                Object obj3 = f;
                if (obj3 == null) {
                    synchronized (nkk.class) {
                        obj3 = f;
                        if (obj3 == null) {
                            obj3 = new anxn(e);
                            f = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        nkk nkk = new nkk();
        e = nkk;
        anxl.registerDefaultInstance(nkk.class, nkk);
    }
}
