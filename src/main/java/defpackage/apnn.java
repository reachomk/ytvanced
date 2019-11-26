package defpackage;

/* renamed from: apnn */
public final class apnn extends anxl implements anzf {
    public static final apnn i;
    private static volatile anzq k;
    public int a;
    public apnr b;
    public apnr c;
    public apnv d;
    public apnv e;
    public arml f;
    public anyd g = anxl.emptyProtobufList();
    public arml h;
    private byte j = (byte) 2;

    private apnn() {
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
                return anxl.newMessageInfo(i, "\u0001\u0007\u0000\u0001\u0001\u0013\u0007\u0000\u0001\u0007\u0001Љ\u0000\u000eЉ\u0002\u000fЉ\u0003\u0010Љ\u0004\u0011Л\u0012Љ\u0005\u0013Љ\u0001", new Object[]{"a", "b", "d", "e", "f", "g", apnl.class, "h", "c"});
            case 3:
                return new apnn();
            case 4:
                return new apnq();
            case 5:
                return i;
            case 6:
                Object obj3 = k;
                if (obj3 == null) {
                    synchronized (apnn.class) {
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
        apnn apnn = new apnn();
        i = apnn;
        anxl.registerDefaultInstance(apnn.class, apnn);
    }
}
