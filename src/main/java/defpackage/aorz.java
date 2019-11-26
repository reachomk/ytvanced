package defpackage;

/* renamed from: aorz */
public final class aorz extends anxl implements anzf {
    public static final aorz j;
    private static volatile anzq k;
    public int a;
    public boolean b;
    public int c;
    public int d;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;

    private aorz() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(j, "\u0001\b\u0000\u0001\u0001\n\b\u0000\u0000\u0000\u0001\u0007\u0000\u0004\f\u0003\u0005\f\u0004\u0006\u0007\u0005\u0007\u0007\u0006\b\u0007\u0007\t\u0007\b\n\u0007\t", new Object[]{"a", "b", "c", argo.a, "d", aosm.a, "e", "f", "g", "h", "i"});
            case 3:
                return new aorz();
            case 4:
                return new aosc();
            case 5:
                return j;
            case 6:
                Object obj3 = k;
                if (obj3 == null) {
                    synchronized (aorz.class) {
                        obj3 = k;
                        if (obj3 == null) {
                            obj3 = new anxn(j);
                            k = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        aorz aorz = new aorz();
        j = aorz;
        anxl.registerDefaultInstance(aorz.class, aorz);
    }
}
