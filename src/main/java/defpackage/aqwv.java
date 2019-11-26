package defpackage;

/* renamed from: aqwv */
public final class aqwv extends anxl implements anzf {
    public static final aqwv e;
    private static volatile anzq g;
    public int a;
    public arml b;
    public arml c;
    public aphj d;
    private byte f = (byte) 2;

    private aqwv() {
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
                return anxl.newMessageInfo(e, "\u0001\u0003\u0000\u0001\u0001\u0007\u0003\u0000\u0000\u0003\u0001Љ\u0001\u0002Љ\u0002\u0007Љ\u0000", new Object[]{"a", "c", "d", "b"});
            case 3:
                return new aqwv();
            case 4:
                return new aqwu();
            case 5:
                return e;
            case 6:
                Object obj3 = g;
                if (obj3 == null) {
                    synchronized (aqwv.class) {
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
        aqwv aqwv = new aqwv();
        e = aqwv;
        anxl.registerDefaultInstance(aqwv.class, aqwv);
    }
}
