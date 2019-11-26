package defpackage;

/* renamed from: aqfg */
public final class aqfg extends anxl implements anzf {
    private static volatile anzq B;
    public static final aqfg z;
    private byte A = (byte) 2;
    public int a;
    public aygk b;
    public arml c;
    public anyd d = anxl.emptyProtobufList();
    public arml e;
    public arml f;
    public anyd g = anxl.emptyProtobufList();
    public arml h;
    public anyd i = anxl.emptyProtobufList();
    public aphj j;
    public anyd k = anxl.emptyProtobufList();
    public arml l;
    public arml m;
    public arml n;
    public arml o;
    public arml p;
    public arml q;
    public arml r;
    public apxu s;
    public apdx t;
    public apdx u;
    public apdx v;
    public auvr w;
    public anvu x;
    public boolean y;

    private aqfg() {
        anxl.emptyProtobufList();
        anxl.emptyProtobufList();
        anxl.emptyProtobufList();
        anxl.emptyProtobufList();
        this.x = anvu.a;
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.A);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.A = b;
                return null;
            case 2:
                return anxl.newMessageInfo(z, "\u0001\u0018\u0000\u0001\u0002\"\u0018\u0000\u0004\u0016\u0002Љ\u0001\u0003Љ\u0003\u0004Љ\b\u0005Љ\t\u0007Љ\u000b\bЉ\f\tЉ\u000f\nЉ\u0010\u0010\n\u0018\u0012Љ\r\u0013Љ\u0014\u0014Љ\u0012\u0015Љ\u0011\u0016Љ\u0013\u0018Л\u0019Љ\u0004\u001aЉ\u0005\u001bЉ\u0006\u001cЛ\u001d\u0007\u0019\u001eЛ\u001fЛ Љ\u000e\"Љ\u0007", new Object[]{"a", "b", "c", "l", "m", "n", "o", "r", "s", "x", "p", "w", "u", "t", "v", "d", apdx.class, "e", "f", "h", "k", apdx.class, "y", "g", arml.class, "i", arml.class, "q", "j"});
            case 3:
                return new aqfg();
            case 4:
                return new aqff();
            case 5:
                return z;
            case 6:
                Object obj3 = B;
                if (obj3 == null) {
                    synchronized (aqfg.class) {
                        obj3 = B;
                        if (obj3 == null) {
                            obj3 = new anxn(z);
                            B = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public static anzq a() {
        return z.getParserForType();
    }

    static {
        aqfg aqfg = new aqfg();
        z = aqfg;
        anxl.registerDefaultInstance(aqfg.class, aqfg);
    }
}
