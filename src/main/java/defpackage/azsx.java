package defpackage;

/* renamed from: azsx */
public final class azsx extends anxl implements anzf {
    public static final azsx e;
    private static volatile anzq g;
    public int a;
    public azvv b;
    public azth c;
    public azsz d;
    private byte f = (byte) 2;

    private azsx() {
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
                return anxl.newMessageInfo(e, "\u0001\u0003\u0000\u0001\u0003\u0006\u0003\u0000\u0000\u0003\u0003Љ\u0001\u0005Љ\u0003\u0006Љ\u0004", new Object[]{"a", "b", "c", "d"});
            case 3:
                return new azsx();
            case 4:
                return new azsw();
            case 5:
                return e;
            case 6:
                Object obj3 = g;
                if (obj3 == null) {
                    synchronized (azsx.class) {
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
        azsx azsx = new azsx();
        e = azsx;
        anxl.registerDefaultInstance(azsx.class, azsx);
    }
}
