package defpackage;

/* renamed from: azjv */
public final class azjv extends anxl implements anzf {
    public static final azjv f;
    private static volatile anzq h;
    public int a;
    public String b;
    public int c;
    public String d;
    public apxu e;
    private byte g = (byte) 2;

    private azjv() {
        String str = "";
        this.b = str;
        this.d = str;
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.g);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.g = b;
                return null;
            case 2:
                return anxl.newMessageInfo(f, "\u0001\u0004\u0000\u0001\u0001\u0006\u0004\u0000\u0000\u0001\u0001\b\u0000\u0002\u000b\u0001\u0004\b\u0002\u0006Љ\u0004", new Object[]{"a", "b", "c", "d", "e"});
            case 3:
                return new azjv();
            case 4:
                return new azjx();
            case 5:
                return f;
            case 6:
                Object obj3 = h;
                if (obj3 == null) {
                    synchronized (azjv.class) {
                        obj3 = h;
                        if (obj3 == null) {
                            obj3 = new anxn(f);
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
        azjv azjv = new azjv();
        f = azjv;
        anxl.registerDefaultInstance(azjv.class, azjv);
    }
}
