package defpackage;

/* renamed from: aoxf */
public final class aoxf extends anxl implements anzf {
    public static final aoxf g;
    private static volatile anzq i;
    public int a;
    public axak b;
    public String c;
    public String d;
    public axak e;
    public apxu f;
    private byte h = (byte) 2;

    private aoxf() {
        String str = "";
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
                return anxl.newMessageInfo(g, "\u0001\u0005\u0000\u0001\u0003\b\u0005\u0000\u0000\u0003\u0003Љ\u0002\u0004\b\u0003\u0005\b\u0004\u0007Љ\u0006\bЉ\u0007", new Object[]{"a", "b", "c", "d", "e", "f"});
            case 3:
                return new aoxf();
            case 4:
                return new aoxi();
            case 5:
                return g;
            case 6:
                Object obj3 = i;
                if (obj3 == null) {
                    synchronized (aoxf.class) {
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
        aoxf aoxf = new aoxf();
        g = aoxf;
        anxl.registerDefaultInstance(aoxf.class, aoxf);
    }
}
