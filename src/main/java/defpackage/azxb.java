package defpackage;

/* renamed from: azxb */
public final class azxb extends anxl implements anzf {
    public static final azxb e;
    public static final anxr f;
    private static volatile anzq h;
    public int a;
    public azsr b;
    public azsr c;
    public azsr d;
    private byte g = (byte) 2;

    private azxb() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.g);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.g = b;
                return null;
            case 2:
                return anxl.newMessageInfo(e, "\u0001\u0003\u0000\u0001\u0002\u0005\u0003\u0000\u0000\u0003\u0002Љ\u0000\u0003Љ\u0001\u0005Љ\u0002", new Object[]{"a", "b", "c", "d"});
            case 3:
                return new azxb();
            case 4:
                return new azxa();
            case 5:
                return e;
            case 6:
                Object obj3 = h;
                if (obj3 == null) {
                    synchronized (azxb.class) {
                        obj3 = h;
                        if (obj3 == null) {
                            obj3 = new anxn(e);
                            h = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        azxb azxb = new azxb();
        e = azxb;
        anxl.registerDefaultInstance(azxb.class, azxb);
        azwn azwn = azwn.a;
        azxb azxb2 = e;
        f = anxl.newSingularGeneratedExtension(azwn, azxb2, azxb2, null, 217374632, aobm.MESSAGE, azxb.class);
    }
}
