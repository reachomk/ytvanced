package defpackage;

/* renamed from: aybq */
public final class aybq extends anxl implements anzf {
    public static final aybq h;
    private static volatile anzq j;
    public int a;
    public arml b;
    public aybk c;
    public arml d;
    public aybi e;
    public aybo f;
    public arml g;
    private byte i = (byte) 2;

    private aybq() {
        anxl.emptyProtobufList();
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.i);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.i = b;
                return null;
            case 2:
                return anxl.newMessageInfo(h, "\u0001\u0006\u0000\u0001\u0001\t\u0006\u0000\u0000\u0006\u0001Љ\u0000\u0002Љ\u0001\u0003Љ\u0002\u0004Љ\u0003\bЉ\u0006\tЉ\u0007", new Object[]{"a", "b", "c", "d", "e", "f", "g"});
            case 3:
                return new aybq();
            case 4:
                return new aybs();
            case 5:
                return h;
            case 6:
                Object obj3 = j;
                if (obj3 == null) {
                    synchronized (aybq.class) {
                        obj3 = j;
                        if (obj3 == null) {
                            obj3 = new anxn(h);
                            j = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        aybq aybq = new aybq();
        h = aybq;
        anxl.registerDefaultInstance(aybq.class, aybq);
    }
}
