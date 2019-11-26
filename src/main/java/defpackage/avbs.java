package defpackage;

/* renamed from: avbs */
public final class avbs extends anxl implements anzf {
    public static final avbs e;
    private static volatile anzq g;
    public int a;
    public avbm b;
    public avbo c;
    public anyd d = anxl.emptyProtobufList();
    private byte f = (byte) 2;

    private avbs() {
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
                return anxl.newMessageInfo(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0002\u0001Љ\u0000\u0002Љ\u0001\u0003\u001b", new Object[]{"a", "b", "c", "d", avca.class});
            case 3:
                return new avbs();
            case 4:
                return new avbr();
            case 5:
                return e;
            case 6:
                Object obj3 = g;
                if (obj3 == null) {
                    synchronized (avbs.class) {
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
        avbs avbs = new avbs();
        e = avbs;
        anxl.registerDefaultInstance(avbs.class, avbs);
    }
}
