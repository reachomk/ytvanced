package defpackage;

/* renamed from: awew */
public final class awew extends anxl implements anzf {
    public static final awew c;
    private static volatile anzq e;
    public int a = 0;
    public Object b;
    private byte d = (byte) 2;

    private awew() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.d);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.d = b;
                return null;
            case 2:
                return anxl.newMessageInfo(c, "\u0001\u0002\u0001\u0000ἑᾮ\u0002\u0000\u0000\u0002ἑм\u0000ᾮм\u0000", new Object[]{"b", "a", aphg.class, auvn.class});
            case 3:
                return new awew();
            case 4:
                return new awez();
            case 5:
                return c;
            case 6:
                Object obj3 = e;
                if (obj3 == null) {
                    synchronized (awew.class) {
                        obj3 = e;
                        if (obj3 == null) {
                            obj3 = new anxn(c);
                            e = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        awew awew = new awew();
        c = awew;
        anxl.registerDefaultInstance(awew.class, awew);
    }
}
