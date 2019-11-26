package defpackage;

/* renamed from: aycj */
public final class aycj extends anxl implements anzf {
    public static final aycj j;
    private static volatile anzq k;
    public int a;
    public int b;
    public int c;
    public int d;
    public long e;
    public int f;
    public String g;
    public String h;
    public int i;

    private aycj() {
        String str = "";
        this.g = str;
        this.h = str;
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(j, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001\u0004\u0000\u0002\u0004\u0001\u0003\u0004\u0002\u0004\u0002\u0003\u0005\u0004\u0004\u0006\b\u0005\u0007\b\u0006\b\u0004\u0007", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i"});
            case 3:
                return new aycj();
            case 4:
                return new ayci();
            case 5:
                return j;
            case 6:
                Object obj3 = k;
                if (obj3 == null) {
                    synchronized (aycj.class) {
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
        aycj aycj = new aycj();
        j = aycj;
        anxl.registerDefaultInstance(aycj.class, aycj);
    }
}
