package defpackage;

/* renamed from: argt */
public final class argt extends anxl implements anzf {
    public static final argt g;
    private static volatile anzq h;
    public int a;
    public boolean b;
    public anyd c = anxl.emptyProtobufList();
    public boolean d;
    public argv e;
    public boolean f;

    private argt() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(g, "\u0001\u0005\u0000\u0001\u0001\n\u0005\u0000\u0001\u0000\u0001\u0007\u0000\u0002\u001b\u0004\u0007\u0002\u0006\t\u0004\n\u0007\b", new Object[]{"a", "b", "c", argx.class, "d", "e", "f"});
            case 3:
                return new argt();
            case 4:
                return new args();
            case 5:
                return g;
            case 6:
                Object obj3 = h;
                if (obj3 == null) {
                    synchronized (argt.class) {
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
        argt argt = new argt();
        g = argt;
        anxl.registerDefaultInstance(argt.class, argt);
    }
}
