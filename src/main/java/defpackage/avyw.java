package defpackage;

/* renamed from: avyw */
public final class avyw extends anxl implements anzf {
    public static final avyw f;
    private static volatile anzq h;
    public int a;
    public avys b;
    public avza c;
    public avze d;
    public anyd e = anxl.emptyProtobufList();
    private byte g = (byte) 2;

    private avyw() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.g);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.g = b;
                return null;
            case 2:
                return anxl.newMessageInfo(f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0002\u0001Љ\u0000\u0002Љ\u0001\u0003\t\u0002\u0004\u001b", new Object[]{"a", "b", "c", "d", "e", avyu.class});
            case 3:
                return new avyw();
            case 4:
                return new avyv();
            case 5:
                return f;
            case 6:
                Object obj3 = h;
                if (obj3 == null) {
                    synchronized (avyw.class) {
                        obj3 = h;
                        if (obj3 == null) {
                            obj3 = new anxn(f);
                            h = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        avyw avyw = new avyw();
        f = avyw;
        anxl.registerDefaultInstance(avyw.class, avyw);
    }
}
