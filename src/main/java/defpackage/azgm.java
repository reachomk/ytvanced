package defpackage;

/* renamed from: azgm */
public final class azgm extends anxl implements anzf {
    public static final azgm g;
    private static volatile anzq i;
    public int a;
    public arml b;
    public apxu c;
    public azhs d;
    public azik e;
    public arml f;
    private byte h = (byte) 2;

    private azgm() {
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
                return anxl.newMessageInfo(g, "\u0001\u0005\u0000\u0001\u0001\t\u0005\u0000\u0000\u0005\u0001Љ\u0000\u0002Љ\u0001\u0005Љ\u0002\u0006Љ\u0003\tЉ\u0005", new Object[]{"a", "b", "c", "d", "e", "f"});
            case 3:
                return new azgm();
            case 4:
                return new azgp();
            case 5:
                return g;
            case 6:
                Object obj3 = i;
                if (obj3 == null) {
                    synchronized (azgm.class) {
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
        azgm azgm = new azgm();
        g = azgm;
        anxl.registerDefaultInstance(azgm.class, azgm);
    }
}
