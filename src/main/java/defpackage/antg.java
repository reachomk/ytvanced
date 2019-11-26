package defpackage;

/* renamed from: antg */
public final class antg extends anxl implements anzf {
    public static final antg c;
    private static volatile anzq d;
    public String a = "";
    public boolean b;

    private antg() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(c, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002Ȉ\u0003\u0007", new Object[]{"a", "b"});
            case 3:
                return new antg();
            case 4:
                return new antj();
            case 5:
                return c;
            case 6:
                Object obj3 = d;
                if (obj3 == null) {
                    synchronized (antg.class) {
                        obj3 = d;
                        if (obj3 == null) {
                            obj3 = new anxn(c);
                            d = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        antg antg = new antg();
        c = antg;
        anxl.registerDefaultInstance(antg.class, antg);
    }
}
