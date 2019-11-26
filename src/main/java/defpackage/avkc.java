package defpackage;

/* renamed from: avkc */
public final class avkc extends anxl implements anzf {
    public static final avkc f;
    private static volatile anzq h;
    public int a;
    public String b = "";
    public anvu c = anvu.a;
    public arml d;
    public boolean e;
    private byte g = (byte) 2;

    private avkc() {
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
                return anxl.newMessageInfo(f, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0001\u0001\b\u0000\u0002\n\u0002\u0003Љ\u0003\u0005\u0007\u0005", new Object[]{"a", "b", "c", "d", "e"});
            case 3:
                return new avkc();
            case 4:
                return new avkb();
            case 5:
                return f;
            case 6:
                Object obj3 = h;
                if (obj3 == null) {
                    synchronized (avkc.class) {
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
        avkc avkc = new avkc();
        f = avkc;
        anxl.registerDefaultInstance(avkc.class, avkc);
    }
}
