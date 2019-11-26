package defpackage;

/* renamed from: avnk */
public final class avnk extends anxl implements anzf {
    public static final avnk p;
    private static volatile anzq q;
    public int a;
    public String b = "";
    public int c;
    public int d;
    public long e;
    public int f;
    public int g;
    public long h;
    public long i;
    public long j;
    public boolean k;
    public long l;
    public boolean m;
    public boolean n;
    public axuy o;

    private avnk() {
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
                return anxl.newMessageInfo(p, "\u0001\u000e\u0000\u0001\u0001\u0014\u000e\u0000\u0000\u0000\u0001\b\u0000\u0002\f\u0001\u0003\u000b\u0002\u0004\u0002\u0003\u0005\f\u0004\u0006\f\u0005\u0007\u0002\u0006\b\u0002\u0007\t\u0002\b\u000b\u0007\n\u0010\u0002\u000e\u0012\u0007\u000f\u0013\u0007\u0010\u0014\t\u0011", new Object[]{"a", "b", "c", avnh.a, "d", "e", "f", avsi.a(), "g", avof.a, "h", "i", "j", "k", "l", "m", "n", "o"});
            case 3:
                return new avnk();
            case 4:
                return new avnn();
            case 5:
                return p;
            case 6:
                Object obj3 = q;
                if (obj3 == null) {
                    synchronized (avnk.class) {
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
        avnk avnk = new avnk();
        p = avnk;
        anxl.registerDefaultInstance(avnk.class, avnk);
    }
}
