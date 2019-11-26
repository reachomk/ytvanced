package defpackage;

/* renamed from: axpr */
public final class axpr extends anxl implements anzf {
    public static final axpr f;
    private static volatile anzq h;
    public int a;
    public anyd b = anxl.emptyProtobufList();
    public axpg c;
    public axpg d;
    public arml e;
    private byte g = (byte) 2;

    private axpr() {
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
                return anxl.newMessageInfo(f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0004\u0001Л\u0002Љ\u0000\u0003Љ\u0001\u0004Љ\u0002", new Object[]{"a", "b", axpe.class, "c", "d", "e"});
            case 3:
                return new axpr();
            case 4:
                return new axpt();
            case 5:
                return f;
            case 6:
                Object obj3 = h;
                if (obj3 == null) {
                    synchronized (axpr.class) {
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
        axpr axpr = new axpr();
        f = axpr;
        anxl.registerDefaultInstance(axpr.class, axpr);
    }
}
