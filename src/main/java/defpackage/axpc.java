package defpackage;

/* renamed from: axpc */
public final class axpc extends anxl implements anzf {
    public static final axpc f;
    private static volatile anzq h;
    public int a;
    public boolean b;
    public arml c;
    public arml d;
    public aphj e;
    private byte g = (byte) 2;

    private axpc() {
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
                return anxl.newMessageInfo(f, "\u0001\u0004\u0000\u0001\f\u0016\u0004\u0000\u0000\u0003\f\u0007\u0000\u0013Љ\u0001\u0014Љ\u0002\u0016Љ\u0003", new Object[]{"a", "b", "c", "d", "e"});
            case 3:
                return new axpc();
            case 4:
                return new axpb();
            case 5:
                return f;
            case 6:
                Object obj3 = h;
                if (obj3 == null) {
                    synchronized (axpc.class) {
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
        axpc axpc = new axpc();
        f = axpc;
        anxl.registerDefaultInstance(axpc.class, axpc);
    }
}
