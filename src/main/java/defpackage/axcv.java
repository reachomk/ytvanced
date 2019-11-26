package defpackage;

/* renamed from: axcv */
public final class axcv extends anxp implements anzf {
    public static final axcv g;
    private static volatile anzq j;
    public int a;
    public String b;
    public String c;
    public axda d;
    public String e;
    public axcw f;
    private byte i = (byte) 2;

    private axcv() {
        String str = "";
        this.b = str;
        this.c = str;
        this.e = str;
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
                return anxl.newMessageInfo(g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001\b\u0000\u0002\b\u0001\u0003\t\u0002\u0004\b\u0003\u0005\t\u0004", new Object[]{"a", "b", "c", "d", "e", "f"});
            case 3:
                return new axcv();
            case 4:
                return new axcx();
            case 5:
                return g;
            case 6:
                Object obj3 = j;
                if (obj3 == null) {
                    synchronized (axcv.class) {
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
        axcv axcv = new axcv();
        g = axcv;
        anxl.registerDefaultInstance(axcv.class, axcv);
    }
}
