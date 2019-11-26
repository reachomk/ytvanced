package defpackage;

/* renamed from: apuj */
public final class apuj extends anxl implements anzf {
    public static final apuj j;
    private static volatile anzq k;
    public int a;
    public long b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public long h;
    public int i;

    private apuj() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(j, "\u0001\b\u0000\u0001\r\u0015\b\u0000\u0000\u0000\r\u0002\u0000\u000e\u000f\u0001\u0010\u0004\u0002\u0011\f\u0003\u0012\u0004\u0004\u0013\u0004\u0005\u0014\u0002\u0006\u0015\u0004\u0007", new Object[]{"a", "b", "c", "d", "e", aqvf.a, "f", "g", "h", "i"});
            case 3:
                return new apuj();
            case 4:
                return new apui();
            case 5:
                return j;
            case 6:
                Object obj3 = k;
                if (obj3 == null) {
                    synchronized (apuj.class) {
                        obj3 = k;
                        if (obj3 == null) {
                            obj3 = new anxn(j);
                            k = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        apuj apuj = new apuj();
        j = apuj;
        anxl.registerDefaultInstance(apuj.class, apuj);
    }
}
