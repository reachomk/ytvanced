package defpackage;

/* renamed from: avai */
public final class avai extends anxl implements anzf {
    public static final avai d;
    private static volatile anzq e;
    public int a;
    public anyd b = anxl.emptyProtobufList();
    public long c;

    private avai() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(d, "\u0001\u0002\u0000\u0001\u0003\u0005\u0002\u0000\u0001\u0000\u0003\u001a\u0005\u0002\u0002", new Object[]{"a", "b", "c"});
            case 3:
                return new avai();
            case 4:
                return new aval();
            case 5:
                return d;
            case 6:
                Object obj3 = e;
                if (obj3 == null) {
                    synchronized (avai.class) {
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
        avai avai = new avai();
        d = avai;
        anxl.registerDefaultInstance(avai.class, avai);
    }
}