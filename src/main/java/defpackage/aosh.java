package defpackage;

/* renamed from: aosh */
public final class aosh extends anxl implements anzf {
    public static final aosh n;
    private static volatile anzq o;
    public int a;
    public boolean b;
    public boolean c;
    public boolean d;
    public float e;
    public boolean f;
    public anyd g = anxl.emptyProtobufList();
    public boolean h;
    public boolean i;
    public boolean j;
    public boolean k;
    public boolean l;
    public boolean m;

    private aosh() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(n, "\u0001\f\u0000\u0001\u0003\u001b\f\u0000\u0001\u0000\u0003\u0007\u0002\u0004\u0007\u0003\u000b\u0007\t\f\u0001\n\r\u0007\u000b\u000e\u001a\u0010\u0007\r\u0013\u0007\u0010\u0017\u0007\u0012\u0019\u0007\u0013\u001a\u0007\u0014\u001b\u0007\u0015", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m"});
            case 3:
                return new aosh();
            case 4:
                return new aosk();
            case 5:
                return n;
            case 6:
                Object obj3 = o;
                if (obj3 == null) {
                    synchronized (aosh.class) {
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
        aosh aosh = new aosh();
        n = aosh;
        anxl.registerDefaultInstance(aosh.class, aosh);
    }
}
