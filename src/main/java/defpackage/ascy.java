package defpackage;

/* renamed from: ascy */
public final class ascy extends anxl implements anzf {
    public static final ascy g;
    private static volatile anzq i;
    public int a;
    public asic b;
    public apxu c;
    public aofo d;
    public asda e;
    public anyd f = anxl.emptyProtobufList();
    private byte h = (byte) 2;

    private ascy() {
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
                return anxl.newMessageInfo(g, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0001\u0005\u0001Љ\u0000\u0002Љ\u0001\u0004Љ\u0002\u0005Љ\u0003\u0006Л", new Object[]{"a", "b", "c", "d", "e", "f", apxu.class});
            case 3:
                return new ascy();
            case 4:
                return new asdb();
            case 5:
                return g;
            case 6:
                Object obj3 = i;
                if (obj3 == null) {
                    synchronized (ascy.class) {
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
        ascy ascy = new ascy();
        g = ascy;
        anxl.registerDefaultInstance(ascy.class, ascy);
    }
}
