package defpackage;

/* renamed from: asnf */
public final class asnf extends anxl implements anzf {
    public static final asnf e;
    private static volatile anzq g;
    public int a;
    public asic b;
    public anyd c = anxl.emptyProtobufList();
    public String d = "";
    private byte f = (byte) 2;

    private asnf() {
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
                return anxl.newMessageInfo(e, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0001\u0001\u0001Љ\u0000\u0003\u001b\u0004\b\u0001", new Object[]{"a", "b", "c", asnh.class, "d"});
            case 3:
                return new asnf();
            case 4:
                return new asne();
            case 5:
                return e;
            case 6:
                Object obj3 = g;
                if (obj3 == null) {
                    synchronized (asnf.class) {
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
        asnf asnf = new asnf();
        e = asnf;
        anxl.registerDefaultInstance(asnf.class, asnf);
    }
}
