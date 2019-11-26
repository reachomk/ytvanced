package defpackage;

/* renamed from: awof */
public final class awof extends anxl implements anzf {
    public static final awof e;
    public static final anxr f;
    private static volatile anzq h;
    public int a;
    public awoh b;
    public awod c;
    public anvu d;
    private byte g = (byte) 2;

    private awof() {
        anxl.emptyProtobufList();
        this.d = anvu.a;
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
                return anxl.newMessageInfo(e, "\u0001\u0003\u0000\u0001\u0001\b\u0003\u0000\u0000\u0002\u0001\n\u0005\u0006Љ\u0004\bЉ\u0003", new Object[]{"a", "d", "c", "b"});
            case 3:
                return new awof();
            case 4:
                return new awoi();
            case 5:
                return e;
            case 6:
                Object obj3 = h;
                if (obj3 == null) {
                    synchronized (awof.class) {
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
        awof awof = new awof();
        e = awof;
        anxl.registerDefaultInstance(awof.class, awof);
        arfy arfy = arfy.a;
        awof awof2 = e;
        f = anxl.newSingularGeneratedExtension(arfy, awof2, awof2, null, 68, aobm.MESSAGE, awof.class);
    }
}
