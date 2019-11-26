package defpackage;

/* renamed from: axkp */
public final class axkp extends anxl implements anzf {
    public static final axkp p;
    private static volatile anzq r;
    public int a;
    public arml b;
    public arml c;
    public auvr d;
    public axak e;
    public anyd f = anxl.emptyProtobufList();
    public anvu g = anvu.a;
    public apxu h;
    public arml i;
    public apxu j;
    public boolean k;
    public anyd l = anxl.emptyProtobufList();
    public apxu m;
    public axak n;
    public int o;
    private byte q = (byte) 2;

    private axkp() {
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
                return anxl.newMessageInfo(p, "\u0001\u000e\u0000\u0001\u0001\u0016\u000e\u0000\u0002\u000b\u0001Љ\u0000\u0002Љ\u0001\u0005Љ\u0002\u0007Л\n\n\u0005\u000bЉ\u0006\rЉ\b\u000eЉ\t\u0010\u0007\u000b\u0011Л\u0012Љ\r\u0013\f\u000e\u0015Љ\u0003\u0016Љ\f", new Object[]{"a", "b", "c", "d", "f", axkr.class, "g", "h", "i", "j", "k", "l", apxu.class, "n", "o", aqhd.a, "e", "m"});
            case 3:
                return new axkp();
            case 4:
                return new axks();
            case 5:
                return p;
            case 6:
                Object obj3 = r;
                if (obj3 == null) {
                    synchronized (axkp.class) {
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
        axkp axkp = new axkp();
        p = axkp;
        anxl.registerDefaultInstance(axkp.class, axkp);
    }
}
