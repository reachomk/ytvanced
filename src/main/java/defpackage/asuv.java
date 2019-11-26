package defpackage;

/* renamed from: asuv */
public final class asuv extends anxl implements anzf {
    public static final asuv e;
    private static volatile anzq g;
    public int a;
    public asic b;
    public anyd c;
    public apxu d;
    private byte f = (byte) 2;

    private asuv() {
        anxl.emptyProtobufList();
        this.c = anxl.emptyProtobufList();
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
                return anxl.newMessageInfo(e, "\u0001\u0003\u0000\u0001\u0001\u0005\u0003\u0000\u0001\u0003\u0001Љ\u0000\u0004Л\u0005Љ\u0001", new Object[]{"a", "b", "c", apxu.class, "d"});
            case 3:
                return new asuv();
            case 4:
                return new asuy();
            case 5:
                return e;
            case 6:
                Object obj3 = g;
                if (obj3 == null) {
                    synchronized (asuv.class) {
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
        asuv asuv = new asuv();
        e = asuv;
        anxl.registerDefaultInstance(asuv.class, asuv);
    }
}
