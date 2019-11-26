package defpackage;

/* renamed from: axjr */
public final class axjr extends anxl implements anzf {
    public static final axjr g;
    private static volatile anzq i;
    public int a;
    public axkl b;
    public axjp c;
    public axjp d;
    public apxu e;
    public apxu f;
    private byte h = (byte) 2;

    private axjr() {
        anxl.emptyProtobufList();
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.h);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.h = b;
                return null;
            case 2:
                return anxl.newMessageInfo(g, "\u0001\u0005\u0000\u0001\u0002\u0007\u0005\u0000\u0000\u0005\u0002Љ\u0001\u0004Љ\u0002\u0005Љ\u0003\u0006Љ\u0004\u0007Љ\u0005", new Object[]{"a", "b", "c", "d", "e", "f"});
            case 3:
                return new axjr();
            case 4:
                return new axju();
            case 5:
                return g;
            case 6:
                Object obj3 = i;
                if (obj3 == null) {
                    synchronized (axjr.class) {
                        obj3 = i;
                        if (obj3 == null) {
                            obj3 = new anxn(g);
                            i = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        axjr axjr = new axjr();
        g = axjr;
        anxl.registerDefaultInstance(axjr.class, axjr);
    }
}
