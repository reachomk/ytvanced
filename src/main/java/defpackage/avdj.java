package defpackage;

/* renamed from: avdj */
public final class avdj extends anxl implements anzf {
    public static final avdj r;
    private static volatile anzq t;
    public int a;
    public anyd b = anxl.emptyProtobufList();
    public apxu c;
    public anyd d = anxl.emptyProtobufList();
    public apxu e;
    public apxu f;
    public arml g;
    public boolean h;
    public axak i;
    public axak j;
    public int k;
    public int l;
    public auvr m;
    public axak n;
    public int o;
    public aqlj p;
    public anvu q = anvu.a;
    private byte s = (byte) 2;

    private avdj() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.s);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.s = b;
                return null;
            case 2:
                return anxl.newMessageInfo(r, "\u0001\u0010\u0000\u0001\u0001\u0011\u0010\u0000\u0002\n\u0001Л\u0002Љ\u0000\u0003Л\u0004Љ\u0003\u0005\u0007\u0004\u0006Љ\n\b\n\u000e\tЉ\u0005\n\u000b\u0007\u000b\u000b\b\fЉ\t\r\f\u000b\u000e\t\f\u000fЉ\u0001\u0010Љ\u0006\u0011Љ\u0002", new Object[]{"a", "b", avdh.class, "c", "d", apxu.class, "g", "h", "n", "q", "i", "k", "l", "m", "o", aqhd.a, "p", "e", "j", "f"});
            case 3:
                return new avdj();
            case 4:
                return new avdi();
            case 5:
                return r;
            case 6:
                Object obj3 = t;
                if (obj3 == null) {
                    synchronized (avdj.class) {
                        obj3 = t;
                        if (obj3 == null) {
                            obj3 = new anxn(r);
                            t = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        avdj avdj = new avdj();
        r = avdj;
        anxl.registerDefaultInstance(avdj.class, avdj);
    }
}
