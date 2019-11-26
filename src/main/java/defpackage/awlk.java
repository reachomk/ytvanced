package defpackage;

/* renamed from: awlk */
public final class awlk extends anxl implements anzf {
    public static final awlk a;
    public static final anxr b = anxl.newSingularGeneratedExtension(awlq.C, "", null, null, 125983101, aobm.STRING, String.class);
    private static volatile anzq c;

    private awlk() {
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
                return new awlk();
            case 4:
                return new awln();
            case 5:
                return a;
            case 6:
                Object obj3 = c;
                if (obj3 == null) {
                    synchronized (awlk.class) {
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
        awlk awlk = new awlk();
        a = awlk;
        anxl.registerDefaultInstance(awlk.class, awlk);
    }
}
