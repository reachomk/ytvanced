package defpackage;

/* renamed from: awan */
public final class awan extends anxl implements anzf {
    public static final awan s;
    private static volatile anzq t;
    public int a;
    public String b;
    public int c;
    public long d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public boolean k;
    public boolean l;
    public boolean m;
    public String n;
    public arkl o;
    public boolean p;
    public int q;
    public awap r;

    private awan() {
        String str = "";
        this.b = str;
        this.n = str;
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(s, "\u0001\u0011\u0000\u0001\u0003-\u0011\u0000\u0000\u0000\u0003\b\u0001\u0004\u000b\u0002\u0005\u0002\u0003\u0006\u000b\u0004\u0007\u000b\u0005\b\u000b\u0006\n\u0007\u000b\u000b\u0007\f\f\b\u000e\u0019\t\u0016\u001d\u0007\u001a \t\u001e%\u0004\u0007&\u0004\b)\u0004\t,\u0007\r-\f\u001b", new Object[]{"a", "b", "c", "d", "e", "f", "g", "k", "l", "n", "o", "p", "r", "h", "i", "j", "m", "q", aozb.a});
            case 3:
                return new awan();
            case 4:
                return new awam();
            case 5:
                return s;
            case 6:
                Object obj3 = t;
                if (obj3 == null) {
                    synchronized (awan.class) {
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
        awan awan = new awan();
        s = awan;
        anxl.registerDefaultInstance(awan.class, awan);
    }
}
