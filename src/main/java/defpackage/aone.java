package defpackage;

/* renamed from: aone */
public final class aone extends anxl implements anzf {
    public static final aone e;
    private static volatile anzq g;
    public int a;
    public aphg b;
    public aonb c;
    public auvv d;
    private byte f = (byte) 2;

    private aone() {
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
                return anxl.newMessageInfo(e, "\u0001\u0003\u0000\u0001ἑ㭚\u0003\u0000\u0000\u0003ἑЉ\u0000✹Љ\u0002㭚Љ\u0001", new Object[]{"a", "b", "d", "c"});
            case 3:
                return new aone();
            case 4:
                return new aond();
            case 5:
                return e;
            case 6:
                Object obj3 = g;
                if (obj3 == null) {
                    synchronized (aone.class) {
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
        aone aone = new aone();
        e = aone;
        anxl.registerDefaultInstance(aone.class, aone);
    }
}
