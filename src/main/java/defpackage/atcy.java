package defpackage;

/* renamed from: atcy */
public final class atcy extends anxl implements anzf {
    public static final anyb c = new atcx();
    public static final atcy e;
    private static volatile anzq f;
    public int a;
    public anxz b = anxl.emptyIntList();
    public String d = "";

    private atcy() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(e, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\b\u0000\u0002\u001e", new Object[]{"a", "d", "b", avpb.a()});
            case 3:
                return new atcy();
            case 4:
                return new atda();
            case 5:
                return e;
            case 6:
                Object obj3 = f;
                if (obj3 == null) {
                    synchronized (atcy.class) {
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
        atcy atcy = new atcy();
        e = atcy;
        anxl.registerDefaultInstance(atcy.class, atcy);
    }
}
