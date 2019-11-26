package defpackage;

/* renamed from: atrt */
public final class atrt extends anxl implements anzf {
    public static final atrt e;
    private static volatile anzq f;
    public int a;
    public String b = "";
    public azfa c;
    public anyd d = anxl.emptyProtobufList();

    private atrt() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\b\u0000\u0002\t\u0001\u0003\u001b", new Object[]{"a", "b", "c", "d", azfa.class});
            case 3:
                return new atrt();
            case 4:
                return new atrs();
            case 5:
                return e;
            case 6:
                Object obj3 = f;
                if (obj3 == null) {
                    synchronized (atrt.class) {
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
        atrt atrt = new atrt();
        e = atrt;
        anxl.registerDefaultInstance(atrt.class, atrt);
    }
}
