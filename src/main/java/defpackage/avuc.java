package defpackage;

/* renamed from: avuc */
public final class avuc extends anxl implements anzf {
    public static final avuc f;
    private static volatile anzq h;
    public int a;
    public avue b;
    public avui c;
    public avug d;
    public avum e;
    private byte g = (byte) 2;

    private avuc() {
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
                return anxl.newMessageInfo(f, "\u0001\u0004\u0000\u0001│㓷\u0004\u0000\u0000\u0004│Љ\u0001┌Љ\u0000┢Љ\u0003㓷Љ\u0002", new Object[]{"a", "c", "b", "e", "d"});
            case 3:
                return new avuc();
            case 4:
                return new avub();
            case 5:
                return f;
            case 6:
                Object obj3 = h;
                if (obj3 == null) {
                    synchronized (avuc.class) {
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
        avuc avuc = new avuc();
        f = avuc;
        anxl.registerDefaultInstance(avuc.class, avuc);
    }
}
