package defpackage;

/* renamed from: asnr */
public final class asnr extends anxl implements anzf {
    public static final asnr j;
    private static volatile anzq l;
    public int a;
    public int b = 0;
    public Object c;
    public anvu d = anvu.a;
    public arml e;
    public aygk f;
    public arml g;
    public arml h;
    public arml i;
    private byte k = (byte) 2;

    private asnr() {
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
                return anxl.newMessageInfo(j, "\u0001\b\u0001\u0001\u0002\t\b\u0000\u0000\u0006\u0002\n\u0001\u0003Љ\u0002\u0004Љ\u0003\u0005Љ\u0004\u0006Љ\u0005\u0007Љ\u0006\bм\u0000\t;\u0000", new Object[]{"c", "b", "a", "d", "e", "f", "g", "h", "i", apxu.class});
            case 3:
                return new asnr();
            case 4:
                return new asnq();
            case 5:
                return j;
            case 6:
                Object obj3 = l;
                if (obj3 == null) {
                    synchronized (asnr.class) {
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
        asnr asnr = new asnr();
        j = asnr;
        anxl.registerDefaultInstance(asnr.class, asnr);
    }
}
