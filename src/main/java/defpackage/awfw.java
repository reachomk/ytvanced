package defpackage;

/* renamed from: awfw */
public final class awfw extends anxl implements anzf {
    public static final awfw e;
    private static volatile anzq g;
    public int a;
    public arej b;
    public areh c;
    public aohl d;
    private byte f = (byte) 2;

    private awfw() {
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
                return anxl.newMessageInfo(e, "\u0001\u0003\u0000\u0001ᬽ斄\u0003\u0000\u0000\u0003ᬽЉ\u0001ᭀЉ\u0000斄Љ\u0002", new Object[]{"a", "c", "b", "d"});
            case 3:
                return new awfw();
            case 4:
                return new awfy();
            case 5:
                return e;
            case 6:
                Object obj3 = g;
                if (obj3 == null) {
                    synchronized (awfw.class) {
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
        awfw awfw = new awfw();
        e = awfw;
        anxl.registerDefaultInstance(awfw.class, awfw);
    }
}
