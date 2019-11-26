package defpackage;

/* renamed from: baao */
public final class baao extends anxl implements anzf {
    public static final baao c;
    private static volatile anzq d;
    public int a = 0;
    public Object b;

    private baao() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(c, "\u0001\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001;\u0000\u0002<\u0000", new Object[]{"b", "a", baar.class});
            case 3:
                return new baao();
            case 4:
                return new baat();
            case 5:
                return c;
            case 6:
                Object obj3 = d;
                if (obj3 == null) {
                    synchronized (baao.class) {
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
        baao baao = new baao();
        c = baao;
        anxl.registerDefaultInstance(baao.class, baao);
    }
}
