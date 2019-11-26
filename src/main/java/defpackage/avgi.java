package defpackage;

/* renamed from: avgi */
public final class avgi extends anxp implements anzf {
    public static final avgi j;
    private static volatile anzq l;
    public int a;
    public arml b;
    public arml c;
    public apxu d;
    public atzt e;
    public auvr f;
    public arml g;
    public avgg i;
    private byte k = (byte) 2;

    private avgi() {
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
                return anxl.newMessageInfo(j, "\u0001\u0007\u0000\u0001\u0002\u0010\u0007\u0000\u0000\u0007\u0002Љ\u0001\u0003Љ\u0003\u0004Љ\u0004\tЉ\u0005\u000bЉ\u0007\rЉ\u000b\u0010Љ\r", new Object[]{"a", "b", "c", "d", "e", "f", "g", "i"});
            case 3:
                return new avgi();
            case 4:
                return new avgh();
            case 5:
                return j;
            case 6:
                Object obj3 = l;
                if (obj3 == null) {
                    synchronized (avgi.class) {
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
        avgi avgi = new avgi();
        j = avgi;
        anxl.registerDefaultInstance(avgi.class, avgi);
    }
}
