package defpackage;

/* renamed from: azqb */
public final class azqb extends anxl implements anzf {
    public static final azqb b;
    private static volatile anzq c;
    public anyd a = anxl.emptyProtobufList();

    private azqb() {
    }

    public final void a() {
        if (!this.a.a()) {
            this.a = anxl.mutableCopy(this.a);
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(b, "\u0001\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0001\u0000\u0002\u001b", new Object[]{"a", azqd.class});
            case 3:
                return new azqb();
            case 4:
                return new azqa();
            case 5:
                return b;
            case 6:
                Object obj3 = c;
                if (obj3 == null) {
                    synchronized (azqb.class) {
                        obj3 = c;
                        if (obj3 == null) {
                            obj3 = new anxn(b);
                            c = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        azqb azqb = new azqb();
        b = azqb;
        anxl.registerDefaultInstance(azqb.class, azqb);
    }
}
