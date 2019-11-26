package defpackage;

/* renamed from: aztq */
public final class aztq extends anxl implements anzf {
    public static final aztq c;
    public static final anxr d;
    private static volatile anzq f;
    public int a;
    public azvv b;
    private byte e = (byte) 2;

    private aztq() {
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
                return anxl.newMessageInfo(c, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0001\u0002Љ\u0000", new Object[]{"a", "b"});
            case 3:
                return new aztq();
            case 4:
                return new aztt();
            case 5:
                return c;
            case 6:
                Object obj3 = f;
                if (obj3 == null) {
                    synchronized (aztq.class) {
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
        aztq aztq = new aztq();
        c = aztq;
        anxl.registerDefaultInstance(aztq.class, aztq);
        azvv azvv = azvv.a;
        aztq aztq2 = c;
        d = anxl.newSingularGeneratedExtension(azvv, aztq2, aztq2, null, 184872809, aobm.MESSAGE, aztq.class);
    }
}
