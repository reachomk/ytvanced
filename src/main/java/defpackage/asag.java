package defpackage;

/* renamed from: asag */
public final class asag extends anxl implements anzf {
    public static final asag d;
    private static volatile anzq f;
    public int a;
    public ashy b;
    public anyd c = anxl.emptyProtobufList();
    private byte e = (byte) 2;

    private asag() {
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
                return anxl.newMessageInfo(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0001\u0001Љ\u0000\u0002\u001b", new Object[]{"a", "b", "c", aoxm.class});
            case 3:
                return new asag();
            case 4:
                return new asaj();
            case 5:
                return d;
            case 6:
                Object obj3 = f;
                if (obj3 == null) {
                    synchronized (asag.class) {
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
        asag asag = new asag();
        d = asag;
        anxl.registerDefaultInstance(asag.class, asag);
    }
}
