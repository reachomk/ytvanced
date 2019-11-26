package defpackage;

/* renamed from: aqfw */
public final class aqfw extends anxl implements anzf {
    public static final aqfw o;
    private static volatile anzq q;
    public int a;
    public aygk b;
    public anyd c = anxl.emptyProtobufList();
    public arml d;
    public arml e;
    public anyd f = anxl.emptyProtobufList();
    public arml g;
    public anyd h;
    public arml i;
    public anyd j;
    public anyd k;
    public apxu l;
    public auvr m;
    public anvu n;
    private byte p = (byte) 2;

    private aqfw() {
        anxl.emptyProtobufList();
        this.h = anxl.emptyProtobufList();
        this.j = anxl.emptyProtobufList();
        this.k = anxl.emptyProtobufList();
        this.n = anvu.a;
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
                return anxl.newMessageInfo(o, "\u0001\r\u0000\u0001\u0001\u000f\r\u0000\u0005\f\u0001Љ\u0000\u0002Л\u0003Љ\u0002\u0004Л\u0005Љ\u0003\u0006Л\u0007Љ\u0004\bЛ\tЛ\nЉ\u0005\u000bЉ\u0006\r\n\b\u000fЉ\u0001", new Object[]{"a", "b", "c", ayfu.class, "e", "f", apdx.class, "g", "h", arml.class, "i", "j", arml.class, "k", apdx.class, "l", "m", "n", "d"});
            case 3:
                return new aqfw();
            case 4:
                return new aqfv();
            case 5:
                return o;
            case 6:
                Object obj3 = q;
                if (obj3 == null) {
                    synchronized (aqfw.class) {
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

    public static anzq a() {
        return o.getParserForType();
    }

    static {
        aqfw aqfw = new aqfw();
        o = aqfw;
        anxl.registerDefaultInstance(aqfw.class, aqfw);
    }
}
