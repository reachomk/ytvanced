package defpackage;

/* renamed from: atno */
public final class atno extends anxl implements anzf {
    public static final atno e;
    private static volatile anzq f;
    public int a;
    public int b = 1;
    public String c = "";
    public atnk d;

    private atno() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0000\u0002\b\u0001\u0003\t\u0002", new Object[]{"a", "b", atnp.a, "c", "d"});
            case 3:
                return new atno();
            case 4:
                return new atnn();
            case 5:
                return e;
            case 6:
                Object obj3 = f;
                if (obj3 == null) {
                    synchronized (atno.class) {
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
        atno atno = new atno();
        e = atno;
        anxl.registerDefaultInstance(atno.class, atno);
    }
}
