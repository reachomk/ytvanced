package defpackage;

/* renamed from: atqw */
public final class atqw extends anxl implements anzf {
    public static final atqw d;
    private static volatile anzq e;
    public int a;
    public int b;
    public long c;

    private atqw() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(d, "\u0001\u0002\u0000\u0001\u0003\u0005\u0002\u0000\u0000\u0000\u0003\u0004\u0002\u0005\u0003\u0003", new Object[]{"a", "b", "c"});
            case 3:
                return new atqw();
            case 4:
                return new atqv();
            case 5:
                return d;
            case 6:
                Object obj3 = e;
                if (obj3 == null) {
                    synchronized (atqw.class) {
                        obj3 = e;
                        if (obj3 == null) {
                            obj3 = new anxn(d);
                            e = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        atqw atqw = new atqw();
        d = atqw;
        anxl.registerDefaultInstance(atqw.class, atqw);
    }
}
