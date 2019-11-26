package defpackage;

/* renamed from: awbf */
public final class awbf extends anxl implements anzf {
    public static final awbf g;
    private static volatile anzq h;
    public int a;
    public int b;
    public awbd c;
    public int d;
    public String e = "";
    public int f;

    private awbf() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001\f\u0000\u0002\t\u0001\u0003\f\u0002\u0004\b\u0003\u0005\f\u0004", new Object[]{"a", "b", awbk.a, "c", "d", aqvf.a, "e", "f", awbl.a});
            case 3:
                return new awbf();
            case 4:
                return new awbe();
            case 5:
                return g;
            case 6:
                Object obj3 = h;
                if (obj3 == null) {
                    synchronized (awbf.class) {
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
        awbf awbf = new awbf();
        g = awbf;
        anxl.registerDefaultInstance(awbf.class, awbf);
    }
}
