package defpackage;

/* renamed from: nki */
public final class nki extends anxl implements anzf {
    public static final nki e;
    private static volatile anzq f;
    public int a;
    public String b = "";
    public long c;
    public anvu d = anvu.a;

    private nki() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\b\u0000\u0002\u0002\u0001\u0003\n\u0002", new Object[]{"a", "b", "c", "d"});
            case 3:
                return new nki();
            case 4:
                return new nkh();
            case 5:
                return e;
            case 6:
                Object obj3 = f;
                if (obj3 == null) {
                    synchronized (nki.class) {
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
        nki nki = new nki();
        e = nki;
        anxl.registerDefaultInstance(nki.class, nki);
    }
}
