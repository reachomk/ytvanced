package defpackage;

/* renamed from: avlw */
public final class avlw extends anxl implements anzf {
    public static final avlw A;
    private static volatile anzq B;
    public int a;
    public long b;
    public long c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    public anxz i = anxl.emptyIntList();
    public boolean j;
    public int k;
    public boolean l;
    public boolean m;
    public int n;
    public boolean o;
    public boolean p;
    public boolean q;
    public boolean r;
    public boolean s;
    public int t;
    public int u;
    public boolean v;
    public int w;
    public int x;
    public boolean y;
    public boolean z;

    private avlw() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(A, "\u0001\u0019\u0000\u0001\u0001\u001e\u0019\u0000\u0001\u0000\u0001\u0002\u0000\u0002\u0002\u0001\u0003\u0007\u0002\u0004\u0007\u0004\u0005\u0007\u0005\u0006\u0007\u0006\u0007\u0016\b\u0007\u0007\t\u0004\b\n\u0007\t\f\u0007\n\r\u0004\u000b\u000f\u0007\u000f\u0010\u0007\u0010\u0014\u0007\u0014\u0015\u0004\u0015\u0016\u0004\u0016\u0017\u0007\u0017\u0018\u0004\u0018\u0019\u0004\u0019\u001a\u0007\f\u001b\u0007\r\u001c\u0007\u0003\u001d\u0007\u001a\u001e\u0007\u001b", new Object[]{"a", "b", "c", "d", "f", "g", "h", "i", "j", "k", "l", "m", "n", "q", "r", "s", "t", "u", "v", "w", "x", "o", "p", "e", "y", "z"});
            case 3:
                return new avlw();
            case 4:
                return new avlz();
            case 5:
                return A;
            case 6:
                Object obj3 = B;
                if (obj3 == null) {
                    synchronized (avlw.class) {
                        obj3 = B;
                        if (obj3 == null) {
                            obj3 = new anxn(A);
                            B = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        avlw avlw = new avlw();
        A = avlw;
        anxl.registerDefaultInstance(avlw.class, avlw);
    }
}
