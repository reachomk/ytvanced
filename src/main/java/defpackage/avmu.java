package defpackage;

/* renamed from: avmu */
public final class avmu extends anxl implements anzf {
    public static final avmu n;
    private static volatile anzq o;
    public int a;
    public String b = "";
    public int c;
    public int d;
    public boolean e;
    public int f;
    public long g;
    public int h;
    public int i;
    public anyd j = anxl.emptyProtobufList();
    public int k;
    public int l;
    public int m;

    private avmu() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(n, "\u0001\f\u0000\u0001\u0001\f\f\u0000\u0001\u0000\u0001\b\u0000\u0002\f\u0002\u0003\u0007\u0003\u0004\f\u0004\u0005\u0003\u0005\u0006\u000b\u0001\u0007\f\u0006\b\u0004\u0007\t\u001b\n\f\b\u000b\f\t\f\f\n", new Object[]{"a", "b", "d", apip.a, "e", "f", apip.a, "g", "c", "h", axvm.a, "i", "j", avmw.class, "k", axvm.a, "l", axvm.a, "m", apip.a});
            case 3:
                return new avmu();
            case 4:
                return new avmx();
            case 5:
                return n;
            case 6:
                Object obj3 = o;
                if (obj3 == null) {
                    synchronized (avmu.class) {
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
        avmu avmu = new avmu();
        n = avmu;
        anxl.registerDefaultInstance(avmu.class, avmu);
    }
}
