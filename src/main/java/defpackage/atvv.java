package defpackage;

/* renamed from: atvv */
public final class atvv extends anxl implements anzf {
    public static final atvv d;
    private static volatile anzq f;
    public int a;
    public atvr b;
    public anyd c = anxl.emptyProtobufList();
    private byte e = (byte) 2;

    private atvv() {
        anxl.emptyProtobufList();
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
                return anxl.newMessageInfo(d, "\u0001\u0002\u0000\u0001\u0001\u0005\u0002\u0000\u0001\u0002\u0001Л\u0005Љ\u0000", new Object[]{"a", "c", atwb.class, "b"});
            case 3:
                return new atvv();
            case 4:
                return new atvu();
            case 5:
                return d;
            case 6:
                Object obj3 = f;
                if (obj3 == null) {
                    synchronized (atvv.class) {
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
        atvv atvv = new atvv();
        d = atvv;
        anxl.registerDefaultInstance(atvv.class, atvv);
    }
}
