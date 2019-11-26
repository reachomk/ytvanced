package defpackage;

/* renamed from: bccq */
public final class bccq extends anxl implements anzf {
    public static final bccq h;
    private static volatile anzq i;
    public int a;
    public anyd b = anxl.emptyProtobufList();
    public anyd c = anxl.emptyProtobufList();
    public anyd d = anxl.emptyProtobufList();
    public anyd e = anxl.emptyProtobufList();
    public anyd f;
    public bccl g;

    private bccq() {
        anxl.emptyProtobufList();
        this.f = anxl.emptyProtobufList();
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(h, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0005\u0000\u0001\u001b\u0002\u001b\u0003\u001b\u0004\u001b\u0006\u001b\u0007\t\u0001", new Object[]{"a", "b", bcch.class, "c", bccj.class, "d", bccf.class, "e", bccs.class, "f", bccw.class, "g"});
            case 3:
                return new bccq();
            case 4:
                return new bccp();
            case 5:
                return h;
            case 6:
                Object obj3 = i;
                if (obj3 == null) {
                    synchronized (bccq.class) {
                        obj3 = i;
                        if (obj3 == null) {
                            obj3 = new anxn(h);
                            i = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        bccq bccq = new bccq();
        h = bccq;
        anxl.registerDefaultInstance(bccq.class, bccq);
    }
}
