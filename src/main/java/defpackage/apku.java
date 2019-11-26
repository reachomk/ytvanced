package defpackage;

/* renamed from: apku */
public final class apku extends anxl implements anzf {
    public static final apku f;
    private static volatile anzq h;
    public int a;
    public arml b;
    public arml c;
    public aphj d;
    public arml e;
    private byte g = (byte) 2;

    private apku() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.g);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.g = b;
                return null;
            case 2:
                return anxl.newMessageInfo(f, "\u0001\u0004\u0000\u0001\u0004\u0007\u0004\u0000\u0000\u0004\u0004Љ\u0003\u0005Љ\u0004\u0006Љ\u0005\u0007Љ\u0006", new Object[]{"a", "b", "c", "d", "e"});
            case 3:
                return new apku();
            case 4:
                return new apkt();
            case 5:
                return f;
            case 6:
                Object obj3 = h;
                if (obj3 == null) {
                    synchronized (apku.class) {
                        obj3 = h;
                        if (obj3 == null) {
                            obj3 = new anxn(f);
                            h = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        apku apku = new apku();
        f = apku;
        anxl.registerDefaultInstance(apku.class, apku);
    }
}
