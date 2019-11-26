package defpackage;

/* renamed from: aspr */
public final class aspr extends anxl implements anzf {
    public static final aspr j;
    private static volatile anzq l;
    public int a;
    public String b = "";
    public boolean c;
    public int d;
    public long e;
    public anyd f = anxl.emptyProtobufList();
    public asql g;
    public asqn h;
    public aspx i;
    private byte k = (byte) 2;

    private aspr() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.k);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.k = b;
                return null;
            case 2:
                return anxl.newMessageInfo(j, "\u0001\b\u0000\u0001\u0001\n\b\u0000\u0001\u0004\u0001\b\u0000\u0002\u0007\u0001\u0003\f\u0002\u0004\u0002\u0003\u0007Л\bЉ\u0007\tЉ\b\nЉ\t", new Object[]{"a", "b", "c", "d", aspw.a, "e", "f", asqh.class, "g", "h", "i"});
            case 3:
                return new aspr();
            case 4:
                return new aspu();
            case 5:
                return j;
            case 6:
                Object obj3 = l;
                if (obj3 == null) {
                    synchronized (aspr.class) {
                        obj3 = l;
                        if (obj3 == null) {
                            obj3 = new anxn(j);
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
        aspr aspr = new aspr();
        j = aspr;
        anxl.registerDefaultInstance(aspr.class, aspr);
    }
}
