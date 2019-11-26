package defpackage;

/* renamed from: avzt */
public final class avzt extends anxl implements anzf {
    public static final avzt c;
    private static volatile anzq d;
    public int a;
    public int b;

    private avzt() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f\u0000", new Object[]{"a", "b", avzu.a});
            case 3:
                return new avzt();
            case 4:
                return new avzs();
            case 5:
                return c;
            case 6:
                Object obj3 = d;
                if (obj3 == null) {
                    synchronized (avzt.class) {
                        obj3 = d;
                        if (obj3 == null) {
                            obj3 = new anxn(c);
                            d = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        avzt avzt = new avzt();
        c = avzt;
        anxl.registerDefaultInstance(avzt.class, avzt);
    }
}
