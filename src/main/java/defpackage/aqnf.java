package defpackage;

/* renamed from: aqnf */
public final class aqnf extends anxl implements anzf {
    public static final aqnf j;
    private static volatile anzq l;
    public int a;
    public arwf b;
    public arml c;
    public arml d;
    public aphj e;
    public apxu f;
    public apxu g;
    public aqnd h;
    public anvu i = anvu.a;
    private byte k = (byte) 2;

    private aqnf() {
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
                return anxl.newMessageInfo(j, "\u0001\b\u0000\u0001\u0001\r\b\u0000\u0000\u0006\u0001Љ\u0003\u0004\n\b\u0006Љ\u0004\bЉ\u0005\tЉ\u0007\u000b\t\u0000\fЉ\u0001\rЉ\u0002", new Object[]{"a", "e", "i", "f", "g", "h", "b", "c", "d"});
            case 3:
                return new aqnf();
            case 4:
                return new aqne();
            case 5:
                return j;
            case 6:
                Object obj3 = l;
                if (obj3 == null) {
                    synchronized (aqnf.class) {
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
        aqnf aqnf = new aqnf();
        j = aqnf;
        anxl.registerDefaultInstance(aqnf.class, aqnf);
    }
}
