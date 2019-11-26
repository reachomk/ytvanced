package defpackage;

/* renamed from: anrk */
public final class anrk extends anxl implements anzf {
    public static final anrk e;
    private static volatile anzq f;
    public int a;
    public long b;
    public anye c = anxl.emptyLongList();
    public anyd d = anxl.emptyProtobufList();

    private anrk() {
        anxl.emptyProtobufList();
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(e, "\u0001\u0003\u0000\u0001\u0004\u0006\u0003\u0000\u0002\u0000\u0004\u001b\u0005\u0005\u0001\u0006\u0017", new Object[]{"a", "d", anrm.class, "b", "c"});
            case 3:
                return new anrk();
            case 4:
                return new anrn();
            case 5:
                return e;
            case 6:
                Object obj3 = f;
                if (obj3 == null) {
                    synchronized (anrk.class) {
                        obj3 = f;
                        if (obj3 == null) {
                            obj3 = new anxn(e);
                            f = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        anrk anrk = new anrk();
        e = anrk;
        anxl.registerDefaultInstance(anrk.class, anrk);
    }
}
