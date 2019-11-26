package defpackage;

/* renamed from: azhi */
public final class azhi extends anxl implements anzf {
    public static final azhi f;
    private static volatile anzq h;
    public int a;
    public arml b;
    public anyd c = anxl.emptyProtobufList();
    public apxu d;
    public arml e;
    private byte g = (byte) 2;

    private azhi() {
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
                return anxl.newMessageInfo(f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0004\u0001Љ\u0000\u0002Л\u0003Љ\u0001\u0004Љ\u0002", new Object[]{"a", "b", "c", azhe.class, "d", "e"});
            case 3:
                return new azhi();
            case 4:
                return new azhl();
            case 5:
                return f;
            case 6:
                Object obj3 = h;
                if (obj3 == null) {
                    synchronized (azhi.class) {
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
        azhi azhi = new azhi();
        f = azhi;
        anxl.registerDefaultInstance(azhi.class, azhi);
    }
}
