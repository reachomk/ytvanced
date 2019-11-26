package defpackage;

/* renamed from: awfe */
public final class awfe extends anxl implements anzf {
    public static final awfe p;
    private static volatile anzq r;
    public int a;
    public arml b;
    public arml c;
    public arml d;
    public arml e;
    public awey f;
    public arml g;
    public awfa h;
    public apxu i;
    public awfk j;
    public aygk k;
    public anyd l = anxl.emptyProtobufList();
    public awey m;
    public int n;
    public anvu o = anvu.a;
    private byte q = (byte) 2;

    private awfe() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.q);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.q = b;
                return null;
            case 2:
                return anxl.newMessageInfo(p, "\u0001\u000e\u0000\u0001\u0001\u0010\u000e\u0000\u0001\f\u0001Љ\u0000\u0002Љ\u0001\u0003Љ\u0002\u0004Љ\u0003\u0005Љ\u0005\u0006Љ\u0007\u0007Љ\t\b\u0004\u000b\tЉ\u0004\nЉ\b\f\n\r\rЉ\n\u000fЉ\u0006\u0010Л", new Object[]{"a", "b", "c", "d", "e", "g", "i", "k", "n", "f", "j", "o", "m", "h", "l", ayfu.class});
            case 3:
                return new awfe();
            case 4:
                return new awfh();
            case 5:
                return p;
            case 6:
                Object obj3 = r;
                if (obj3 == null) {
                    synchronized (awfe.class) {
                        obj3 = r;
                        if (obj3 == null) {
                            obj3 = new anxn(p);
                            r = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        awfe awfe = new awfe();
        p = awfe;
        anxl.registerDefaultInstance(awfe.class, awfe);
    }
}
