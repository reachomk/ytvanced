package defpackage;

/* renamed from: njg */
public final class njg extends anxl implements anzf {
    public static final njg l;
    private static volatile anzq m;
    public int a;
    public int b;
    public String c;
    public int d;
    public long e;
    public String f;
    public long g;
    public int h;
    public boolean i;
    public long j;
    public long k;

    private njg() {
        String str = "";
        this.c = str;
        this.f = str;
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(l, "\u0001\n\u0000\u0001\u0001\n\n\u0000\u0000\u0000\u0001\u000b\u0000\u0002\b\u0001\u0003\u0004\u0002\u0004\u0003\u0003\u0005\b\u0004\u0006\u0002\u0005\u0007\f\u0006\b\u0007\u0007\t\u0002\b\n\u0002\t", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", njh.a, "i", "j", "k"});
            case 3:
                return new njg();
            case 4:
                return new njf();
            case 5:
                return l;
            case 6:
                Object obj3 = m;
                if (obj3 == null) {
                    synchronized (njg.class) {
                        obj3 = m;
                        if (obj3 == null) {
                            obj3 = new anxn(l);
                            m = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        njg njg = new njg();
        l = njg;
        anxl.registerDefaultInstance(njg.class, njg);
    }
}
