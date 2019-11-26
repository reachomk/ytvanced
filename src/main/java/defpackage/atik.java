package defpackage;

/* renamed from: atik */
public final class atik extends anxl implements anzf {
    public static final atik e;
    private static volatile anzq g;
    public int a;
    public asic b;
    public anyd c = anxl.emptyProtobufList();
    public axak d;
    private byte f = (byte) 2;

    private atik() {
        anxl.emptyProtobufList();
        anxl.emptyProtobufList();
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
                return anxl.newMessageInfo(e, "\u0001\u0003\u0000\u0001\u0001\u0006\u0003\u0000\u0001\u0003\u0001Љ\u0000\u0003Л\u0006Љ\u0001", new Object[]{"a", "b", "c", atig.class, "d"});
            case 3:
                return new atik();
            case 4:
                return new atij();
            case 5:
                return e;
            case 6:
                Object obj3 = g;
                if (obj3 == null) {
                    synchronized (atik.class) {
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
        atik atik = new atik();
        e = atik;
        anxl.registerDefaultInstance(atik.class, atik);
    }
}
