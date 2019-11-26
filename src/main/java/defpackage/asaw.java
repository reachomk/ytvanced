package defpackage;

/* renamed from: asaw */
public final class asaw extends anxl implements anzf {
    public static final asaw g;
    private static volatile anzq i;
    public int a;
    public anyd b = anxl.emptyProtobufList();
    public int c;
    public float d;
    public long e;
    public int f;
    private byte h = (byte) 2;

    private asaw() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.h);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.h = b;
                return null;
            case 2:
                return anxl.newMessageInfo(g, "\u0001\u0005\u0000\u0001\u0001\t\u0005\u0000\u0001\u0001\u0001Л\u0002\f\u0000\u0007\u0001\u0005\b\u0003\u0006\t\f\u0007", new Object[]{"a", "b", avrg.class, "c", asau.a(), "d", "e", "f", avrp.a()});
            case 3:
                return new asaw();
            case 4:
                return new asaz();
            case 5:
                return g;
            case 6:
                Object obj3 = i;
                if (obj3 == null) {
                    synchronized (asaw.class) {
                        obj3 = i;
                        if (obj3 == null) {
                            obj3 = new anxn(g);
                            i = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        asaw asaw = new asaw();
        g = asaw;
        anxl.registerDefaultInstance(asaw.class, asaw);
    }
}
