package defpackage;

/* renamed from: ansr */
public final class ansr extends anxl implements anzf {
    public static final ansr d;
    private static volatile anzq e;
    public int a = 0;
    public Object b;
    public String c = "";

    private ansr() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(d, "\u0000\u0003\u0001\u0000\u0004\b\u0003\u0000\u0000\u0000\u0004<\u0000\u0007Ȼ\u0000\bȈ", new Object[]{"b", "a", ansf.class, "c"});
            case 3:
                return new ansr();
            case 4:
                return new ansq();
            case 5:
                return d;
            case 6:
                Object obj3 = e;
                if (obj3 == null) {
                    synchronized (ansr.class) {
                        obj3 = e;
                        if (obj3 == null) {
                            obj3 = new anxn(d);
                            e = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        ansr ansr = new ansr();
        d = ansr;
        anxl.registerDefaultInstance(ansr.class, ansr);
    }
}
