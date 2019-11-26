package defpackage;

/* renamed from: azag */
public final class azag extends anxl implements anzf {
    public static final azag e;
    private static volatile anzq g;
    public int a;
    public String b = "";
    public arml c;
    public anyd d = anxl.emptyProtobufList();
    private byte f = (byte) 2;

    private azag() {
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
                return anxl.newMessageInfo(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0001\u0001\b\u0000\u0002Љ\u0001\u0003\u001a", new Object[]{"a", "b", "c", "d"});
            case 3:
                return new azag();
            case 4:
                return new azaf();
            case 5:
                return e;
            case 6:
                Object obj3 = g;
                if (obj3 == null) {
                    synchronized (azag.class) {
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
        azag azag = new azag();
        e = azag;
        anxl.registerDefaultInstance(azag.class, azag);
    }
}
