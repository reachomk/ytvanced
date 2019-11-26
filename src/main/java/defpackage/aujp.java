package defpackage;

/* renamed from: aujp */
public final class aujp extends anxl implements anzf {
    public static final aujp C;
    private static volatile anzq D;
    public boolean A;
    public int B;
    public int a;
    public int b;
    public int c;
    public boolean d;
    public boolean e;
    public int f;
    public int g;
    public int h;
    public int i;
    public boolean j;
    public boolean k;
    public boolean l;
    public boolean m;
    public boolean n;
    public boolean o;
    public int p;
    public boolean q;
    public int r;
    public int s;
    public int t;
    public int u;
    public int v;
    public boolean w;
    public boolean x;
    public boolean y;
    public boolean z;

    private aujp() {
        anxl.emptyIntList();
        anxl.emptyProtobufList();
        anxl.emptyProtobufList();
        anxl.emptyProtobufList();
        anxl.emptyProtobufList();
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(C, "\u0001\u0019\u0000\u0003\u0006N\u0019\u0000\u0000\u0000\u0006\u0007\u0005\u0007\u0007\u0006\b\u0004\u0007\t\u0004\b\u0011\f\u0010\u0012\u0004\t\u0014\u0007\u0013\u0019\u0007\u0018\u001a\u0007\u0019\u001d\u0007\u001c\u001e\u0007\u001d\u001f\u0007\u001e \u0007 !\u0004!\"\u0004\"#\u0004#$\u0004$%\u0004%7\u0007;8\u0004\u001f9\u0007<?\u0007@C\u0007EL\u0007GN\u0004I", new Object[]{"a", "b", "c", "d", "e", "f", "g", "i", aujr.a, "h", "j", "k", "l", "m", "n", "o", "q", "r", "s", "t", "u", "v", "w", "p", "x", "y", "z", "A", "B"});
            case 3:
                return new aujp();
            case 4:
                return new auju();
            case 5:
                return C;
            case 6:
                Object obj3 = D;
                if (obj3 == null) {
                    synchronized (aujp.class) {
                        obj3 = D;
                        if (obj3 == null) {
                            obj3 = new anxn(C);
                            D = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        aujp aujp = new aujp();
        C = aujp;
        anxl.registerDefaultInstance(aujp.class, aujp);
    }
}
