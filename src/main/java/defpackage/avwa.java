package defpackage;

/* renamed from: avwa */
public final class avwa extends anxl implements anzf {
    public static final avwa d;
    private static volatile anzq f;
    public int a;
    public aqhy b;
    public auuc c;
    private byte e = (byte) 2;

    private avwa() {
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
                return anxl.newMessageInfo(d, "\u0001\u0002\u0000\u0001Ẑ⸵\u0002\u0000\u0000\u0002ẐЉ\u0000⸵Љ\u0001", new Object[]{"a", "b", "c"});
            case 3:
                return new avwa();
            case 4:
                return new avvz();
            case 5:
                return d;
            case 6:
                Object obj3 = f;
                if (obj3 == null) {
                    synchronized (avwa.class) {
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
        avwa avwa = new avwa();
        d = avwa;
        anxl.registerDefaultInstance(avwa.class, avwa);
    }
}
