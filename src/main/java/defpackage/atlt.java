package defpackage;

/* renamed from: atlt */
public final class atlt extends anxl implements anzf {
    public static final atlt g;
    private static volatile anzq i;
    public int a;
    public asic b;
    public anyd c = anxl.emptyProtobufList();
    public azaj d;
    public boolean e;
    public int f;
    private byte h = (byte) 2;

    private atlt() {
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
                return anxl.newMessageInfo(g, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0001\u0003\u0001Љ\u0000\u0003Л\u0004Љ\u0001\u0005\u0007\u0002\u0006\u0004\u0003", new Object[]{"a", "b", "c", atlv.class, "d", "e", "f"});
            case 3:
                return new atlt();
            case 4:
                return new atlw();
            case 5:
                return g;
            case 6:
                Object obj3 = i;
                if (obj3 == null) {
                    synchronized (atlt.class) {
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
        atlt atlt = new atlt();
        g = atlt;
        anxl.registerDefaultInstance(atlt.class, atlt);
    }
}
