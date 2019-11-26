package defpackage;

/* renamed from: auta */
public final class auta extends anxl implements anzf {
    public static final auta d;
    private static volatile anzq e;
    public int a;
    public int b = aocf.UNSET_ENUM_VALUE;
    public int c = Integer.MAX_VALUE;

    private auta() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0004\u0000\u0002\u0004\u0001", new Object[]{"a", "b", "c"});
            case 3:
                return new auta();
            case 4:
                return new ausz();
            case 5:
                return d;
            case 6:
                Object obj3 = e;
                if (obj3 == null) {
                    synchronized (auta.class) {
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
        auta auta = new auta();
        d = auta;
        anxl.registerDefaultInstance(auta.class, auta);
    }
}
