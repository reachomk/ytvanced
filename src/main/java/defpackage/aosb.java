package defpackage;

/* renamed from: aosb */
public final class aosb extends anxl implements anzf {
    public static final aosb n;
    private static volatile anzq o;
    public int a;
    public boolean b;
    public boolean c;
    public boolean d;
    public int e;
    public boolean f;
    public int g;
    public int h;
    public anyd i = anxl.emptyProtobufList();
    public boolean j;
    public float k;
    public boolean l;
    public boolean m;

    private aosb() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(n, "\u0001\f\u0000\u0001\u0001\u0012\f\u0000\u0001\u0000\u0001\u0007\u0000\u0002\u0007\u0001\u0003\u0007\u0002\u0004\f\u0003\u0006\u0007\u0004\u0007\u0004\u0005\b\u0004\u0006\t\u001b\n\u0007\b\f\u0001\n\u0010\u0007\u000e\u0012\u0007\u0010", new Object[]{"a", "b", "c", "d", "e", aosd.a, "f", "g", "h", "i", aosf.class, "j", "k", "l", "m"});
            case 3:
                return new aosb();
            case 4:
                return new aosg();
            case 5:
                return n;
            case 6:
                Object obj3 = o;
                if (obj3 == null) {
                    synchronized (aosb.class) {
                        obj3 = o;
                        if (obj3 == null) {
                            obj3 = new anxn(n);
                            o = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        aosb aosb = new aosb();
        n = aosb;
        anxl.registerDefaultInstance(aosb.class, aosb);
    }
}
