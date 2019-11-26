package defpackage;

/* renamed from: trx */
public final class trx extends anxl implements anzf {
    public static final trx e;
    private static volatile anzq g;
    public int a;
    public angm b;
    public int c;
    public int d;
    private byte f = (byte) 2;

    private trx() {
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
                return anxl.newMessageInfo(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001Љ\u0000\u0002\u0004\u0001\u0003\f\u0002", new Object[]{"a", "b", "c", "d", anbx.a});
            case 3:
                return new trx();
            case 4:
                return new trw();
            case 5:
                return e;
            case 6:
                Object obj3 = g;
                if (obj3 == null) {
                    synchronized (trx.class) {
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
        trx trx = new trx();
        e = trx;
        anxl.registerDefaultInstance(trx.class, trx);
    }
}
