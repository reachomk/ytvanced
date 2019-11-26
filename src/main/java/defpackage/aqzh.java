package defpackage;

/* renamed from: aqzh */
public final class aqzh extends anxl implements anzf {
    public static final aqzh a;
    private static volatile anzq b;

    private aqzh() {
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
                return new aqzh();
            case 4:
                return new aqzg();
            case 5:
                return a;
            case 6:
                Object obj3 = b;
                if (obj3 == null) {
                    synchronized (aqzh.class) {
                        obj3 = b;
                        if (obj3 == null) {
                            obj3 = new anxn(a);
                            b = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        aqzh aqzh = new aqzh();
        a = aqzh;
        anxl.registerDefaultInstance(aqzh.class, aqzh);
    }
}
