package defpackage;

/* renamed from: aybu */
public final class aybu extends anxl implements anzf {
    public static final aybu j;
    private static volatile anzq l;
    public int a;
    public int b;
    public arml c;
    public anyd d = anxl.emptyProtobufList();
    public anyd e = anxl.emptyProtobufList();
    public anyd f = anxl.emptyProtobufList();
    public axak g;
    public aygk h;
    public axak i;
    private byte k = (byte) 2;

    private aybu() {
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
                return anxl.newMessageInfo(j, "\u0001\b\u0000\u0001\u0001\t\b\u0000\u0003\u0007\u0001\u000b\u0000\u0002Љ\u0001\u0003Л\u0004Л\u0005Л\u0006Љ\u0002\u0007Љ\u0003\tЉ\u0005", new Object[]{"a", "b", "c", "d", apxu.class, "e", apxu.class, "f", apxu.class, "g", "h", "i"});
            case 3:
                return new aybu();
            case 4:
                return new aybt();
            case 5:
                return j;
            case 6:
                Object obj3 = l;
                if (obj3 == null) {
                    synchronized (aybu.class) {
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
        aybu aybu = new aybu();
        j = aybu;
        anxl.registerDefaultInstance(aybu.class, aybu);
    }
}
