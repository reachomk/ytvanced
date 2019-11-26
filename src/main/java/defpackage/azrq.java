package defpackage;

/* renamed from: azrq */
public final class azrq extends anxl implements anzf {
    public static final azrq f;
    private static volatile anzq h;
    public int a;
    public arml b;
    public arml c;
    public anvu d = anvu.a;
    public azrs e;
    private byte g = (byte) 2;

    private azrq() {
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
                return anxl.newMessageInfo(f, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0003\u0001Љ\u0000\u0002Љ\u0001\u0004\n\u0003\u0005Љ\u0004", new Object[]{"a", "b", "c", "d", "e"});
            case 3:
                return new azrq();
            case 4:
                return new azrt();
            case 5:
                return f;
            case 6:
                Object obj3 = h;
                if (obj3 == null) {
                    synchronized (azrq.class) {
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
        azrq azrq = new azrq();
        f = azrq;
        anxl.registerDefaultInstance(azrq.class, azrq);
    }
}
