package defpackage;

@Deprecated
/* renamed from: awme */
public final class awme extends anxl implements anzf {
    public static final awme c;
    public static final anxr d;
    private static volatile anzq f;
    public int a;
    public azuj b;
    private byte e = (byte) 2;

    private awme() {
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
                return new awme();
            case 4:
                return new awmh();
            case 5:
                return c;
            case 6:
                Object obj3 = f;
                if (obj3 == null) {
                    synchronized (awme.class) {
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
        awme awme = new awme();
        c = awme;
        anxl.registerDefaultInstance(awme.class, awme);
        azsr azsr = azsr.a;
        awme awme2 = c;
        d = anxl.newSingularGeneratedExtension(azsr, awme2, awme2, null, 202698262, aobm.MESSAGE, awme.class);
    }
}
