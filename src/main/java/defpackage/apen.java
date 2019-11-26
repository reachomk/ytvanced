package defpackage;

/* renamed from: apen */
public final class apen extends anxl implements anzf {
    public static final apen d;
    private static volatile anzq f;
    public int a;
    public ayvi b;
    public aqwx c;
    private byte e = (byte) 2;

    private apen() {
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
                return anxl.newMessageInfo(d, "\u0001\u0002\u0000\u0001ﱃ᥯⨅\u0002\u0000\u0000\u0002ﱃ᥯Љ\u0001⨅Љ\u0000", new Object[]{"a", "c", "b"});
            case 3:
                return new apen();
            case 4:
                return new apem();
            case 5:
                return d;
            case 6:
                Object obj3 = f;
                if (obj3 == null) {
                    synchronized (apen.class) {
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
        apen apen = new apen();
        d = apen;
        anxl.registerDefaultInstance(apen.class, apen);
    }
}
