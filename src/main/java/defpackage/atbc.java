package defpackage;

/* renamed from: atbc */
public final class atbc extends anxl implements anzf {
    public static final atbc e;
    private static volatile anzq g;
    public int a;
    public ashy b;
    public String c = "";
    public long d;
    private byte f = (byte) 2;

    private atbc() {
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
                return anxl.newMessageInfo(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001Љ\u0000\u0002\b\u0001\u0003\u0002\u0002", new Object[]{"a", "b", "c", "d"});
            case 3:
                return new atbc();
            case 4:
                return new atbb();
            case 5:
                return e;
            case 6:
                Object obj3 = g;
                if (obj3 == null) {
                    synchronized (atbc.class) {
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
        atbc atbc = new atbc();
        e = atbc;
        anxl.registerDefaultInstance(atbc.class, atbc);
    }
}
