package defpackage;

/* renamed from: axlj */
public final class axlj extends anxl implements anzf {
    public static final axlj c;
    public static final anxr d;
    private static volatile anzq f;
    public int a;
    public azuj b;
    private byte e = (byte) 2;

    private axlj() {
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
                return anxl.newMessageInfo(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001Љ\u0000", new Object[]{"a", "b"});
            case 3:
                return new axlj();
            case 4:
                return new axll();
            case 5:
                return c;
            case 6:
                Object obj3 = f;
                if (obj3 == null) {
                    synchronized (axlj.class) {
                        obj3 = f;
                        if (obj3 == null) {
                            obj3 = new anxn(c);
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
        axlj axlj = new axlj();
        c = axlj;
        anxl.registerDefaultInstance(axlj.class, axlj);
        azsr azsr = azsr.a;
        axlj axlj2 = c;
        d = anxl.newSingularGeneratedExtension(azsr, axlj2, axlj2, null, 234871417, aobm.MESSAGE, axlj.class);
    }
}
