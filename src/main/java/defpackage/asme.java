package defpackage;

/* renamed from: asme */
public final class asme extends anxl implements anzf {
    public static final asme f;
    private static volatile anzq h;
    public int a;
    public ashy b;
    public String c;
    public String d;
    public String e;
    private byte g = (byte) 2;

    private asme() {
        String str = "";
        this.c = str;
        this.d = str;
        this.e = str;
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
                return anxl.newMessageInfo(f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0001\u0001Љ\u0000\u0002\b\u0001\u0003\b\u0003\u0004\b\u0002", new Object[]{"a", "b", "c", "e", "d"});
            case 3:
                return new asme();
            case 4:
                return new asmh();
            case 5:
                return f;
            case 6:
                Object obj3 = h;
                if (obj3 == null) {
                    synchronized (asme.class) {
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
        asme asme = new asme();
        f = asme;
        anxl.registerDefaultInstance(asme.class, asme);
    }
}
