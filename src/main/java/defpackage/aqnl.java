package defpackage;

/* renamed from: aqnl */
public final class aqnl extends anxl implements anzf {
    public static final aqnl e;
    private static volatile anzq f;
    public int a;
    public int b;
    public String c = "";
    public int d;

    private aqnl() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0000\u0002\b\u0001\u0003\f\u0002", new Object[]{"a", "b", atwp.a, "c", "d", aqmf.a});
            case 3:
                return new aqnl();
            case 4:
                return new aqnk();
            case 5:
                return e;
            case 6:
                Object obj3 = f;
                if (obj3 == null) {
                    synchronized (aqnl.class) {
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
        aqnl aqnl = new aqnl();
        e = aqnl;
        anxl.registerDefaultInstance(aqnl.class, aqnl);
    }
}
