package defpackage;

/* renamed from: aogq */
public final class aogq extends anxl implements anzf {
    public static final aogq e;
    private static volatile anzq g;
    public int a;
    public apxu b;
    public anyd c = anxl.emptyProtobufList();
    public anvu d = anvu.a;
    private byte f = (byte) 2;

    private aogq() {
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
                return anxl.newMessageInfo(e, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0001\u0002\u0001Љ\u0000\u0002Л\u0004\n\u0002", new Object[]{"a", "b", "c", apxu.class, "d"});
            case 3:
                return new aogq();
            case 4:
                return new aogs();
            case 5:
                return e;
            case 6:
                Object obj3 = g;
                if (obj3 == null) {
                    synchronized (aogq.class) {
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
        aogq aogq = new aogq();
        e = aogq;
        anxl.registerDefaultInstance(aogq.class, aogq);
    }
}
