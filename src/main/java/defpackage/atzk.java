package defpackage;

/* renamed from: atzk */
public final class atzk extends anxl implements anzf {
    public static final atzk g;
    private static volatile anzq h;
    public int a;
    public boolean b;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;

    private atzk() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(g, "\u0001\u0005\u0000\u0001\u0001\f\u0005\u0000\u0000\u0000\u0001\u0007\u0000\u0002\u0007\u0001\u0006\u0007\u0005\n\u0007\b\f\u0007\n", new Object[]{"a", "b", "c", "d", "e", "f"});
            case 3:
                return new atzk();
            case 4:
                return new atzj();
            case 5:
                return g;
            case 6:
                Object obj3 = h;
                if (obj3 == null) {
                    synchronized (atzk.class) {
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
        atzk atzk = new atzk();
        g = atzk;
        anxl.registerDefaultInstance(atzk.class, atzk);
    }
}
