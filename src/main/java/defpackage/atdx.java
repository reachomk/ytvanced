package defpackage;

/* renamed from: atdx */
public final class atdx extends anxl implements anzf {
    public static final atdx p;
    private static volatile anzq q;
    public int a;
    public aulg b;
    public aulg c;
    public aulg d;
    public anxz e = anxl.emptyIntList();
    public int f;
    public aulg g;
    public aulg h;
    public aulg i;
    public aulg j;
    public aulg k;
    public aulg l;
    public aulg m;
    public aule n;
    public anyd o;

    private atdx() {
        anxl.emptyProtobufList();
        this.o = anxl.emptyProtobufList();
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(p, "\u0001\u000e\u0000\u0001\u0001\u0014\u000e\u0000\u0002\u0000\u0001\t\u0000\u0002\t\u0001\u0003\t\u0002\u0004\t\u0004\u0005\t\u0005\u0006\t\u0006\r\t\u000e\u000e\t\t\u000f\t\u000f\u0010\u0016\u0011\u0004\u0003\u0012\t\u0007\u0013\t\b\u0014\u001b", new Object[]{"a", "b", "c", "d", "g", "h", "i", "m", "l", "n", "e", "f", "j", "k", "o", awek.class});
            case 3:
                return new atdx();
            case 4:
                return new atea();
            case 5:
                return p;
            case 6:
                Object obj3 = q;
                if (obj3 == null) {
                    synchronized (atdx.class) {
                        obj3 = q;
                        if (obj3 == null) {
                            obj3 = new anxn(p);
                            q = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        atdx atdx = new atdx();
        p = atdx;
        anxl.registerDefaultInstance(atdx.class, atdx);
    }
}
