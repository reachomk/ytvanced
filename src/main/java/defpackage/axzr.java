package defpackage;

/* renamed from: axzr */
public final class axzr extends anxl implements anzf {
    public static final axzr b;
    private static volatile anzq d;
    public anyd a = anxl.emptyProtobufList();
    private byte c = (byte) 2;

    private axzr() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.c);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.c = b;
                return null;
            case 2:
                return anxl.newMessageInfo(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"a", apxu.class});
            case 3:
                return new axzr();
            case 4:
                return new axzt();
            case 5:
                return b;
            case 6:
                Object obj3 = d;
                if (obj3 == null) {
                    synchronized (axzr.class) {
                        obj3 = d;
                        if (obj3 == null) {
                            obj3 = new anxn(b);
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
        axzr axzr = new axzr();
        b = axzr;
        anxl.registerDefaultInstance(axzr.class, axzr);
    }
}
