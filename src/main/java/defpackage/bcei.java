package defpackage;

/* renamed from: bcei */
public final class bcei extends anxl implements anzf {
    public static final bcei k;
    private static volatile anzq l;
    public int a;
    public long b;
    public long c;
    public long d;
    public long e;
    public long f;
    public long g;
    public long h;
    public long i;
    public anyd j = anxl.emptyProtobufList();

    private bcei() {
    }

    public final void a() {
        if (!this.j.a()) {
            this.j = anxl.mutableCopy(this.j);
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(k, "\u0001\t\u0000\u0001\u0001\n\t\u0000\u0001\u0000\u0001\u0002\u0000\u0002\u0002\u0001\u0003\u0002\u0002\u0004\u0002\u0003\u0005\u0002\u0004\u0006\u0002\u0005\u0007\u0002\u0006\b\u0002\u0007\n\u001b", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", bcek.class});
            case 3:
                return new bcei();
            case 4:
                return new bceh();
            case 5:
                return k;
            case 6:
                Object obj3 = l;
                if (obj3 == null) {
                    synchronized (bcei.class) {
                        obj3 = l;
                        if (obj3 == null) {
                            obj3 = new anxn(k);
                            l = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        bcei bcei = new bcei();
        k = bcei;
        anxl.registerDefaultInstance(bcei.class, bcei);
    }
}
