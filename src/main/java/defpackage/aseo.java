package defpackage;

/* renamed from: aseo */
public final class aseo extends anxl implements anzf {
    public static final aseo i;
    private static volatile anzq k;
    public int a;
    public asic b;
    public apxu c;
    public anyd d = anxl.emptyProtobufList();
    public anyd e = anxl.emptyProtobufList();
    public anyd f;
    public anvu g;
    public arml h;
    private byte j = (byte) 2;

    private aseo() {
        anxl.emptyProtobufList();
        this.f = anxl.emptyProtobufList();
        this.g = anvu.a;
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.j);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.j = b;
                return null;
            case 2:
                return anxl.newMessageInfo(i, "\u0001\u0007\u0000\u0001\u0001\n\u0007\u0000\u0003\u0006\u0001Љ\u0000\u0002Љ\u0001\u0004Л\u0006Л\b\n\u0003\tЉ\u0004\nЛ", new Object[]{"a", "b", "c", "d", apxu.class, "f", aqnn.class, "g", "h", "e", apxu.class});
            case 3:
                return new aseo();
            case 4:
                return new aser();
            case 5:
                return i;
            case 6:
                Object obj3 = k;
                if (obj3 == null) {
                    synchronized (aseo.class) {
                        obj3 = k;
                        if (obj3 == null) {
                            obj3 = new anxn(i);
                            k = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        aseo aseo = new aseo();
        i = aseo;
        anxl.registerDefaultInstance(aseo.class, aseo);
    }
}
