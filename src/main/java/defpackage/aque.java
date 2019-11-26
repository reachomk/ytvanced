package defpackage;

/* renamed from: aque */
public final class aque extends anxl implements anzf {
    public static final aque h;
    private static volatile anzq i;
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;

    private aque() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(h, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0000\u0000\u0001\f\u0000\u0002\u0004\u0001\u0003\u0004\u0002\u0004\u0004\u0003\u0006\u0004\u0005\u0007\u0004\u0006", new Object[]{"a", "b", aquj.a, "c", "d", "e", "f", "g"});
            case 3:
                return new aque();
            case 4:
                return new aquh();
            case 5:
                return h;
            case 6:
                Object obj3 = i;
                if (obj3 == null) {
                    synchronized (aque.class) {
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
        aque aque = new aque();
        h = aque;
        anxl.registerDefaultInstance(aque.class, aque);
    }
}
