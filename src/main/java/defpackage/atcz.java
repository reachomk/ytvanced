package defpackage;

/* renamed from: atcz */
public final class atcz extends anxl implements anzf {
    public static final atcz c;
    private static volatile anzq d;
    public int a = 0;
    public Object b;

    private atcz() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(c, "\u0001\u0006\u0001\u0000Თ嗢㷌\u0006\u0000\u0000\u0000Თ<\u0000︙ḭ<\u0000ḳ<\u0000≾<\u0000⥶<\u0000嗢㷌<\u0000", new Object[]{"b", "a", awcq.class, awci.class, awcm.class, awck.class, awcg.class, awco.class});
            case 3:
                return new atcz();
            case 4:
                return new atdc();
            case 5:
                return c;
            case 6:
                Object obj3 = d;
                if (obj3 == null) {
                    synchronized (atcz.class) {
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
        atcz atcz = new atcz();
        c = atcz;
        anxl.registerDefaultInstance(atcz.class, atcz);
    }
}
