package defpackage;

/* renamed from: aych */
public final class aych extends anxl implements anzf {
    public static final aych h;
    private static volatile anzq i;
    public int a;
    public boolean b;
    public int c;
    public int d;
    public int e;
    public int f;
    public boolean g;

    private aych() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001\u0007\u0000\u0002\u0004\u0001\u0003\u0004\u0002\u0004\u0004\u0003\u0005\f\u0004\u0006\u0007\u0005", new Object[]{"a", "b", "c", "d", "e", "f", aycr.a, "g"});
            case 3:
                return new aych();
            case 4:
                return new aycg();
            case 5:
                return h;
            case 6:
                Object obj3 = i;
                if (obj3 == null) {
                    synchronized (aych.class) {
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
        aych aych = new aych();
        h = aych;
        anxl.registerDefaultInstance(aych.class, aych);
    }
}
