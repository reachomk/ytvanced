package defpackage;

/* renamed from: azov */
public final class azov extends anxl implements anzf {
    public static final azov j;
    private static volatile anzq l;
    public int a;
    public String b = "";
    public arml c;
    public arml d;
    public arml e;
    public arml f;
    public arml g;
    public azpb h;
    public azoz i;
    private byte k = (byte) 2;

    private azov() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.k);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.k = b;
                return null;
            case 2:
                return anxl.newMessageInfo(j, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0007\u0001\b\u0000\u0002Љ\u0001\u0003Љ\u0002\u0004Љ\u0003\u0005Љ\u0004\u0006Љ\u0006\u0007Љ\u0007\bЉ\u0005", new Object[]{"a", "b", "c", "d", "e", "f", "h", "i", "g"});
            case 3:
                return new azov();
            case 4:
                return new azoy();
            case 5:
                return j;
            case 6:
                Object obj3 = l;
                if (obj3 == null) {
                    synchronized (azov.class) {
                        obj3 = l;
                        if (obj3 == null) {
                            obj3 = new anxn(j);
                            l = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        azov azov = new azov();
        j = azov;
        anxl.registerDefaultInstance(azov.class, azov);
    }
}
