package defpackage;

/* renamed from: aytb */
public final class aytb extends anxl implements anzf {
    public static final aytb f;
    private static volatile anzq g;
    public int a;
    public aysx b;
    public int c;
    public int d;
    public int e;

    private aytb() {
        anxl.emptyProtobufList();
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\t\u0000\u0002\f\u0001\u0003\f\u0002\u0004\f\u0003", new Object[]{"a", "b", "c", ayug.a, "d", ayud.a, "e", ayub.a});
            case 3:
                return new aytb();
            case 4:
                return new ayte();
            case 5:
                return f;
            case 6:
                Object obj3 = g;
                if (obj3 == null) {
                    synchronized (aytb.class) {
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
        aytb aytb = new aytb();
        f = aytb;
        anxl.registerDefaultInstance(aytb.class, aytb);
    }
}
