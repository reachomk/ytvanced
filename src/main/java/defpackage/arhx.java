package defpackage;

/* renamed from: arhx */
public final class arhx extends anxl implements anzf {
    public static final arhx d;
    private static volatile anzq f;
    public int a;
    public anyd b = anxl.emptyProtobufList();
    public boolean c;
    private byte e = (byte) 2;

    private arhx() {
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
                return anxl.newMessageInfo(d, "\u0001\u0002\u0000\u0001\u0001#\u0002\u0000\u0001\u0001\u0001Л#\u0007\u0014", new Object[]{"a", "b", atwo.class, "c"});
            case 3:
                return new arhx();
            case 4:
                return new arhw();
            case 5:
                return d;
            case 6:
                Object obj3 = f;
                if (obj3 == null) {
                    synchronized (arhx.class) {
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
        arhx arhx = new arhx();
        d = arhx;
        anxl.registerDefaultInstance(arhx.class, arhx);
    }
}
