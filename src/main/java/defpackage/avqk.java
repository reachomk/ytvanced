package defpackage;

/* renamed from: avqk */
public final class avqk extends anxl implements anzf {
    public static final avqk g;
    private static volatile anzq h;
    public int a;
    public boolean b;
    public int c;
    public long d;
    public avqo e;
    public boolean f;

    private avqk() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001\u0007\u0000\u0002\u000b\u0001\u0003\u0002\u0002\u0004\t\u0003\u0005\u0007\u0004", new Object[]{"a", "b", "c", "d", "e", "f"});
            case 3:
                return new avqk();
            case 4:
                return new avqj();
            case 5:
                return g;
            case 6:
                Object obj3 = h;
                if (obj3 == null) {
                    synchronized (avqk.class) {
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
        avqk avqk = new avqk();
        g = avqk;
        anxl.registerDefaultInstance(avqk.class, avqk);
    }
}
