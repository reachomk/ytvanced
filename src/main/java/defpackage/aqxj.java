package defpackage;

/* renamed from: aqxj */
public final class aqxj extends anxl implements anzf {
    public static final aqxj D;
    private static volatile anzq F;
    public arml A;
    public String B = "";
    public anvu C = anvu.a;
    private byte E = (byte) 2;
    public int a;
    public arml b;
    public arml c;
    public arml d;
    public aygk e;
    public arml f;
    public aphj g;
    public float h;
    public arml i;
    public arml j;
    public arml k;
    public arml l;
    public aphj m;
    public arml n;
    public arml o;
    public arml p;
    public arml q;
    public anyd r = anxl.emptyProtobufList();
    public arml s;
    public arml t;
    public anyd u = anxl.emptyProtobufList();
    public arml v;
    public arml w;
    public long x;
    public long y;
    public arml z;

    private aqxj() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.E);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.E = b;
                return null;
            case 2:
                return anxl.newMessageInfo(D, "\u0001\u001c\u0000\u0001\u0001#\u001c\u0000\u0002\u0017\u0001Љ\u0004\u0002Љ\u0005\u0003Љ\u0006\u0004Љ\b\u0005\u0001\t\u0006Љ\n\u0007Љ\u000b\bЉ\u000e\n\n\u001d\fЉ\u0012\rЉ\u0007\u000eЉ\u000f\u000fЉ\u0010\u0010Љ\u0011\u0013Љ\u0013\u0014Љ\u0014\u0015Л\u0016Л\u0017Љ\u0015\u0018Љ\u0016\u0019\u0002\u0017\u001a\u0002\u0018\u001bЉ\u0019\u001cЉ\u001a\u001dЉ\f\u001fЉ\u0001\"Љ\r#\b\u001b", new Object[]{"a", "c", "d", "e", "g", "h", "i", "j", "m", "C", "q", "f", "n", "o", "p", "s", "t", "u", aqxl.class, "r", aqxg.class, "v", "w", "x", "y", "z", "A", "k", "b", "l", "B"});
            case 3:
                return new aqxj();
            case 4:
                return new aqxm();
            case 5:
                return D;
            case 6:
                Object obj3 = F;
                if (obj3 == null) {
                    synchronized (aqxj.class) {
                        obj3 = F;
                        if (obj3 == null) {
                            obj3 = new anxn(D);
                            F = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public static anzq a() {
        return D.getParserForType();
    }

    static {
        aqxj aqxj = new aqxj();
        D = aqxj;
        anxl.registerDefaultInstance(aqxj.class, aqxj);
    }
}
