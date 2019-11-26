package defpackage;

/* renamed from: aole */
public final class aole extends anxl implements anzf {
    public static final aole d;
    private static volatile anzq f;
    public anyd a = anxl.emptyProtobufList();
    public anyd b = anxl.emptyProtobufList();
    public anyd c = anxl.emptyProtobufList();
    private byte e = (byte) 2;

    private aole() {
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
                return anxl.newMessageInfo(d, "\u0001\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0003\u0003\u0001Л\u0002Л\u0003Л", new Object[]{"a", apxu.class, "b", apxu.class, "c", apxu.class});
            case 3:
                return new aole();
            case 4:
                return new aolh();
            case 5:
                return d;
            case 6:
                Object obj3 = f;
                if (obj3 == null) {
                    synchronized (aole.class) {
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
        aole aole = new aole();
        d = aole;
        anxl.registerDefaultInstance(aole.class, aole);
    }
}
