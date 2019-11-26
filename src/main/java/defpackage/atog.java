package defpackage;

/* renamed from: atog */
public final class atog extends anxl implements anzf {
    public static final atog e;
    private static volatile anzq f;
    public int a;
    public anyd b = anxl.emptyProtobufList();
    public anyd c = anxl.emptyProtobufList();
    public int d;

    private atog() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0000\u0001\u001b\u0002\u001b\u0003\u000b\u0000", new Object[]{"a", "b", atoi.class, "c", atoi.class, "d"});
            case 3:
                return new atog();
            case 4:
                return new atof();
            case 5:
                return e;
            case 6:
                Object obj3 = f;
                if (obj3 == null) {
                    synchronized (atog.class) {
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
        atog atog = new atog();
        e = atog;
        anxl.registerDefaultInstance(atog.class, atog);
    }
}
