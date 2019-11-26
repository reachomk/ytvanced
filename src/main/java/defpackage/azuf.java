package defpackage;

/* renamed from: azuf */
public final class azuf extends anxl implements anzf {
    public static final azuf e;
    public static final anxr f;
    private static volatile anzq h;
    public int a;
    public azsg b;
    public int c;
    public boolean d;
    private byte g = (byte) 2;

    private azuf() {
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
                return anxl.newMessageInfo(e, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0001\u0001Љ\u0000\u0002\u0004\u0001\u0004\u0007\u0003", new Object[]{"a", "b", "c", "d"});
            case 3:
                return new azuf();
            case 4:
                return new azue();
            case 5:
                return e;
            case 6:
                Object obj3 = h;
                if (obj3 == null) {
                    synchronized (azuf.class) {
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
        azuf azuf = new azuf();
        e = azuf;
        anxl.registerDefaultInstance(azuf.class, azuf);
        azvl azvl = azvl.a;
        azuf azuf2 = e;
        f = anxl.newSingularGeneratedExtension(azvl, azuf2, azuf2, null, 194116769, aobm.MESSAGE, azuf.class);
    }
}
