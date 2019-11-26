package defpackage;

/* renamed from: ascc */
public final class ascc extends anxl implements anzf {
    public static final ascc c;
    private static volatile anzq e;
    public int a = 0;
    public Object b;
    private byte d = (byte) 2;

    private ascc() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.d);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.d = b;
                return null;
            case 2:
                return anxl.newMessageInfo(c, "\u0001\u0002\u0001\u0000⣄⯌\u0002\u0000\u0000\u0001⣄м\u0000⯌<\u0000", new Object[]{"b", "a", arld.class, ayhe.class});
            case 3:
                return new ascc();
            case 4:
                return new ascf();
            case 5:
                return c;
            case 6:
                Object obj3 = e;
                if (obj3 == null) {
                    synchronized (ascc.class) {
                        obj3 = e;
                        if (obj3 == null) {
                            obj3 = new anxn(c);
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
        ascc ascc = new ascc();
        c = ascc;
        anxl.registerDefaultInstance(ascc.class, ascc);
    }
}
