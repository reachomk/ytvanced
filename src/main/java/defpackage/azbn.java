package defpackage;

/* renamed from: azbn */
public final class azbn extends anxl implements anzf {
    public static final azbn f;
    private static volatile anzq h;
    public int a;
    public arml b;
    public arml c;
    public arml d;
    public arml e;
    private byte g = (byte) 2;

    private azbn() {
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
                return anxl.newMessageInfo(f, "\u0001\u0004\u0000\u0001\u0005\b\u0004\u0000\u0000\u0004\u0005Љ\u0004\u0006Љ\u0005\u0007Љ\u0006\bЉ\u0007", new Object[]{"a", "b", "c", "d", "e"});
            case 3:
                return new azbn();
            case 4:
                return new azbm();
            case 5:
                return f;
            case 6:
                Object obj3 = h;
                if (obj3 == null) {
                    synchronized (azbn.class) {
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
        azbn azbn = new azbn();
        f = azbn;
        anxl.registerDefaultInstance(azbn.class, azbn);
    }
}
