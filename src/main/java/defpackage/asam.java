package defpackage;

/* renamed from: asam */
public final class asam extends anxl implements anzf {
    public static final asam f;
    private static volatile anzq h;
    public int a;
    public asaw b;
    public asao c;
    public asba d;
    public asbe e;
    private byte g = (byte) 2;

    private asam() {
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
                return anxl.newMessageInfo(f, "\u0001\u0004\u0000\u0001㙌嶍\u0004\u0000\u0000\u0004㙌Љ\u0001喠Љ\u0002坩Љ\u0003嶍Љ\u0004", new Object[]{"a", "b", "c", "d", "e"});
            case 3:
                return new asam();
            case 4:
                return new asap();
            case 5:
                return f;
            case 6:
                Object obj3 = h;
                if (obj3 == null) {
                    synchronized (asam.class) {
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
        asam asam = new asam();
        f = asam;
        anxl.registerDefaultInstance(asam.class, asam);
    }
}
