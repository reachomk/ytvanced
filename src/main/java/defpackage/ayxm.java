package defpackage;

/* renamed from: ayxm */
public final class ayxm extends anxl implements anzf {
    public static final ayxm o;
    private static volatile anzq q;
    public int a;
    public anvu b = anvu.a;
    public aojg c;
    public int d;
    public aojx e;
    public apxu f;
    public arml g;
    public aojm h;
    public anyd i = anxl.emptyProtobufList();
    public ayxk j;
    public axak k;
    public String l = "";
    public anyd m = anxl.emptyProtobufList();
    public aojz n;
    private byte p = (byte) 2;

    private ayxm() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.p);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.p = b;
                return null;
            case 2:
                return anxl.newMessageInfo(o, "\u0001\r\u0000\u0001\u0001\u0011\r\u0000\u0002\u0007\u0001\n\u0000\u0002\t\u0001\u0003\u0004\u0002\u0004\t\u0003\bЉ\u0006\t\t\b\nЛ\fЉ\u0007\rЉ\n\u000e\b\f\u000fЛ\u0010Љ\r\u0011Љ\u000b", new Object[]{"a", "b", "c", "d", "e", "f", "h", "i", atwo.class, "g", "j", "l", "m", aols.class, "n", "k"});
            case 3:
                return new ayxm();
            case 4:
                return new ayxp();
            case 5:
                return o;
            case 6:
                Object obj3 = q;
                if (obj3 == null) {
                    synchronized (ayxm.class) {
                        obj3 = q;
                        if (obj3 == null) {
                            obj3 = new anxn(o);
                            q = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        ayxm ayxm = new ayxm();
        o = ayxm;
        anxl.registerDefaultInstance(ayxm.class, ayxm);
    }
}
