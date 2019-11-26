package defpackage;

/* renamed from: atft */
public final class atft extends anxl implements anzf {
    public static final atft f;
    private static volatile anzq h;
    public int a;
    public asic b;
    public arml c;
    public anyd d = anxl.emptyProtobufList();
    public anyd e = anxl.emptyProtobufList();
    private byte g = (byte) 2;

    private atft() {
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
                return anxl.newMessageInfo(f, "\u0001\u0004\u0000\u0001\u0001\u0006\u0004\u0000\u0002\u0004\u0001Љ\u0000\u0002Љ\u0001\u0003Л\u0006Л", new Object[]{"a", "b", "c", "d", awzt.class, "e", ymr.class});
            case 3:
                return new atft();
            case 4:
                return new atfw();
            case 5:
                return f;
            case 6:
                Object obj3 = h;
                if (obj3 == null) {
                    synchronized (atft.class) {
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
        atft atft = new atft();
        f = atft;
        anxl.registerDefaultInstance(atft.class, atft);
    }
}
