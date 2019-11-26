package defpackage;

/* renamed from: atco */
public final class atco extends anxl implements anzf {
    public static final atco f;
    private static volatile anzq g;
    public int a;
    public int b;
    public String c = "";
    public int d;
    public int e;

    private atco() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\f\u0000\u0002\b\u0001\u0003\u000b\u0003\u0004\u000b\u0002", new Object[]{"a", "b", atcp.a, "c", "e", "d"});
            case 3:
                return new atco();
            case 4:
                return new atcn();
            case 5:
                return f;
            case 6:
                Object obj3 = g;
                if (obj3 == null) {
                    synchronized (atco.class) {
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
        atco atco = new atco();
        f = atco;
        anxl.registerDefaultInstance(atco.class, atco);
    }
}
