package defpackage;

/* renamed from: ammx */
public final class ammx extends anxl implements anzf {
    public static final ammx d;
    private static volatile anzq e;
    public anyd a = anxl.emptyProtobufList();
    public anxz b = anxl.emptyIntList();
    public boolean c;

    private ammx() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0002\u0000\u0001\u001b\u0002'\u0003\u0007", new Object[]{"a", ammz.class, "b", "c"});
            case 3:
                return new ammx();
            case 4:
                return new amna();
            case 5:
                return d;
            case 6:
                Object obj3 = e;
                if (obj3 == null) {
                    synchronized (ammx.class) {
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
        ammx ammx = new ammx();
        d = ammx;
        anxl.registerDefaultInstance(ammx.class, ammx);
    }
}
