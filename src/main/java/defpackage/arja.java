package defpackage;

/* renamed from: arja */
public final class arja extends anxp implements anzf {
    public static final arja j;
    private static volatile anzq l;
    public int a;
    public apxu b;
    public arml c;
    public arml d;
    public arml e;
    public arjc f;
    public auvr g;
    public ariy i;
    private byte k = (byte) 2;

    private arja() {
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
                return anxl.newMessageInfo(j, "\u0001\u0007\u0000\u0001\u0002\r\u0007\u0000\u0000\u0007\u0002Љ\u0002\u0003Љ\u0003\u0004Љ\u0004\u0005Љ\u0005\bЉ\t\nЉ\u0007\rЉ\b", new Object[]{"a", "b", "c", "d", "e", "i", "f", "g"});
            case 3:
                return new arja();
            case 4:
                return new arjd();
            case 5:
                return j;
            case 6:
                Object obj3 = l;
                if (obj3 == null) {
                    synchronized (arja.class) {
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
        arja arja = new arja();
        j = arja;
        anxl.registerDefaultInstance(arja.class, arja);
    }
}
