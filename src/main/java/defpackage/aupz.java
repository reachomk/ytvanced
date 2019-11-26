package defpackage;

/* renamed from: aupz */
public final class aupz extends anxl implements anzf {
    public static final aupz d;
    private static volatile anzq e;
    public int a;
    public long b;
    public anyd c = anxl.emptyProtobufList();

    private aupz() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u0002\u0000\u0002\u001b", new Object[]{"a", "b", "c", aupx.class});
            case 3:
                return new aupz();
            case 4:
                return new auqc();
            case 5:
                return d;
            case 6:
                Object obj3 = e;
                if (obj3 == null) {
                    synchronized (aupz.class) {
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
        aupz aupz = new aupz();
        d = aupz;
        anxl.registerDefaultInstance(aupz.class, aupz);
    }
}
