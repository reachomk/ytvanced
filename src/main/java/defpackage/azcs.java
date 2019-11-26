package defpackage;

/* renamed from: azcs */
public final class azcs extends anxl implements anzf {
    public static final azcs j;
    private static volatile anzq l;
    public int a;
    public arml b;
    public axwz c;
    public apxu d;
    public arml e;
    public arml f;
    public azcu g;
    public auuq h;
    public axak i;
    private byte k = (byte) 2;

    private azcs() {
        anxl.emptyProtobufList();
        anxl.emptyProtobufList();
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
                return anxl.newMessageInfo(j, "\u0001\b\u0000\u0001\u0002\u000f\b\u0000\u0000\b\u0002Љ\u0001\u0003Љ\u0002\u0004Љ\u0003\u0005Љ\u0004\u0006Љ\u0006\u000bЉ\u0007\u000eЉ\b\u000fЉ\u0005", new Object[]{"a", "b", "c", "d", "e", "g", "h", "i", "f"});
            case 3:
                return new azcs();
            case 4:
                return new azcr();
            case 5:
                return j;
            case 6:
                Object obj3 = l;
                if (obj3 == null) {
                    synchronized (azcs.class) {
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
        azcs azcs = new azcs();
        j = azcs;
        anxl.registerDefaultInstance(azcs.class, azcs);
    }
}
