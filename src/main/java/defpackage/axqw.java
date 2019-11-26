package defpackage;

/* renamed from: axqw */
public final class axqw extends anxl implements anzf {
    public static final axqw h;
    private static volatile anzq i;
    public int a;
    public String b = "";
    public int c;
    public int d;
    public float e;
    public int f;
    public boolean g;

    private axqw() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(h, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0000\u0000\u0001\b\u0000\u0002\u0004\u0001\u0003\u0004\u0002\u0004\u0004\u0004\u0006\u0001\u0003\u0007\u0007\u0006", new Object[]{"a", "b", "c", "d", "f", "e", "g"});
            case 3:
                return new axqw();
            case 4:
                return new axqz();
            case 5:
                return h;
            case 6:
                Object obj3 = i;
                if (obj3 == null) {
                    synchronized (axqw.class) {
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
        axqw axqw = new axqw();
        h = axqw;
        anxl.registerDefaultInstance(axqw.class, axqw);
    }
}
