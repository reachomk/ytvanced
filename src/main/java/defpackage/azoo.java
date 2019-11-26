package defpackage;

/* renamed from: azoo */
public final class azoo extends anxl implements anzf {
    public static final azoo e;
    private static volatile anzq g;
    public int a;
    public azoe b;
    public azog c;
    public azoc d;
    private byte f = (byte) 2;

    private azoo() {
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
                return anxl.newMessageInfo(e, "\u0001\u0003\u0000\u0001⃢♄\u0003\u0000\u0000\u0003⃢Љ\u0001⃱Љ\u0000♄Љ\u0002", new Object[]{"a", "c", "b", "d"});
            case 3:
                return new azoo();
            case 4:
                return new azor();
            case 5:
                return e;
            case 6:
                Object obj3 = g;
                if (obj3 == null) {
                    synchronized (azoo.class) {
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
        azoo azoo = new azoo();
        e = azoo;
        anxl.registerDefaultInstance(azoo.class, azoo);
    }
}
