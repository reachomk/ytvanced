package defpackage;

/* renamed from: avey */
public final class avey extends anxl implements anzf {
    public static final avey e;
    private static volatile anzq g;
    public int a;
    public arho b;
    public aphg c;
    public aphv d;
    private byte f = (byte) 2;

    private avey() {
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
                return anxl.newMessageInfo(e, "\u0001\u0003\u0000\u0001ἑⶔ\u0003\u0000\u0000\u0003ἑЉ\u0001☢Љ\u0002ⶔЉ\u0000", new Object[]{"a", "c", "d", "b"});
            case 3:
                return new avey();
            case 4:
                return new avex();
            case 5:
                return e;
            case 6:
                Object obj3 = g;
                if (obj3 == null) {
                    synchronized (avey.class) {
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
        avey avey = new avey();
        e = avey;
        anxl.registerDefaultInstance(avey.class, avey);
    }
}
