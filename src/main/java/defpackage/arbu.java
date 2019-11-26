package defpackage;

/* renamed from: arbu */
public final class arbu extends anxl implements anzf {
    public static final arbu g;
    private static volatile anzq i;
    public int a;
    public boolean b;
    public apxu c;
    public int d;
    public boolean e;
    public boolean f;
    private byte h = (byte) 2;

    private arbu() {
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
                return anxl.newMessageInfo(g, "\u0001\u0005\u0000\u0001\u0004\u000b\u0005\u0000\u0000\u0001\u0004Љ\u0006\u0005\f\u0007\t\u0007\u0002\n\u0007\t\u000b\u0007\n", new Object[]{"a", "c", "d", aqhd.a, "b", "e", "f"});
            case 3:
                return new arbu();
            case 4:
                return new arbt();
            case 5:
                return g;
            case 6:
                Object obj3 = i;
                if (obj3 == null) {
                    synchronized (arbu.class) {
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
        arbu arbu = new arbu();
        g = arbu;
        anxl.registerDefaultInstance(arbu.class, arbu);
    }
}
