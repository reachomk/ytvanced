package defpackage;

/* renamed from: axzs */
public final class axzs extends anxl implements anzf {
    public static final axzs c;
    private static volatile anzq e;
    public int a;
    public axzr b;
    private byte d = (byte) 2;

    private axzs() {
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
                return anxl.newMessageInfo(c, "\u0001\u0001\u0000\u0001㙻㙻\u0001\u0000\u0000\u0001㙻Љ\u0000", new Object[]{"a", "b"});
            case 3:
                return new axzs();
            case 4:
                return new axzv();
            case 5:
                return c;
            case 6:
                Object obj3 = e;
                if (obj3 == null) {
                    synchronized (axzs.class) {
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
        axzs axzs = new axzs();
        c = axzs;
        anxl.registerDefaultInstance(axzs.class, axzs);
    }
}
