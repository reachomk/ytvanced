package defpackage;

/* renamed from: atur */
public final class atur extends anxl implements anzf {
    public static final atur c;
    private static volatile anzq d;
    public int a = 0;
    public Object b;

    private atur() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(c, "\u0001\u0001\u0001\u0000㒺㒺\u0001\u0000\u0000\u0000㒺<\u0000", new Object[]{"b", "a", atut.class});
            case 3:
                return new atur();
            case 4:
                return new atuq();
            case 5:
                return c;
            case 6:
                Object obj3 = d;
                if (obj3 == null) {
                    synchronized (atur.class) {
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
        atur atur = new atur();
        c = atur;
        anxl.registerDefaultInstance(atur.class, atur);
    }
}
