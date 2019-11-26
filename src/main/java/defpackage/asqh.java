package defpackage;

/* renamed from: asqh */
public final class asqh extends anxl implements anzf {
    public static final asqh d;
    private static volatile anzq f;
    public int a;
    public int b;
    public anyd c = anxl.emptyProtobufList();
    private byte e = (byte) 2;

    private asqh() {
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
                return anxl.newMessageInfo(d, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0001\u0001\u0001\f\u0000\u0003Л", new Object[]{"a", "b", asqm.a, "c", asqd.class});
            case 3:
                return new asqh();
            case 4:
                return new asqk();
            case 5:
                return d;
            case 6:
                Object obj3 = f;
                if (obj3 == null) {
                    synchronized (asqh.class) {
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
        asqh asqh = new asqh();
        d = asqh;
        anxl.registerDefaultInstance(asqh.class, asqh);
    }
}
