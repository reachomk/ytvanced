package defpackage;

/* renamed from: azhe */
public final class azhe extends anxl implements anzf {
    public static final azhe c;
    private static volatile anzq e;
    public int a = 0;
    public Object b;
    private byte d = (byte) 2;

    private azhe() {
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
                return anxl.newMessageInfo(c, "\u0001\u0002\u0001\u0000㪐ￛ㸼\u0002\u0000\u0000\u0002㪐м\u0000ￛ㸼м\u0000", new Object[]{"b", "a", azhw.class, axtr.class});
            case 3:
                return new azhe();
            case 4:
                return new azhh();
            case 5:
                return c;
            case 6:
                Object obj3 = e;
                if (obj3 == null) {
                    synchronized (azhe.class) {
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
        azhe azhe = new azhe();
        c = azhe;
        anxl.registerDefaultInstance(azhe.class, azhe);
    }
}
