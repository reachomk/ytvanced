package defpackage;

/* renamed from: assl */
public final class assl extends anxl implements anzf {
    public static final assl f;
    private static volatile anzq h;
    public int a;
    public ashy b;
    public boolean c = false;
    public anyd d = anxl.emptyProtobufList();
    public boolean e;
    private byte g = (byte) 2;

    private assl() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.g);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.g = b;
                return null;
            case 2:
                return anxl.newMessageInfo(f, "\u0001\u0004\u0000\u0001\u0001\u0006\u0004\u0000\u0001\u0002\u0001Љ\u0000\u0003\u0007\u0001\u0004Л\u0006\u0007\u0003", new Object[]{"a", "b", "c", "d", aofq.class, "e"});
            case 3:
                return new assl();
            case 4:
                return new asso();
            case 5:
                return f;
            case 6:
                Object obj3 = h;
                if (obj3 == null) {
                    synchronized (assl.class) {
                        obj3 = h;
                        if (obj3 == null) {
                            obj3 = new anxn(f);
                            h = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        assl assl = new assl();
        f = assl;
        anxl.registerDefaultInstance(assl.class, assl);
    }
}
