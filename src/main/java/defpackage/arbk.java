package defpackage;

/* renamed from: arbk */
public final class arbk extends anxp implements anzf {
    public static final arbk d;
    private static volatile anzq f;
    public int a;
    public azuj b;
    public azsr c;
    private byte e = (byte) 2;

    private arbk() {
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
                return anxl.newMessageInfo(d, "\u0001\u0002\u0000\u0001\u0001\u0004\u0002\u0000\u0000\u0002\u0001Љ\u0000\u0004Љ\u0002", new Object[]{"a", "b", "c"});
            case 3:
                return new arbk();
            case 4:
                return new arbn();
            case 5:
                return d;
            case 6:
                Object obj3 = f;
                if (obj3 == null) {
                    synchronized (arbk.class) {
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
        arbk arbk = new arbk();
        d = arbk;
        anxl.registerDefaultInstance(arbk.class, arbk);
    }
}
