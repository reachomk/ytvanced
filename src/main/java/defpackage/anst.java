package defpackage;

/* renamed from: anst */
public final class anst extends anxl implements anzf {
    public static final anst c;
    private static volatile anzq d;
    public antg a;
    public String b = "";

    private anst() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\t", new Object[]{"b", "a"});
            case 3:
                return new anst();
            case 4:
                return new anss();
            case 5:
                return c;
            case 6:
                Object obj3 = d;
                if (obj3 == null) {
                    synchronized (anst.class) {
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
        anst anst = new anst();
        c = anst;
        anxl.registerDefaultInstance(anst.class, anst);
    }
}
