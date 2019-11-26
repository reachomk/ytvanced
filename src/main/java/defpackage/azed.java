package defpackage;

/* renamed from: azed */
public final class azed extends anxl implements anzf {
    public static final azed d;
    private static volatile anzq f;
    public int a;
    public aphg b;
    public axwa c;
    private byte e = (byte) 2;

    private azed() {
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
                return anxl.newMessageInfo(d, "\u0001\u0002\u0000\u0001ᩭἑ\u0002\u0000\u0000\u0002ᩭЉ\u0001ἑЉ\u0000", new Object[]{"a", "c", "b"});
            case 3:
                return new azed();
            case 4:
                return new azeg();
            case 5:
                return d;
            case 6:
                Object obj3 = f;
                if (obj3 == null) {
                    synchronized (azed.class) {
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
        azed azed = new azed();
        d = azed;
        anxl.registerDefaultInstance(azed.class, azed);
    }
}
