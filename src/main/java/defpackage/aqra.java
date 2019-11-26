package defpackage;

/* renamed from: aqra */
public final class aqra extends anxl implements anzf {
    public static final aqra d;
    private static volatile anzq e;
    public int a;
    public anyd b = anxl.emptyProtobufList();
    public String c = "";

    private aqra() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002\b\u0000", new Object[]{"a", "b", aqrc.class, "c"});
            case 3:
                return new aqra();
            case 4:
                return new aqrd();
            case 5:
                return d;
            case 6:
                Object obj3 = e;
                if (obj3 == null) {
                    synchronized (aqra.class) {
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
        aqra aqra = new aqra();
        d = aqra;
        anxl.registerDefaultInstance(aqra.class, aqra);
    }
}
