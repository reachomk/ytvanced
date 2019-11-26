package defpackage;

/* renamed from: ayuw */
public final class ayuw extends anxl implements anzf {
    public static final ayuw h;
    private static volatile anzq i;
    public int a;
    public boolean b;
    public boolean c;
    public int d;
    public boolean e;
    public boolean f;
    public boolean g;

    private ayuw() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(h, "\u0001\u0006\u0000\u0001\u0003\u0012\u0006\u0000\u0000\u0000\u0003\u0007\u0001\u0005\u0007\u0002\u0006\f\u0003\t\u0007\u0005\n\u0007\u0006\u0012\u0007\r", new Object[]{"a", "b", "c", "d", ayux.a, "e", "f", "g"});
            case 3:
                return new ayuw();
            case 4:
                return new ayuz();
            case 5:
                return h;
            case 6:
                Object obj3 = i;
                if (obj3 == null) {
                    synchronized (ayuw.class) {
                        obj3 = i;
                        if (obj3 == null) {
                            obj3 = new anxn(h);
                            i = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        ayuw ayuw = new ayuw();
        h = ayuw;
        anxl.registerDefaultInstance(ayuw.class, ayuw);
    }
}
