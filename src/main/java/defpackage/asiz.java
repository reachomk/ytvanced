package defpackage;

/* renamed from: asiz */
public final class asiz extends anxl implements anzf {
    public static final asiz k;
    private static volatile anzq m;
    public int a;
    public asic b;
    public String c = "";
    public apxu d;
    public apxu e;
    public apxu f;
    public anyd g = anxl.emptyProtobufList();
    public asjb h;
    public apxu i;
    public apxu j;
    private byte l = (byte) 2;

    private asiz() {
        anxl.emptyProtobufList();
        anxl.emptyProtobufList();
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
                return anxl.newMessageInfo(k, "\u0001\t\u0000\u0001\u0001\f\t\u0000\u0001\b\u0001Љ\u0000\u0003\b\u0001\u0004Л\u0005Љ\u0002\u0006Љ\u0005\u0007Љ\u0003\tЉ\u0004\u000bЉ\u0006\fЉ\u0007", new Object[]{"a", "b", "c", "g", asis.class, "d", "h", "e", "f", "i", "j"});
            case 3:
                return new asiz();
            case 4:
                return new asiy();
            case 5:
                return k;
            case 6:
                Object obj3 = m;
                if (obj3 == null) {
                    synchronized (asiz.class) {
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
        asiz asiz = new asiz();
        k = asiz;
        anxl.registerDefaultInstance(asiz.class, asiz);
    }
}
