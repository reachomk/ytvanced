package defpackage;

/* renamed from: axgu */
public final class axgu extends anxl implements anzf {
    public static final axgu g;
    private static volatile anzq i;
    public int a;
    public String b;
    public String c;
    public String d;
    public boolean e;
    public apxu f;
    private byte h = (byte) 2;

    private axgu() {
        String str = "";
        this.b = str;
        this.c = str;
        this.d = str;
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
                return anxl.newMessageInfo(g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0001\u0001\b\u0000\u0002\b\u0002\u0003\u0007\u0003\u0004Љ\u0004\u0005\b\u0001", new Object[]{"a", "b", "d", "e", "f", "c"});
            case 3:
                return new axgu();
            case 4:
                return new axgx();
            case 5:
                return g;
            case 6:
                Object obj3 = i;
                if (obj3 == null) {
                    synchronized (axgu.class) {
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
        axgu axgu = new axgu();
        g = axgu;
        anxl.registerDefaultInstance(axgu.class, axgu);
    }
}
