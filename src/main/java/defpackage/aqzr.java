package defpackage;

/* renamed from: aqzr */
public final class aqzr extends anxl implements anzf {
    public static final aqzr b;
    private static volatile anzq c;
    public anyd a = anxl.emptyProtobufList();

    private aqzr() {
    }

    public final void a() {
        if (!this.a.a()) {
            this.a = anxl.mutableCopy(this.a);
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", arac.class});
            case 3:
                return new aqzr();
            case 4:
                return new aqzq();
            case 5:
                return b;
            case 6:
                Object obj3 = c;
                if (obj3 == null) {
                    synchronized (aqzr.class) {
                        obj3 = c;
                        if (obj3 == null) {
                            obj3 = new anxn(b);
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
        aqzr aqzr = new aqzr();
        b = aqzr;
        anxl.registerDefaultInstance(aqzr.class, aqzr);
    }
}
