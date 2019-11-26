package defpackage;

/* renamed from: avla */
public final class avla extends anxl implements anzf {
    public static final avla c;
    private static volatile anzq d;
    public int a = 0;
    public Object b;

    private avla() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(c, "\u0001\u0004\u0001\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000", new Object[]{"b", "a", avli.class, avkz.class, avlg.class, avle.class});
            case 3:
                return new avla();
            case 4:
                return new avlb();
            case 5:
                return c;
            case 6:
                Object obj3 = d;
                if (obj3 == null) {
                    synchronized (avla.class) {
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
        avla avla = new avla();
        c = avla;
        anxl.registerDefaultInstance(avla.class, avla);
    }
}
