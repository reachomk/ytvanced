package defpackage;

/* renamed from: ayyw */
public final class ayyw extends anxl implements anzf {
    public static final ayyw d;
    private static volatile anzq e;
    public int a;
    public anyd b = anxl.emptyProtobufList();
    public ayyy c;

    private ayyw() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001a\u0002\t\u0000", new Object[]{"a", "b", "c"});
            case 3:
                return new ayyw();
            case 4:
                return new ayyv();
            case 5:
                return d;
            case 6:
                Object obj3 = e;
                if (obj3 == null) {
                    synchronized (ayyw.class) {
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
        ayyw ayyw = new ayyw();
        d = ayyw;
        anxl.registerDefaultInstance(ayyw.class, ayyw);
    }
}
