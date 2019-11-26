package defpackage;

/* renamed from: azxi */
public final class azxi extends anxl implements anzf {
    public static final azxi f;
    private static volatile anzq h;
    public int a;
    public anyd b = anxl.emptyProtobufList();
    public azxo c;
    public long d;
    public azxh e;
    private byte g = (byte) 2;

    private azxi() {
        anxl.emptyProtobufList();
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
                return anxl.newMessageInfo(f, "\u0001\u0004\u0000\u0001\u0001\n\u0004\u0000\u0001\u0002\u0001\u001b\u0002Љ\u0000\bЉ\u0007\n\u0003\u0002", new Object[]{"a", "b", azxk.class, "c", "e", "d"});
            case 3:
                return new azxi();
            case 4:
                return new azxl();
            case 5:
                return f;
            case 6:
                Object obj3 = h;
                if (obj3 == null) {
                    synchronized (azxi.class) {
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
        azxi azxi = new azxi();
        f = azxi;
        anxl.registerDefaultInstance(azxi.class, azxi);
    }
}
