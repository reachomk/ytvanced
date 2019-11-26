package defpackage;

/* renamed from: udm */
public final class udm extends anxl implements anzf {
    public static final udm k;
    private static volatile anzq l;
    public int a;
    public bcat b;
    public long c;
    public long d;
    public long e;
    public long f;
    public int g;
    public String h = "";
    public boolean i;
    public bcbb j;

    private udm() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(k, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0000\u0000\u0001\t\u0000\u0002\u0002\u0001\u0003\u0002\u0002\u0004\u0002\u0003\u0005\u0005\u0004\u0006\u0004\u0005\u0007\b\u0006\b\u0007\u0007\t\t\b", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j"});
            case 3:
                return new udm();
            case 4:
                return new udp();
            case 5:
                return k;
            case 6:
                Object obj3 = l;
                if (obj3 == null) {
                    synchronized (udm.class) {
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
        udm udm = new udm();
        k = udm;
        anxl.registerDefaultInstance(udm.class, udm);
    }
}
