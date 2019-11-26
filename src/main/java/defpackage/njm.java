package defpackage;

/* renamed from: njm */
public final class njm extends anxl implements anzf {
    public static final njm r;
    private static volatile anzq s;
    public int a;
    public int b = 8;
    public String c;
    public String d;
    public String e;
    public long f;
    public long g;
    public nju h;
    public long i;
    public String j;
    public int k;
    public anyd l;
    public njo m;
    public boolean n;
    public njw o;
    public long p;
    public njk q;

    private njm() {
        String str = "";
        this.c = str;
        this.d = str;
        this.e = str;
        this.j = str;
        this.l = anxl.emptyProtobufList();
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(r, "\u0001\u0010\u0000\u0001\u0001\u0013\u0010\u0000\u0001\u0000\u0001\f\u0000\u0002\b\u0001\u0003\b\u0002\u0004\t\u0006\u0005\u0003\u0004\u0006\u0002\u0005\u0007\u0002\u0007\t\b\b\n\f\t\u000b\u001a\f\t\n\r\u0007\u000b\u000e\t\f\u000f\b\u0003\u0012\u0002\u000f\u0013\t\u0010", new Object[]{"a", "b", njr.a, "c", "d", "h", "f", "g", "i", "j", "k", njp.a, "l", "m", "n", "o", "e", "p", "q"});
            case 3:
                return new njm();
            case 4:
                return new njl();
            case 5:
                return r;
            case 6:
                Object obj3 = s;
                if (obj3 == null) {
                    synchronized (njm.class) {
                        obj3 = s;
                        if (obj3 == null) {
                            obj3 = new anxn(r);
                            s = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        njm njm = new njm();
        r = njm;
        anxl.registerDefaultInstance(njm.class, njm);
    }
}
