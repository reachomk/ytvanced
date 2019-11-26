package defpackage;

/* renamed from: axnj */
public final class axnj extends anxl implements anzf {
    public static final axnj e;
    private static volatile anzq g;
    public int a;
    public apxu b;
    public arml c;
    public arml d;
    private byte f = (byte) 2;

    private axnj() {
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
                return anxl.newMessageInfo(e, "\u0001\u0003\u0000\u0001\u0003\u0006\u0003\u0000\u0000\u0003\u0003Љ\u0000\u0004Љ\u0001\u0006Љ\u0003", new Object[]{"a", "b", "c", "d"});
            case 3:
                return new axnj();
            case 4:
                return new axnl();
            case 5:
                return e;
            case 6:
                Object obj3 = g;
                if (obj3 == null) {
                    synchronized (axnj.class) {
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
        axnj axnj = new axnj();
        e = axnj;
        anxl.registerDefaultInstance(axnj.class, axnj);
    }
}
