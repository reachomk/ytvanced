package defpackage;

/* renamed from: asic */
public final class asic extends anxp implements anzf {
    public static final asic k;
    private static volatile anzq m;
    public int a;
    public String b = "";
    public ashu c;
    public anyd d = anxl.emptyProtobufList();
    public int e;
    public ashw f;
    public anyd g;
    public arrm i;
    public aqjg j;
    private byte l = (byte) 2;

    private asic() {
        anxl.emptyProtobufList();
        this.g = anxl.emptyProtobufList();
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.l);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.l = b;
                return null;
            case 2:
                return anxl.newMessageInfo(k, "\u0001\b\u0000\u0001\u0002\u0016\b\u0000\u0002\u0003\u0002\b\u0001\u0005Љ\u0002\u0006Л\u0007\u000b\u0003\u000eЉ\u000b\u000f\u001a\u0010\t\f\u0016\t\u0010", new Object[]{"a", "b", "c", "d", asie.class, "e", "f", "g", "i", "j"});
            case 3:
                return new asic();
            case 4:
                return new asif();
            case 5:
                return k;
            case 6:
                Object obj3 = m;
                if (obj3 == null) {
                    synchronized (asic.class) {
                        obj3 = m;
                        if (obj3 == null) {
                            obj3 = new anxn(k);
                            m = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        asic asic = new asic();
        k = asic;
        anxl.registerDefaultInstance(asic.class, asic);
    }
}
