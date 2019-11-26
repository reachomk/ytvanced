package defpackage;

/* renamed from: bcbw */
public final class bcbw extends anxl implements anzf {
    public static final bcbw v;
    private static volatile anzq w;
    public int a;
    public String b;
    public String c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public bcdf j;
    public int k;
    public bcbs l;
    public bcbb m;
    public long n;
    public int o;
    public int p;
    public int q;
    public int r;
    public String s;
    public anye t = anxl.emptyLongList();
    public String u;

    private bcbw() {
        String str = "";
        this.b = str;
        this.c = str;
        anxl.emptyProtobufList();
        this.s = str;
        this.u = str;
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
                return anxl.newMessageInfo(v, "\u0001\u0014\u0000\u0001\u0001\u0018\u0014\u0000\u0001\u0000\u0001\b\u0000\u0002\b\u0001\u0003\u0004\u0003\u0004\u0004\u0004\u0005\u0004\u0005\u0006\u000b\u0006\u0007\u000b\u0007\b\f\b\n\t\t\u000b\t\u000b\f\t\f\r\u0002\r\u000e\f\u000e\u000f\f\u000f\u0010\u0004\u0011\u0011\b\u0012\u0013\u0004\u0010\u0014\b\u0014\u0015\u0017\u0018\f\n", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", bcce.a, "j", "l", "m", "n", "o", bccg.a, "p", bccb.a, "r", "s", "q", "u", "t", "k", bcby.a()});
            case 3:
                return new bcbw();
            case 4:
                return new bcbv();
            case 5:
                return v;
            case 6:
                Object obj3 = w;
                if (obj3 == null) {
                    synchronized (bcbw.class) {
                        obj3 = w;
                        if (obj3 == null) {
                            obj3 = new anxn(v);
                            w = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        bcbw bcbw = new bcbw();
        v = bcbw;
        anxl.registerDefaultInstance(bcbw.class, bcbw);
    }
}
