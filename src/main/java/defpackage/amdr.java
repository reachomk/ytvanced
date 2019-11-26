package defpackage;

/* renamed from: amdr */
public final class amdr extends anxl implements anzf {
    public static final amdr r;
    private static volatile anzq s;
    public int a;
    public double b;
    public int c;
    public int d;
    public boolean e;
    public int f = 1;
    public int g = 1;
    public int h = 1;
    public double i;
    public int j;
    public int k;
    public int l;
    public int m;
    public int n;
    public boolean o;
    public int p;
    public long q;

    private amdr() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(r, "\u0001\u0010\u0000\u0001\u0001j\u0010\u0000\u0000\u0000\u0001\u0000\u0000\u0002\u0004\u0001\u0003\u0004\u0002\u0004\u0007\u0003\u0005\f\u0004\u0006\f\u0005\u0007\f\u0006\b\u0000\u0007\t\f\b\n\u0004\te\u0004\nf\u0004\u000bg\u0004\fh\u0007\ri\f\u000ej\u0003\u000f", new Object[]{"a", "b", "c", "d", "e", "f", atkw.a(), "g", atku.a(), "h", atku.a(), "i", "j", atky.a(), "k", "l", "m", "n", "o", "p", amdw.a, "q"});
            case 3:
                return new amdr();
            case 4:
                return new amdu();
            case 5:
                return r;
            case 6:
                Object obj3 = s;
                if (obj3 == null) {
                    synchronized (amdr.class) {
                        obj3 = s;
                        if (obj3 == null) {
                            obj3 = new anxn(r);
                            s = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        amdr amdr = new amdr();
        r = amdr;
        anxl.registerDefaultInstance(amdr.class, amdr);
    }
}
