package defpackage;

/* renamed from: arhk */
public final class arhk extends anxl implements anzf {
    private static volatile anzq A;
    public static final anyb x = new arhn();
    public static final arhk z;
    public int a;
    public int b;
    public boolean c;
    public int d;
    public boolean e;
    public boolean f;
    public boolean g;
    public int h;
    public boolean i;
    public boolean j;
    public boolean k;
    public boolean l;
    public boolean m;
    public boolean n;
    public int o;
    public boolean p;
    public int q;
    public int r;
    public boolean s;
    public boolean t;
    public int u;
    public boolean v;
    public anxz w = anxl.emptyIntList();
    public boolean y;

    private arhk() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(z, "\u0001\u0016\u0000\u0002\u0001\"\u0016\u0000\u0001\u0000\u0001\u0007\u0000\u0002\u0004\u0001\u0006\u0007\u0005\u0007\u0007\u0006\n\u0007\t\u000b\u0004\n\f\u0007\u000b\r\u0007\f\u000e\u0007\r\u0011\u0007\u0010\u0015\u0007\u0014\u0016\u0007\u0015\u0018\u0004\u0017\u0019\u0007\u0018\u001a\u0004\u0019\u001b\u0004\u001a\u001c\u0007\u001b\u001d\u0007\u001c\u001f\f\u001e \u0007\u001f!\u001e\"\u0007 ", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", aoyd.a, "v", "w", arhi.a(), "y"});
            case 3:
                return new arhk();
            case 4:
                return new arhm();
            case 5:
                return z;
            case 6:
                Object obj3 = A;
                if (obj3 == null) {
                    synchronized (arhk.class) {
                        obj3 = A;
                        if (obj3 == null) {
                            obj3 = new anxn(z);
                            A = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        arhk arhk = new arhk();
        z = arhk;
        anxl.registerDefaultInstance(arhk.class, arhk);
    }
}
