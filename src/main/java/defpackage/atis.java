package defpackage;

/* renamed from: atis */
public final class atis extends anxl implements anzf {
    public static final atis h;
    private static volatile anzq j;
    public int a;
    public asic b;
    public atim c;
    public anyd d = anxl.emptyProtobufList();
    public axak e;
    public anyd f;
    public anvu g;
    private byte i = (byte) 2;

    private atis() {
        anxl.emptyProtobufList();
        this.f = anxl.emptyProtobufList();
        this.g = anvu.a;
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.i);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.i = b;
                return null;
            case 2:
                return anxl.newMessageInfo(h, "\u0001\u0006\u0000\u0001\u0001\n\u0006\u0000\u0002\u0005\u0001Љ\u0000\u0003Љ\u0001\u0004Л\u0007\n\u0005\tЛ\nЉ\u0002", new Object[]{"a", "b", "c", "d", atio.class, "g", "f", apxu.class, "e"});
            case 3:
                return new atis();
            case 4:
                return new atir();
            case 5:
                return h;
            case 6:
                Object obj3 = j;
                if (obj3 == null) {
                    synchronized (atis.class) {
                        obj3 = j;
                        if (obj3 == null) {
                            obj3 = new anxn(h);
                            j = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        atis atis = new atis();
        h = atis;
        anxl.registerDefaultInstance(atis.class, atis);
    }
}
