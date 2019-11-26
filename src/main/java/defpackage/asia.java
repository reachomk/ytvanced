package defpackage;

/* renamed from: asia */
public final class asia extends anxl implements anzf {
    public static final asia g;
    private static volatile anzq i;
    public int a;
    public ango b;
    public aocn c;
    public boolean d;
    public ango e;
    public anyd f;
    private byte h = (byte) 2;

    private asia() {
        anxl.emptyProtobufList();
        this.f = anxl.emptyProtobufList();
        anxl.emptyIntList();
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.h);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.h = b;
                return null;
            case 2:
                return anxl.newMessageInfo(g, "\u0001\u0005\u0000\u0001\u0005\u001a\u0005\u0000\u0001\u0003\u0005Љ\u0000\u000bЉ\b\u000e\u0007\r\u0011Љ\u000f\u001a\u001b", new Object[]{"a", "b", "c", "d", "e", "f", aqjg.class});
            case 3:
                return new asia();
            case 4:
                return new asid();
            case 5:
                return g;
            case 6:
                Object obj3 = i;
                if (obj3 == null) {
                    synchronized (asia.class) {
                        obj3 = i;
                        if (obj3 == null) {
                            obj3 = new anxn(g);
                            i = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        asia asia = new asia();
        g = asia;
        anxl.registerDefaultInstance(asia.class, asia);
    }
}
