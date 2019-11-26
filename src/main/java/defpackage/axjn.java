package defpackage;

/* renamed from: axjn */
public final class axjn extends anxl implements anzf {
    public static final axjn d;
    private static volatile anzq f;
    public int a;
    public axjt b;
    public apdn c;
    private byte e = (byte) 2;

    private axjn() {
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
                return anxl.newMessageInfo(d, "\u0001\u0002\u0000\u0001ￆᡇ⬘\u0002\u0000\u0000\u0002ￆᡇЉ\u0001⬘Љ\u0000", new Object[]{"a", "c", "b"});
            case 3:
                return new axjn();
            case 4:
                return new axjq();
            case 5:
                return d;
            case 6:
                Object obj3 = f;
                if (obj3 == null) {
                    synchronized (axjn.class) {
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
        axjn axjn = new axjn();
        d = axjn;
        anxl.registerDefaultInstance(axjn.class, axjn);
    }
}
