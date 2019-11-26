package defpackage;

/* renamed from: avjd */
public final class avjd extends anxl implements anzf {
    public static final avjd a;
    public static final anxr b = anxl.newSingularGeneratedExtension(apxu.d, avjf.h, avjf.h, null, 94476261, aobm.MESSAGE, avjf.class);
    private static volatile anzq c;

    private avjd() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(a, "\u0001\u0000", null);
            case 3:
                return new avjd();
            case 4:
                return new avjg();
            case 5:
                return a;
            case 6:
                Object obj3 = c;
                if (obj3 == null) {
                    synchronized (avjd.class) {
                        obj3 = c;
                        if (obj3 == null) {
                            obj3 = new anxn(a);
                            c = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        avjd avjd = new avjd();
        a = avjd;
        anxl.registerDefaultInstance(avjd.class, avjd);
    }
}
