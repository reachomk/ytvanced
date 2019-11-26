package defpackage;

/* renamed from: ayuo */
public final class ayuo extends anxl implements anzf {
    public static final ayuo d;
    private static volatile anzq e;
    public int a;
    public axcb b;
    public aqzr c;

    private ayuo() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0000\u0002\t\u0001", new Object[]{"a", "b", "c"});
            case 3:
                return new ayuo();
            case 4:
                return new ayur();
            case 5:
                return d;
            case 6:
                Object obj3 = e;
                if (obj3 == null) {
                    synchronized (ayuo.class) {
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
        ayuo ayuo = new ayuo();
        d = ayuo;
        anxl.registerDefaultInstance(ayuo.class, ayuo);
    }
}
