package defpackage;

/* renamed from: bcbn */
public final class bcbn extends anxp implements anzf {
    public static final bcbn g;
    private static volatile anzq j;
    public int a;
    public bcbl b;
    public bcdh c;
    public int d;
    public bcbj e;
    public String f = "";
    private byte i = (byte) 2;

    private bcbn() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.i);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.i = b;
                return null;
            case 2:
                return anxl.newMessageInfo(g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001\t\u0000\u0002\t\u0001\u0003\f\u0002\u0004\t\u0003\u0005\b\u0004", new Object[]{"a", "b", "c", "d", bcbp.a, "e", "f"});
            case 3:
                return new bcbn();
            case 4:
                return new bcbq();
            case 5:
                return g;
            case 6:
                Object obj3 = j;
                if (obj3 == null) {
                    synchronized (bcbn.class) {
                        obj3 = j;
                        if (obj3 == null) {
                            obj3 = new anxn(g);
                            j = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        bcbn bcbn = new bcbn();
        g = bcbn;
        anxl.registerDefaultInstance(bcbn.class, bcbn);
    }
}
