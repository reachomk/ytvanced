package defpackage;

/* renamed from: atmo */
public final class atmo extends anxl implements anzf {
    public static final atmo e;
    private static volatile anzq f;
    public int a;
    public int b;
    public atna c;
    public String d = "";

    private atmo() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(e, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001\f\u0000\u0002\t\u0001\u0004\b\u0003", new Object[]{"a", "b", atmp.a, "c", "d"});
            case 3:
                return new atmo();
            case 4:
                return new atmn();
            case 5:
                return e;
            case 6:
                Object obj3 = f;
                if (obj3 == null) {
                    synchronized (atmo.class) {
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
        atmo atmo = new atmo();
        e = atmo;
        anxl.registerDefaultInstance(atmo.class, atmo);
    }
}
