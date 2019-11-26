package defpackage;

/* renamed from: avju */
public final class avju extends anxl implements anzf {
    public static final avju k;
    private static volatile anzq m;
    public int a;
    public arml b;
    public arml c;
    public arml d;
    public arml e;
    public arml f;
    public apxu g;
    public apxu h;
    public arml i;
    public arml j;
    private byte l = (byte) 2;

    private avju() {
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
                return anxl.newMessageInfo(k, "\u0001\t\u0000\u0001\u0003\u000f\t\u0000\u0000\t\u0003Љ\u0003\u0004Љ\u0005\u0005Љ\u0006\u0006Љ\u0007\u0007Љ\b\bЉ\t\tЉ\n\rЉ\u000b\u000fЉ\u0004", new Object[]{"a", "b", "d", "e", "f", "g", "h", "i", "j", "c"});
            case 3:
                return new avju();
            case 4:
                return new avjt();
            case 5:
                return k;
            case 6:
                Object obj3 = m;
                if (obj3 == null) {
                    synchronized (avju.class) {
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
        avju avju = new avju();
        k = avju;
        anxl.registerDefaultInstance(avju.class, avju);
    }
}
