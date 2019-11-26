package defpackage;

/* renamed from: anto */
public final class anto extends anxl implements anzf {
    public static final anto f;
    private static volatile anzq g;
    public antg a;
    public String b = "";
    public anyd c = anxl.emptyProtobufList();
    public ants d;
    public int e;

    private anto() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(f, "\u0000\u0005\u0000\u0000\u0001\u0006\u0005\u0000\u0001\u0000\u0001\t\u0002Ȉ\u0003Ț\u0004\t\u0006\f", new Object[]{"a", "b", "c", "d", "e"});
            case 3:
                return new anto();
            case 4:
                return new antr();
            case 5:
                return f;
            case 6:
                Object obj3 = g;
                if (obj3 == null) {
                    synchronized (anto.class) {
                        obj3 = g;
                        if (obj3 == null) {
                            obj3 = new anxn(f);
                            g = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        anto anto = new anto();
        f = anto;
        anxl.registerDefaultInstance(anto.class, anto);
    }
}
