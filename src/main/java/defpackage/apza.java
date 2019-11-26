package defpackage;

/* renamed from: apza */
public final class apza extends anxl implements anzf {
    public static final apza j;
    private static volatile anzq l;
    public int a;
    public arml b;
    public arml c;
    public aygk d;
    public aphj e;
    public aphj f;
    public arml g;
    public aphj h;
    public axak i;
    private byte k = (byte) 2;

    private apza() {
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
                return anxl.newMessageInfo(j, "\u0001\b\u0000\u0001\u0001\t\b\u0000\u0000\b\u0001Љ\u0000\u0002Љ\u0002\u0003Љ\u0003\u0004Љ\u0004\u0005Љ\u0001\u0006Љ\u0005\u0007Љ\u0006\tЉ\u0007", new Object[]{"a", "b", "d", "e", "f", "c", "g", "h", "i"});
            case 3:
                return new apza();
            case 4:
                return new apzd();
            case 5:
                return j;
            case 6:
                Object obj3 = l;
                if (obj3 == null) {
                    synchronized (apza.class) {
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
        apza apza = new apza();
        j = apza;
        anxl.registerDefaultInstance(apza.class, apza);
    }
}
