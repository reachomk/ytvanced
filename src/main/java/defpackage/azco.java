package defpackage;

/* renamed from: azco */
public final class azco extends anxl implements anzf {
    public static final azco c;
    private static volatile anzq e;
    public int a;
    public azcs b;
    private byte d = (byte) 2;

    private azco() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.d);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.d = b;
                return null;
            case 2:
                return anxl.newMessageInfo(c, "\u0001\u0001\u0000\u0001ᢰᢰ\u0001\u0000\u0000\u0001ᢰЉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new azco();
            case 4:
                return new azcn();
            case 5:
                return c;
            case 6:
                Object obj3 = e;
                if (obj3 == null) {
                    synchronized (azco.class) {
                        obj3 = e;
                        if (obj3 == null) {
                            obj3 = new anxn(c);
                            e = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        azco azco = new azco();
        c = azco;
        anxl.registerDefaultInstance(azco.class, azco);
    }
}
