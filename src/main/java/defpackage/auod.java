package defpackage;

/* renamed from: auod */
public final class auod extends anxl implements anzf {
    public static final auod e;
    private static volatile anzq g;
    public int a;
    public arml b;
    public arml c;
    public arml d;
    private byte f = (byte) 2;

    private auod() {
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
                return anxl.newMessageInfo(e, "\u0001\u0003\u0000\u0001\u0001\b\u0003\u0000\u0000\u0003\u0001Љ\u0000\u0006Љ\u0004\bЉ\u0006", new Object[]{"a", "b", "c", "d"});
            case 3:
                return new auod();
            case 4:
                return new auog();
            case 5:
                return e;
            case 6:
                Object obj3 = g;
                if (obj3 == null) {
                    synchronized (auod.class) {
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
        auod auod = new auod();
        e = auod;
        anxl.registerDefaultInstance(auod.class, auod);
    }
}
