package defpackage;

/* renamed from: aute */
public final class aute extends anxl implements anzf {
    public static final anyb b = new autd();
    public static final aute d;
    private static volatile anzq e;
    public anxz a = anxl.emptyIntList();
    public anyd c = anxl.emptyProtobufList();

    private aute() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(d, "\u0001\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001\u001e\u0002\u001b", new Object[]{"a", auqx.a(), "c", auta.class});
            case 3:
                return new aute();
            case 4:
                return new autg();
            case 5:
                return d;
            case 6:
                Object obj3 = e;
                if (obj3 == null) {
                    synchronized (aute.class) {
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
        aute aute = new aute();
        d = aute;
        anxl.registerDefaultInstance(aute.class, aute);
    }
}
