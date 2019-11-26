package defpackage;

/* renamed from: awnu */
public final class awnu extends anxl implements anzf {
    public static final awnu f;
    private static volatile anzq h;
    public int a;
    public aygk b;
    public arml c;
    public int d;
    public axak e;
    private byte g = (byte) 2;

    private awnu() {
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
                return anxl.newMessageInfo(f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0003\u0001Љ\u0000\u0002Љ\u0003\u0003\f\u0004\u0004Љ\u0005", new Object[]{"a", "b", "c", "d", awnn.a, "e"});
            case 3:
                return new awnu();
            case 4:
                return new awnw();
            case 5:
                return f;
            case 6:
                Object obj3 = h;
                if (obj3 == null) {
                    synchronized (awnu.class) {
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
        awnu awnu = new awnu();
        f = awnu;
        anxl.registerDefaultInstance(awnu.class, awnu);
    }
}
