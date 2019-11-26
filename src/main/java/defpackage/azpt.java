package defpackage;

/* renamed from: azpt */
public final class azpt extends anxl implements anzf {
    public static final azpt j;
    private static volatile anzq l;
    public int a;
    public azpx b;
    public anyd c = anxl.emptyProtobufList();
    public arml d;
    public axak e;
    public axak f;
    public anyd g = anxl.emptyProtobufList();
    public anyd h = anxl.emptyProtobufList();
    public anvu i = anvu.a;
    private byte k = (byte) 2;

    private azpt() {
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
                return anxl.newMessageInfo(j, "\u0001\b\u0000\u0001\u0001\t\b\u0000\u0003\u0007\u0001Љ\u0000\u0002Л\u0003Љ\u0001\u0004Љ\u0002\u0005Љ\u0003\u0006Л\u0007Л\t\n\u0005", new Object[]{"a", "b", "c", azps.class, "d", "e", "f", "g", apxu.class, "h", apxu.class, "i"});
            case 3:
                return new azpt();
            case 4:
                return new azpu();
            case 5:
                return j;
            case 6:
                Object obj3 = l;
                if (obj3 == null) {
                    synchronized (azpt.class) {
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
        azpt azpt = new azpt();
        j = azpt;
        anxl.registerDefaultInstance(azpt.class, azpt);
    }
}
