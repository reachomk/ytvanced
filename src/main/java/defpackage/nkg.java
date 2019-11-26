package defpackage;

/* renamed from: nkg */
public final class nkg extends anxl implements anzf {
    public static final nkg q;
    private static volatile anzq r;
    public int a;
    public String b;
    public int c;
    public String d;
    public anyd e = anxl.emptyProtobufList();
    public anxz f = anxl.emptyIntList();
    public anvu g = anvu.a;
    public long h;
    public String i;
    public long j;
    public int k;
    public long l;
    public long m;
    public long n;
    public anye o;
    public String p;

    private nkg() {
        String str = "";
        this.b = str;
        this.d = str;
        this.i = str;
        this.o = anxl.emptyLongList();
        this.p = str;
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(q, "\u0001\u000f\u0000\u0001\u0001\u0010\u000f\u0000\u0003\u0000\u0001\b\u0000\u0003\u0004\u0002\u0004\b\u0003\u0005\u001b\u0006\n\u0004\u0007\u0002\u0005\b\b\u0006\t\u0002\u0007\n\u0004\b\u000b\u0002\t\f\u0002\n\r\u0002\u000b\u000e\u0014\u000f\b\f\u0010\u0016", new Object[]{"a", "b", "c", "d", "e", nkc.class, "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "f"});
            case 3:
                return new nkg();
            case 4:
                return new nkf();
            case 5:
                return q;
            case 6:
                Object obj3 = r;
                if (obj3 == null) {
                    synchronized (nkg.class) {
                        obj3 = r;
                        if (obj3 == null) {
                            obj3 = new anxn(q);
                            r = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        nkg nkg = new nkg();
        q = nkg;
        anxl.registerDefaultInstance(nkg.class, nkg);
    }
}
