package defpackage;

/* renamed from: aojm */
public final class aojm extends anxl implements anzf {
    public static final aojm d;
    private static volatile anzq e;
    public int a;
    public anyd b = anxl.emptyProtobufList();
    public aojk c;

    private aojm() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002\t\u0000", new Object[]{"a", "b", aule.class, "c"});
            case 3:
                return new aojm();
            case 4:
                return new aojp();
            case 5:
                return d;
            case 6:
                Object obj3 = e;
                if (obj3 == null) {
                    synchronized (aojm.class) {
                        obj3 = e;
                        if (obj3 == null) {
                            obj3 = new anxn(d);
                            e = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        aojm aojm = new aojm();
        d = aojm;
        anxl.registerDefaultInstance(aojm.class, aojm);
    }
}
