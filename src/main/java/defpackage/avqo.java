package defpackage;

/* renamed from: avqo */
public final class avqo extends anxl implements anzf {
    public static final avqo c;
    private static volatile anzq d;
    public int a = 0;
    public Object b;

    private avqo() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(c, "\u0001\u0001\u0001\u0000䃘䃘\u0001\u0000\u0000\u0000䃘<\u0000", new Object[]{"b", "a", avqi.class});
            case 3:
                return new avqo();
            case 4:
                return new avqn();
            case 5:
                return c;
            case 6:
                Object obj3 = d;
                if (obj3 == null) {
                    synchronized (avqo.class) {
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
        avqo avqo = new avqo();
        c = avqo;
        anxl.registerDefaultInstance(avqo.class, avqo);
    }
}
