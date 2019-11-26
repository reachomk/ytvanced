package defpackage;

/* renamed from: bcde */
public final class bcde extends anxl implements anzf {
    public static final bcde k;
    private static volatile anzq l;
    public int a;
    public String b;
    public long c;
    public String d;
    public long e;
    public long f;
    public long g;
    public long h;
    public long i;
    public int j;

    private bcde() {
        String str = "";
        this.b = str;
        this.d = str;
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(k, "\u0001\u0003\u0000\u0001\u0001\t\u0003\u0000\u0000\u0000\u0001\b\u0000\b\u0005\u0001\t\b\u0002", new Object[]{"a", "b", "c", "d"});
            case 3:
                return new bcde();
            case 4:
                return new bcdd();
            case 5:
                return k;
            case 6:
                Object obj3 = l;
                if (obj3 == null) {
                    synchronized (bcde.class) {
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
        bcde bcde = new bcde();
        k = bcde;
        anxl.registerDefaultInstance(bcde.class, bcde);
    }
}
