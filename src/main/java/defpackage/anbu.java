package defpackage;

/* renamed from: anbu */
public final class anbu extends anxp implements anzf {
    public static final anbu e;
    private static volatile anzq g;
    public int a;
    public int b = -1;
    public int c = -1;
    public int d;
    private byte f = (byte) 2;

    private anbu() {
        anxl.emptyProtobufList();
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.f);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.f = b;
                return null;
            case 2:
                return anxl.newMessageInfo(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0004\u0001\u0002\u0004\u0002\u0003\u0004\u0003", new Object[]{"a", "b", "c", "d"});
            case 3:
                return new anbu();
            case 4:
                return new anbt();
            case 5:
                return e;
            case 6:
                Object obj3 = g;
                if (obj3 == null) {
                    synchronized (anbu.class) {
                        obj3 = g;
                        if (obj3 == null) {
                            obj3 = new anxn(e);
                            g = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        anbu anbu = new anbu();
        e = anbu;
        anxl.registerDefaultInstance(anbu.class, anbu);
    }
}
