package defpackage;

/* renamed from: atck */
public final class atck extends anxl implements anzf {
    public static final atck c;
    private static volatile anzq d;
    public int a;
    public avpd b;

    private atck() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(c, "\u0001\u0001\u0000\u0001ᢐᢐ\u0001\u0000\u0000\u0000ᢐ\t\u0000", new Object[]{"a", "b"});
            case 3:
                return new atck();
            case 4:
                return new atcj();
            case 5:
                return c;
            case 6:
                Object obj3 = d;
                if (obj3 == null) {
                    synchronized (atck.class) {
                        obj3 = d;
                        if (obj3 == null) {
                            obj3 = new anxn(c);
                            d = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        atck atck = new atck();
        c = atck;
        anxl.registerDefaultInstance(atck.class, atck);
    }
}
