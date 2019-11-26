package defpackage;

/* renamed from: arpi */
public final class arpi extends anxl implements anzf {
    public static final arpi f;
    private static volatile anzq h;
    public int a;
    public arml b;
    public aphj c;
    public aphj d;
    public arpk e;
    private byte g = (byte) 2;

    private arpi() {
        anxl.emptyProtobufList();
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
                return anxl.newMessageInfo(f, "\u0001\u0004\u0000\u0001\u0004\t\u0004\u0000\u0000\u0004\u0004Љ\u0003\u0007Љ\u0005\bЉ\u0006\tЉ\u0007", new Object[]{"a", "b", "c", "d", "e"});
            case 3:
                return new arpi();
            case 4:
                return new arpl();
            case 5:
                return f;
            case 6:
                Object obj3 = h;
                if (obj3 == null) {
                    synchronized (arpi.class) {
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
        arpi arpi = new arpi();
        f = arpi;
        anxl.registerDefaultInstance(arpi.class, arpi);
    }
}
