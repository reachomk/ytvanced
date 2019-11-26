package defpackage;

/* renamed from: bccz */
public final class bccz extends anxl implements anzf {
    public static final bccz e;
    private static volatile anzq f;
    public int a;
    public long b;
    public int c;
    public anyd d = anxl.emptyProtobufList();

    private bccz() {
    }

    public final void a() {
        if (!this.d.a()) {
            this.d = anxl.mutableCopy(this.d);
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
                return anxl.newMessageInfo(e, "\u0001\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0001\u0000\u0002\u001b", new Object[]{"d", bcde.class});
            case 3:
                return new bccz();
            case 4:
                return new bcdc();
            case 5:
                return e;
            case 6:
                Object obj3 = f;
                if (obj3 == null) {
                    synchronized (bccz.class) {
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
        bccz bccz = new bccz();
        e = bccz;
        anxl.registerDefaultInstance(bccz.class, bccz);
    }
}
