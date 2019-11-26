package defpackage;

/* renamed from: axam */
public final class axam extends anxl implements anzf {
    public static final axam d;
    private static volatile anzq e;
    public int a;
    public float b;
    public String c = "";

    private axam() {
        anxl.emptyProtobufList();
        anxl.emptyProtobufList();
        anxl.emptyProtobufList();
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(d, "\u0001\u0002\u0000\u0001\u0012\u0016\u0002\u0000\u0000\u0000\u0012\u0001\f\u0016\b\u0011", new Object[]{"a", "b", "c"});
            case 3:
                return new axam();
            case 4:
                return new axal();
            case 5:
                return d;
            case 6:
                Object obj3 = e;
                if (obj3 == null) {
                    synchronized (axam.class) {
                        obj3 = e;
                        if (obj3 == null) {
                            obj3 = new anxn(d);
                            e = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        axam axam = new axam();
        d = axam;
        anxl.registerDefaultInstance(axam.class, axam);
    }
}
