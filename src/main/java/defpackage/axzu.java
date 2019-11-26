package defpackage;

/* renamed from: axzu */
public final class axzu extends anxl implements anzf {
    public static final axzu f;
    private static volatile anzq h;
    public int a;
    public arml b;
    public apxu c;
    public anvu d = anvu.a;
    public boolean e;
    private byte g = (byte) 2;

    private axzu() {
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
                return anxl.newMessageInfo(f, "\u0001\u0004\u0000\u0001\u0001\u0006\u0004\u0000\u0000\u0002\u0001Љ\u0000\u0002Љ\u0001\u0005\n\u0004\u0006\u0007\u0005", new Object[]{"a", "b", "c", "d", "e"});
            case 3:
                return new axzu();
            case 4:
                return new axzx();
            case 5:
                return f;
            case 6:
                Object obj3 = h;
                if (obj3 == null) {
                    synchronized (axzu.class) {
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
        axzu axzu = new axzu();
        f = axzu;
        anxl.registerDefaultInstance(axzu.class, axzu);
    }
}
