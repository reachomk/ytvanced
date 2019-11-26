package defpackage;

/* renamed from: avqw */
public final class avqw extends anxl implements anzf {
    public static final avqw B;
    private static volatile anzq C;
    public int A;
    public int a;
    public String b;
    public String c;
    public String d;
    public int e;
    public int f;
    public long g;
    public long h;
    public long i;
    public long j;
    public long k;
    public int l;
    public boolean m;
    public int n;
    public int o;
    public int p;
    public String q;
    public int r;
    public int s;
    public int t;
    public boolean u;
    public boolean v;
    public int w;
    public int x;
    public anyd y = anxl.emptyProtobufList();
    public avqy z;

    private avqw() {
        String str = "";
        this.b = str;
        this.c = str;
        this.d = str;
        this.q = str;
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(B, "\u0001\u001a\u0000\u0001\u0001!\u001a\u0000\u0001\u0000\u0001\b\u0000\u0002\f\u0003\u0003\f\u0004\u0004\u0002\u0005\u0005\u0002\u0006\u0007\f\u000b\b\u0007\f\t\f\r\n\b\u0010\u000b\f\u0011\r\u000b\u0014\u000f\u0007\u0016\u0011\u0007\u0018\u0014\b\u0001\u0015\u0002\u0007\u0016\u0002\b\u0017\u0002\t\u0018\f\u000e\u0019\u0004\u001b\u001a\f\u001c\u001b\u001b\u001c\t\u001d\u001d\f\u0012\u001e\b\u0002 \u0004\u000f!\f\u001e", new Object[]{"a", "b", "e", avqr.a, "f", avqp.a, "g", "h", "l", aqvf.a, "m", "n", avof.a, "q", "r", avsi.a(), "t", "u", "v", "c", "i", "j", "k", "o", avog.a, "w", "x", axvm.a, "y", avra.class, "z", "s", avmp.a, "d", "p", "A", avqq.a});
            case 3:
                return new avqw();
            case 4:
                return new avqv();
            case 5:
                return B;
            case 6:
                Object obj3 = C;
                if (obj3 == null) {
                    synchronized (avqw.class) {
                        obj3 = C;
                        if (obj3 == null) {
                            obj3 = new anxn(B);
                            C = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        avqw avqw = new avqw();
        B = avqw;
        anxl.registerDefaultInstance(avqw.class, avqw);
    }
}
