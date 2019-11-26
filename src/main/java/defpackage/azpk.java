package defpackage;

/* renamed from: azpk */
public final class azpk extends anxp implements anzf {
    public static final azpk d;
    private static volatile anzq f;
    public int a;
    public anvu b = anvu.a;
    public arml c;
    private byte e = (byte) 2;

    private azpk() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.e);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.e = b;
                return null;
            case 2:
                return anxl.newMessageInfo(d, "\u0001\u0002\u0000\u0001\u0001\u0004\u0002\u0000\u0000\u0001\u0001\n\u0000\u0004Љ\u0004", new Object[]{"a", "b", "c"});
            case 3:
                return new azpk();
            case 4:
                return new azpn();
            case 5:
                return d;
            case 6:
                Object obj3 = f;
                if (obj3 == null) {
                    synchronized (azpk.class) {
                        obj3 = f;
                        if (obj3 == null) {
                            obj3 = new anxn(d);
                            f = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        azpk azpk = new azpk();
        d = azpk;
        anxl.registerDefaultInstance(azpk.class, azpk);
    }
}
