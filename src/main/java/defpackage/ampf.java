package defpackage;

/* renamed from: ampf */
public final class ampf extends anxl implements anzf {
    public static final ampf d;
    private static volatile anzq f;
    public int a;
    public anvu b = anvu.a;
    public int c;
    private byte e = (byte) 2;

    private ampf() {
        anxl.emptyIntList();
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.e);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.e = b;
                return null;
            case 2:
                return anxl.newMessageInfo(d, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0002\u0001Ԋ\u0000\u0003ԋ\u0002", new Object[]{"a", "b", "c"});
            case 3:
                return new ampf();
            case 4:
                return new ampi();
            case 5:
                return d;
            case 6:
                Object obj3 = f;
                if (obj3 == null) {
                    synchronized (ampf.class) {
                        obj3 = f;
                        if (obj3 == null) {
                            obj3 = new anxn(d);
                            f = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        ampf ampf = new ampf();
        d = ampf;
        anxl.registerDefaultInstance(ampf.class, ampf);
    }
}
