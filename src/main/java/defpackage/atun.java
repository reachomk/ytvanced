package defpackage;

/* renamed from: atun */
public final class atun extends anxl implements anzf {
    public static final atun g;
    private static volatile anzq h;
    public int a;
    public int b;
    public anvu c = anvu.a;
    public String d = "";
    public long e;
    public atul f;

    private atun() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(g, "\u0001\u0005\u0000\u0001\u0001乿\u0005\u0000\u0000\u0000\u0001\u0004\u0000\u0002\n\u0001\u0003\b\u0002\u0005\u0002\u0004乿\t\u0005", new Object[]{"a", "b", "c", "d", "e", "f"});
            case 3:
                return new atun();
            case 4:
                return new atum();
            case 5:
                return g;
            case 6:
                Object obj3 = h;
                if (obj3 == null) {
                    synchronized (atun.class) {
                        obj3 = h;
                        if (obj3 == null) {
                            obj3 = new anxn(g);
                            h = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        atun atun = new atun();
        g = atun;
        anxl.registerDefaultInstance(atun.class, atun);
    }
}
