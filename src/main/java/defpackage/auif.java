package defpackage;

/* renamed from: auif */
public final class auif extends anxl implements anzf {
    public static final auif d;
    private static volatile anzq f;
    public int a;
    public aujf b;
    public auiz c;
    private byte e = (byte) 2;

    private auif() {
        anxl.emptyProtobufList();
        anxl.emptyProtobufList();
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
                return anxl.newMessageInfo(d, "\u0001\u0002\u0000\u0001\u0002\u0004\u0002\u0000\u0000\u0002\u0002Љ\u0000\u0004Љ\u0001", new Object[]{"a", "b", "c"});
            case 3:
                return new auif();
            case 4:
                return new auii();
            case 5:
                return d;
            case 6:
                Object obj3 = f;
                if (obj3 == null) {
                    synchronized (auif.class) {
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
        auif auif = new auif();
        d = auif;
        anxl.registerDefaultInstance(auif.class, auif);
    }
}
