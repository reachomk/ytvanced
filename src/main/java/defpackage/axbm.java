package defpackage;

/* renamed from: axbm */
public final class axbm extends anxl implements anzf {
    public static final axbm c;
    private static volatile anzq e;
    public int a = 0;
    public Object b;
    private byte d = (byte) 2;

    private axbm() {
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
                return anxl.newMessageInfo(c, "\u0001\u0003\u0001\u0000ᩭᾮ\u0003\u0000\u0000\u0003ᩭм\u0000ἑм\u0000ᾮм\u0000", new Object[]{"b", "a", axwa.class, aphg.class, auvn.class});
            case 3:
                return new axbm();
            case 4:
                return new axbp();
            case 5:
                return c;
            case 6:
                Object obj3 = e;
                if (obj3 == null) {
                    synchronized (axbm.class) {
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
        axbm axbm = new axbm();
        c = axbm;
        anxl.registerDefaultInstance(axbm.class, axbm);
    }
}
