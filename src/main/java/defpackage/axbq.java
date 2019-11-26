package defpackage;

/* renamed from: axbq */
public final class axbq extends anxl implements anzf {
    public static final axbq e;
    public static final anxr f;
    private static volatile anzq g;
    public int a;
    public int b;
    public int c;
    public boolean d = true;

    private axbq() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0000\u0002\u0004\u0001\u0003\u0007\u0002", new Object[]{"a", "b", "c", "d"});
            case 3:
                return new axbq();
            case 4:
                return new axbt();
            case 5:
                return e;
            case 6:
                Object obj3 = g;
                if (obj3 == null) {
                    synchronized (axbq.class) {
                        obj3 = g;
                        if (obj3 == null) {
                            obj3 = new anxn(e);
                            g = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        axbq axbq = new axbq();
        e = axbq;
        anxl.registerDefaultInstance(axbq.class, axbq);
        azvt azvt = azvt.a;
        axbq axbq2 = e;
        f = anxl.newSingularGeneratedExtension(azvt, axbq2, axbq2, null, 188911708, aobm.MESSAGE, axbq.class);
    }
}
