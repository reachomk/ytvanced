package defpackage;

/* renamed from: azwj */
public final class azwj extends anxl implements anzf {
    public static final azwj h;
    private static volatile anzq i;
    public int a;
    public int b;
    public azwd c;
    public boolean d;
    public float e;
    public boolean f;
    public float g;

    private azwj() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001\f\u0000\u0002\t\u0001\u0003\u0007\u0002\u0004\u0001\u0003\u0005\u0007\u0004\u0006\u0001\u0005", new Object[]{"a", "b", azwl.a(), "c", "d", "e", "f", "g"});
            case 3:
                return new azwj();
            case 4:
                return new azwi();
            case 5:
                return h;
            case 6:
                Object obj3 = i;
                if (obj3 == null) {
                    synchronized (azwj.class) {
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
        azwj azwj = new azwj();
        h = azwj;
        anxl.registerDefaultInstance(azwj.class, azwj);
    }
}
