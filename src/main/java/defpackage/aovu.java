package defpackage;

/* renamed from: aovu */
public final class aovu extends anxl implements anzf {
    public static final aovu d;
    private static volatile anzq f;
    public int a;
    public apxu b;
    public arml c;
    private byte e = (byte) 2;

    private aovu() {
        anxl.emptyProtobufList();
        anxl.emptyProtobufList();
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.e);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.e = b;
                return null;
            case 2:
                return anxl.newMessageInfo(d, "\u0001\u0002\u0000\u0001\u0006\t\u0002\u0000\u0000\u0002\u0006Љ\u0005\tЉ\u0006", new Object[]{"a", "b", "c"});
            case 3:
                return new aovu();
            case 4:
                return new aovx();
            case 5:
                return d;
            case 6:
                Object obj3 = f;
                if (obj3 == null) {
                    synchronized (aovu.class) {
                        obj3 = f;
                        if (obj3 == null) {
                            obj3 = new anxn(d);
                            f = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        aovu aovu = new aovu();
        d = aovu;
        anxl.registerDefaultInstance(aovu.class, aovu);
    }
}
