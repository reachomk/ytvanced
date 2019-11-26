package defpackage;

/* renamed from: axsz */
public final class axsz extends anxl implements anzf {
    public static final axsz e;
    private static volatile anzq g;
    public int a;
    public arml b;
    public anyd c = anxl.emptyProtobufList();
    public int d = -1;
    private byte f = (byte) 2;

    private axsz() {
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
                return anxl.newMessageInfo(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0002\u0001Љ\u0000\u0002Л\u0003\u0004\u0001", new Object[]{"a", "b", "c", axak.class, "d"});
            case 3:
                return new axsz();
            case 4:
                return new axsy();
            case 5:
                return e;
            case 6:
                Object obj3 = g;
                if (obj3 == null) {
                    synchronized (axsz.class) {
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
        axsz axsz = new axsz();
        e = axsz;
        anxl.registerDefaultInstance(axsz.class, axsz);
    }
}
