package defpackage;

/* renamed from: aoqb */
public final class aoqb extends anxl implements anzf {
    public static final aoqb m;
    private static volatile anzq n;
    public int a;
    public aopx b;
    public long c;
    public boolean d;
    public long e;
    public boolean f;
    public boolean g;
    public long h;
    public String i;
    public String j;
    public boolean k;
    public aoqd l;

    private aoqb() {
        String str = "";
        this.i = str;
        this.j = str;
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
                return anxl.newMessageInfo(m, "\u0001\u000b\u0000\u0001\u0001\u000f\u000b\u0000\u0000\u0000\u0001\t\u0000\u0002\u0002\u0001\u0003\u0007\u0002\u0004\u0002\u0003\u0005\u0007\u0004\u0006\u0007\u0005\u0007\u0002\u0006\b\b\u0007\t\b\b\u000e\u0007\f\u000f\t\r", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l"});
            case 3:
                return new aoqb();
            case 4:
                return new aoqa();
            case 5:
                return m;
            case 6:
                Object obj3 = n;
                if (obj3 == null) {
                    synchronized (aoqb.class) {
                        obj3 = n;
                        if (obj3 == null) {
                            obj3 = new anxn(m);
                            n = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        aoqb aoqb = new aoqb();
        m = aoqb;
        anxl.registerDefaultInstance(aoqb.class, aoqb);
    }
}
