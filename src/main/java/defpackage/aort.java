package defpackage;

/* renamed from: aort */
public final class aort extends anxl implements anzf {
    public static final aort s;
    private static volatile anzq t;
    public int a;
    public boolean b;
    public float c;
    public float d;
    public float e;
    public float f;
    public int g;
    public boolean h;
    public boolean i;
    public boolean j;
    public int k;
    public boolean l;
    public int m;
    public boolean n;
    public boolean o;
    public float p;
    public boolean q;
    public boolean r;

    private aort() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(s, "\u0001\u0011\u0000\u0001\u0002\u0016\u0011\u0000\u0000\u0000\u0002\u0007\u0001\u0003\u0001\u0002\u0004\u0001\u0003\u0005\u0007\u0007\b\u0007\t\t\u0007\n\n\u0004\u000b\f\u0007\f\r\u0004\r\u000e\u0004\u0006\u000f\u0001\u0004\u0010\u0007\u000e\u0011\u0007\u000f\u0012\u0001\u0010\u0014\u0001\u0005\u0015\u0007\u0012\u0016\u0007\u0013", new Object[]{"a", "b", "c", "d", "h", "i", "j", "k", "l", "m", "g", "e", "n", "o", "p", "f", "q", "r"});
            case 3:
                return new aort();
            case 4:
                return new aorw();
            case 5:
                return s;
            case 6:
                Object obj3 = t;
                if (obj3 == null) {
                    synchronized (aort.class) {
                        obj3 = t;
                        if (obj3 == null) {
                            obj3 = new anxn(s);
                            t = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        aort aort = new aort();
        s = aort;
        anxl.registerDefaultInstance(aort.class, aort);
    }
}
