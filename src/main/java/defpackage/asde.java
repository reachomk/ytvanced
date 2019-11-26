package defpackage;

/* renamed from: asde */
public final class asde extends anxl implements anzf {
    public static final asde e;
    private static volatile anzq g;
    public int a;
    public ashy b;
    public anvu c = anvu.a;
    public int d;
    private byte f = (byte) 2;

    private asde() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.f);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.f = b;
                return null;
            case 2:
                return anxl.newMessageInfo(e, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0001\u0001Љ\u0000\u0003\n\u0001\u0004\f\u0002", new Object[]{"a", "b", "c", "d", aplh.a});
            case 3:
                return new asde();
            case 4:
                return new asdh();
            case 5:
                return e;
            case 6:
                Object obj3 = g;
                if (obj3 == null) {
                    synchronized (asde.class) {
                        obj3 = g;
                        if (obj3 == null) {
                            obj3 = new anxn(e);
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
        asde asde = new asde();
        e = asde;
        anxl.registerDefaultInstance(asde.class, asde);
    }
}
