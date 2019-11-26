package defpackage;

/* renamed from: axbf */
public final class axbf extends anxl implements anzf {
    public static final axbf n;
    private static volatile anzq o;
    public int a;
    public anyd b = anxl.emptyProtobufList();
    public int c;
    public int d;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    public int j;
    public boolean k;
    public int l;
    public boolean m;

    private axbf() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(n, "\u0001\f\u0000\u0001\u0001\r\f\u0000\u0001\u0000\u0001\u001a\u0002\u0004\u0000\u0003\u0004\u0001\u0004\u0007\u0002\u0006\u0007\u0005\u0007\u0007\u0006\b\u0007\u0007\t\u0007\t\n\u0004\n\u000b\u0007\u000b\f\u0007\u0003\r\u0004\b", new Object[]{"a", "b", "c", "d", "e", "g", "h", "i", "k", "l", "m", "f", "j"});
            case 3:
                return new axbf();
            case 4:
                return new axbe();
            case 5:
                return n;
            case 6:
                Object obj3 = o;
                if (obj3 == null) {
                    synchronized (axbf.class) {
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
        axbf axbf = new axbf();
        n = axbf;
        anxl.registerDefaultInstance(axbf.class, axbf);
    }
}
