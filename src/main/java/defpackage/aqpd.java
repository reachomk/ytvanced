package defpackage;

/* renamed from: aqpd */
public final class aqpd extends anxl implements anzf {
    public static final aqpd m;
    private static volatile anzq o;
    public int a;
    public anyd b = anxl.emptyProtobufList();
    public anyd c = anxl.emptyProtobufList();
    public aqpj d;
    public int e;
    public anyd f = anxl.emptyProtobufList();
    public int g;
    public arml h;
    public aqpf i;
    public aphj j;
    public arml k;
    public arml l;
    private byte n = (byte) 2;

    private aqpd() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.n);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.n = b;
                return null;
            case 2:
                return anxl.newMessageInfo(m, "\u0001\u000b\u0000\u0001\u0001\u000e\u000b\u0000\u0003\t\u0001Љ\t\u0002Л\u0003Љ\n\u0005Љ\u0007\u0006Љ\b\u0007\u000b\u0002\bЉ\u0003\u000bЛ\fЛ\rЉ\u0000\u000e\u0004\u0001", new Object[]{"a", "k", "c", aqpb.class, "l", "i", "j", "g", "h", "b", aqov.class, "f", aqph.class, "d", "e"});
            case 3:
                return new aqpd();
            case 4:
                return new aqpc();
            case 5:
                return m;
            case 6:
                Object obj3 = o;
                if (obj3 == null) {
                    synchronized (aqpd.class) {
                        obj3 = o;
                        if (obj3 == null) {
                            obj3 = new anxn(m);
                            o = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        aqpd aqpd = new aqpd();
        m = aqpd;
        anxl.registerDefaultInstance(aqpd.class, aqpd);
    }
}
