package defpackage;

/* renamed from: atmm */
public final class atmm extends anxl implements anzf {
    public static final atmm e;
    private static volatile anzq g;
    public int a;
    public asic b;
    public apxu c;
    public anyd d = anxl.emptyProtobufList();
    private byte f = (byte) 2;

    private atmm() {
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
                return anxl.newMessageInfo(e, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0001\u0002\u0001Љ\u0000\u0003Љ\u0001\u0004\u001b", new Object[]{"a", "b", "c", "d", atmi.class});
            case 3:
                return new atmm();
            case 4:
                return new atml();
            case 5:
                return e;
            case 6:
                Object obj3 = g;
                if (obj3 == null) {
                    synchronized (atmm.class) {
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
        atmm atmm = new atmm();
        e = atmm;
        anxl.registerDefaultInstance(atmm.class, atmm);
    }
}
