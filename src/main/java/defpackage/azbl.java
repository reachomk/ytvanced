package defpackage;

/* renamed from: azbl */
public final class azbl extends anxl implements anzf {
    public static final azbl g;
    private static volatile anzq i;
    public int a;
    public arml b;
    public azbn c;
    public apxu d;
    public arml e;
    public apxu f;
    private byte h = (byte) 2;

    private azbl() {
        anxl.emptyProtobufList();
        anxl.emptyProtobufList();
        anxl.emptyProtobufList();
        anxl.emptyProtobufList();
        anxl.emptyProtobufList();
        anxl.emptyProtobufList();
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
                return anxl.newMessageInfo(g, "\u0001\u0005\u0000\u0001\u0004\r\u0005\u0000\u0000\u0005\u0004Љ\u0003\u0006Љ\u0005\u000bЉ\u0007\fЉ\b\rЉ\t", new Object[]{"a", "b", "c", "d", "e", "f"});
            case 3:
                return new azbl();
            case 4:
                return new azbk();
            case 5:
                return g;
            case 6:
                Object obj3 = i;
                if (obj3 == null) {
                    synchronized (azbl.class) {
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
        azbl azbl = new azbl();
        g = azbl;
        anxl.registerDefaultInstance(azbl.class, azbl);
    }
}
