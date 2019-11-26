package defpackage;

/* renamed from: azql */
public final class azql extends anxl implements anzf {
    public static final azql f;
    private static volatile anzq h;
    public int a;
    public azlk b;
    public anyd c = anxl.emptyProtobufList();
    public arlv d;
    public azkw e;
    private byte g = (byte) 2;

    private azql() {
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
                return anxl.newMessageInfo(f, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0001\u0001\u0001\t\u0000\u0003\u001b\u0004Љ\u0002\u0005\t\u0003", new Object[]{"a", "b", "c", azpz.class, "d", "e"});
            case 3:
                return new azql();
            case 4:
                return new azqk();
            case 5:
                return f;
            case 6:
                Object obj3 = h;
                if (obj3 == null) {
                    synchronized (azql.class) {
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
        azql azql = new azql();
        f = azql;
        anxl.registerDefaultInstance(azql.class, azql);
    }
}
