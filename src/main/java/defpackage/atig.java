package defpackage;

/* renamed from: atig */
public final class atig extends anxl implements anzf {
    public static final atig c;
    private static volatile anzq e;
    public int a;
    public auip b;
    private byte d = (byte) 2;

    private atig() {
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
                return anxl.newMessageInfo(c, "\u0001\u0001\u0000\u0001㬡㬡\u0001\u0000\u0000\u0001㬡Љ\u0000", new Object[]{"a", "b"});
            case 3:
                return new atig();
            case 4:
                return new atif();
            case 5:
                return c;
            case 6:
                Object obj3 = e;
                if (obj3 == null) {
                    synchronized (atig.class) {
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
        atig atig = new atig();
        c = atig;
        anxl.registerDefaultInstance(atig.class, atig);
    }
}
