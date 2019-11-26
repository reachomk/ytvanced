package defpackage;

/* renamed from: anuc */
public final class anuc extends anxl implements anzf {
    public static final anuc d;
    private static volatile anzq f;
    public int a;
    public anyd b = anxl.emptyProtobufList();
    public anuj c;
    private byte e = (byte) 2;

    private anuc() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.e);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.e = b;
                return null;
            case 2:
                return anxl.newMessageInfo(d, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0001\u0001\u0002\u001b\u0003Љ\u0001", new Object[]{"a", "b", anue.class, "c"});
            case 3:
                return new anuc();
            case 4:
                return new anuf();
            case 5:
                return d;
            case 6:
                Object obj3 = f;
                if (obj3 == null) {
                    synchronized (anuc.class) {
                        obj3 = f;
                        if (obj3 == null) {
                            obj3 = new anxn(d);
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
        anuc anuc = new anuc();
        d = anuc;
        anxl.registerDefaultInstance(anuc.class, anuc);
    }
}
