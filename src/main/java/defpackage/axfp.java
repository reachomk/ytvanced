package defpackage;

/* renamed from: axfp */
public final class axfp extends anxl implements anzf {
    public static final axfp d;
    public static final anxr e;
    private static volatile anzq f;
    public int a;
    public long b;
    public anvu c = anvu.a;

    private axfp() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0003\u0000\u0002\n\u0001", new Object[]{"a", "b", "c"});
            case 3:
                return new axfp();
            case 4:
                return new axfo();
            case 5:
                return d;
            case 6:
                Object obj3 = f;
                if (obj3 == null) {
                    synchronized (axfp.class) {
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
        axfp axfp = new axfp();
        d = axfp;
        anxl.registerDefaultInstance(axfp.class, axfp);
        arce arce = arce.a;
        axfp axfp2 = d;
        e = anxl.newSingularGeneratedExtension(arce, axfp2, axfp2, null, 214525687, aobm.MESSAGE, axfp.class);
    }
}
