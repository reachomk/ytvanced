package defpackage;

/* renamed from: avhw */
public final class avhw extends anxl implements anzf {
    public static final avhw j;
    private static volatile anzq l;
    public int a;
    public arml b;
    public arml c;
    public arml d;
    public apxu e;
    public arml f;
    public apxu g;
    public avhu h;
    public axak i;
    private byte k = (byte) 2;

    private avhw() {
        anxl.emptyProtobufList();
        anxl.emptyProtobufList();
        anxl.emptyProtobufList();
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
                return anxl.newMessageInfo(j, "\u0001\b\u0000\u0001\u0001\u0016\b\u0000\u0000\b\u0001Љ\u0000\u0007Љ\u0003\bЉ\u0004\tЉ\u0005\nЉ\u0006\u000bЉ\b\u0011Љ\u0001\u0016Љ\u000f", new Object[]{"a", "b", "d", "e", "f", "g", "h", "c", "i"});
            case 3:
                return new avhw();
            case 4:
                return new avhv();
            case 5:
                return j;
            case 6:
                Object obj3 = l;
                if (obj3 == null) {
                    synchronized (avhw.class) {
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
        avhw avhw = new avhw();
        j = avhw;
        anxl.registerDefaultInstance(avhw.class, avhw);
    }
}
