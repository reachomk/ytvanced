package defpackage;

/* renamed from: aswz */
public final class aswz extends anxl implements anzf {
    public static final aswz g;
    private static volatile anzq h;
    public int a;
    public double b;
    public double c;
    public String d;
    public String e;
    public int f = 1;

    private aswz() {
        String str = "";
        this.d = str;
        this.e = str;
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001\u0000\u0000\u0002\u0000\u0001\u0003\b\u0002\u0004\b\u0003\u0005\f\u0004", new Object[]{"a", "b", "c", "d", "e", "f", atnw.a});
            case 3:
                return new aswz();
            case 4:
                return new asxc();
            case 5:
                return g;
            case 6:
                Object obj3 = h;
                if (obj3 == null) {
                    synchronized (aswz.class) {
                        obj3 = h;
                        if (obj3 == null) {
                            obj3 = new anxn(g);
                            h = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        aswz aswz = new aswz();
        g = aswz;
        anxl.registerDefaultInstance(aswz.class, aswz);
    }
}
