package defpackage;

/* renamed from: azpf */
public final class azpf extends anxp implements anzf {
    public static final azpf p;
    private static volatile anzq r;
    public int a;
    public arml b;
    public aygk c;
    public aygk d;
    public arwf e;
    public aygk f;
    public azpd g;
    public arml i;
    public azov j;
    public azox k;
    public String l = "";
    public arml m;
    public aphj n;
    public aphj o;
    private byte q = (byte) 2;

    private azpf() {
        anxl.emptyProtobufList();
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.q);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.q = b;
                return null;
            case 2:
                return anxl.newMessageInfo(p, "\u0001\r\u0000\u0001\u0001\u0010\r\u0000\u0000\n\u0001Љ\u0000\u0002Љ\u0001\u0003Љ\u0002\u0004Љ\u0004\u0005\t\u0005\u0006Љ\u0006\u0007Љ\u0007\bЉ\b\t\b\t\rЉ\u000b\u000eЉ\f\u000fЉ\n\u0010\t\u0003", new Object[]{"a", "b", "c", "d", "f", "g", "i", "j", "k", "l", "n", "o", "m", "e"});
            case 3:
                return new azpf();
            case 4:
                return new azpi();
            case 5:
                return p;
            case 6:
                Object obj3 = r;
                if (obj3 == null) {
                    synchronized (azpf.class) {
                        obj3 = r;
                        if (obj3 == null) {
                            obj3 = new anxn(p);
                            r = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        azpf azpf = new azpf();
        p = azpf;
        anxl.registerDefaultInstance(azpf.class, azpf);
    }
}
