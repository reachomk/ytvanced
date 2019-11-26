package defpackage;

/* renamed from: awow */
public final class awow extends anxl implements anzf {
    public static final awow e;
    private static volatile anzq g;
    public int a;
    public awpw b;
    public awou c;
    public aojc d;
    private byte f = (byte) 2;

    private awow() {
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
                return anxl.newMessageInfo(e, "\u0001\u0003\u0000\u0001\u0001\u0007\u0003\u0000\u0000\u0003\u0001Љ\u0000\u0006Љ\u0001\u0007Љ\u0003", new Object[]{"a", "b", "c", "d"});
            case 3:
                return new awow();
            case 4:
                return new awoz();
            case 5:
                return e;
            case 6:
                Object obj3 = g;
                if (obj3 == null) {
                    synchronized (awow.class) {
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
        awow awow = new awow();
        e = awow;
        anxl.registerDefaultInstance(awow.class, awow);
    }
}
