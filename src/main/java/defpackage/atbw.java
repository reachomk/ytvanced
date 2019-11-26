package defpackage;

/* renamed from: atbw */
public final class atbw extends anxl implements anzf {
    public static final atbw f;
    private static volatile anzq g;
    public int a;
    public int b;
    public int c;
    public anyd d = anxl.emptyProtobufList();
    public anvu e = anvu.a;

    private atbw() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\f\u0000\u0002\u0004\u0001\u0003\u001b\u0004\n\u0002", new Object[]{"a", "b", atbx.a, "c", "d", atbs.class, "e"});
            case 3:
                return new atbw();
            case 4:
                return new atbv();
            case 5:
                return f;
            case 6:
                Object obj3 = g;
                if (obj3 == null) {
                    synchronized (atbw.class) {
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
        atbw atbw = new atbw();
        f = atbw;
        anxl.registerDefaultInstance(atbw.class, atbw);
    }
}
