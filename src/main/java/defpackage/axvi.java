package defpackage;

/* renamed from: axvi */
public final class axvi extends anxl implements anzf {
    public static final axvi c;
    private static volatile anzq e;
    public int a;
    public arml b;
    private byte d = (byte) 2;

    private axvi() {
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
                return anxl.newMessageInfo(c, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0001\u0002Љ\u0001", new Object[]{"a", "b"});
            case 3:
                return new axvi();
            case 4:
                return new axvh();
            case 5:
                return c;
            case 6:
                Object obj3 = e;
                if (obj3 == null) {
                    synchronized (axvi.class) {
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
        axvi axvi = new axvi();
        c = axvi;
        anxl.registerDefaultInstance(axvi.class, axvi);
    }
}
