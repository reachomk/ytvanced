package defpackage;

/* renamed from: aqfs */
public final class aqfs extends anxp implements anzf {
    public static final aqfs v;
    private static volatile anzq x;
    public int a;
    public String b = "";
    public awkv c;
    public anyd d = anxl.emptyProtobufList();
    public aygk e;
    public arml f;
    public arml g;
    public arml i;
    public arml j;
    public arml k;
    public apxu l;
    public arml m;
    public anvu n;
    public atzt o;
    public arml p;
    public auvr q;
    public arqc r;
    public aqfu s;
    public arer t;
    public awhh u;
    private byte w = (byte) 2;

    private aqfs() {
        anxl.emptyProtobufList();
        anxl.emptyProtobufList();
        anxl.emptyProtobufList();
        anxl.emptyProtobufList();
        this.n = anvu.a;
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.w);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.w = b;
                return null;
            case 2:
                return anxl.newMessageInfo(v, "\u0001\u0013\u0000\u0001\u0001\u001b\u0013\u0000\u0001\u0010\u0001\b\u0000\u0002Љ\u0002\u0003Љ\u0003\u0004Љ\u0004\u0005Љ\u0006\u0006Љ\b\bЉ\t\tЉ\u0007\u000bЉ\u000f\f\n\u000e\u000fЉ\u0010\u0011Љ\u0013\u0012Љ\u0011\u0014Љ\u0001\u0015Љ\u0005\u0017Љ\u0012\u0018Љ\u0014\u0019Л\u001b\t\u0015", new Object[]{"a", "b", "e", "f", "g", "j", "l", "m", "k", "o", "n", "p", "s", "q", "c", "i", "r", "t", "d", ayfu.class, "u"});
            case 3:
                return new aqfs();
            case 4:
                return new aqfr();
            case 5:
                return v;
            case 6:
                Object obj3 = x;
                if (obj3 == null) {
                    synchronized (aqfs.class) {
                        obj3 = x;
                        if (obj3 == null) {
                            obj3 = new anxn(v);
                            x = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public static anzq b() {
        return v.getParserForType();
    }

    static {
        aqfs aqfs = new aqfs();
        v = aqfs;
        anxl.registerDefaultInstance(aqfs.class, aqfs);
    }
}
