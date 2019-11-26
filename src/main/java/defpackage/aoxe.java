package defpackage;

/* renamed from: aoxe */
public final class aoxe extends anxl implements anzf {
    public static final aoxe e;
    private static volatile anzq f;
    public int a;
    public boolean b;
    public String c;
    public String d;

    private aoxe() {
        String str = "";
        this.c = str;
        this.d = str;
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(e, "\u0001\u0003\u0000\u0001\u0002\u0004\u0003\u0000\u0000\u0000\u0002\u0007\u0001\u0003\b\u0002\u0004\b\u0003", new Object[]{"a", "b", "c", "d"});
            case 3:
                return new aoxe();
            case 4:
                return new aoxg();
            case 5:
                return e;
            case 6:
                Object obj3 = f;
                if (obj3 == null) {
                    synchronized (aoxe.class) {
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
        aoxe aoxe = new aoxe();
        e = aoxe;
        anxl.registerDefaultInstance(aoxe.class, aoxe);
    }
}
