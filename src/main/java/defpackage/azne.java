package defpackage;

/* renamed from: azne */
public final class azne extends anxl implements anzf {
    public static final azne e;
    private static volatile anzq g;
    public int a;
    public boolean b;
    public arml c;
    public anyd d = anxl.emptyProtobufList();
    private byte f = (byte) 2;

    private azne() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.f);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.f = b;
                return null;
            case 2:
                return anxl.newMessageInfo(e, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0001\u0002\u0001\u0007\u0000\u0002Љ\u0001\u0004Л", new Object[]{"a", "b", "c", "d", aznk.class});
            case 3:
                return new azne();
            case 4:
                return new aznh();
            case 5:
                return e;
            case 6:
                Object obj3 = g;
                if (obj3 == null) {
                    synchronized (azne.class) {
                        obj3 = g;
                        if (obj3 == null) {
                            obj3 = new anxn(e);
                            g = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        azne azne = new azne();
        e = azne;
        anxl.registerDefaultInstance(azne.class, azne);
    }
}
