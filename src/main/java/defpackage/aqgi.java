package defpackage;

/* renamed from: aqgi */
public final class aqgi extends anxl implements anzf {
    public static final aqgi o;
    private static volatile anzq q;
    public int a;
    public aygk b;
    public arml c;
    public anyd d = anxl.emptyProtobufList();
    public apxu e;
    public apxu f;
    public auvr g;
    public arml h;
    public arml i;
    public arml j;
    public arml k;
    public atzt l;
    public anvu m;
    public arml n;
    private byte p = (byte) 2;

    private aqgi() {
        anxl.emptyProtobufList();
        this.m = anvu.a;
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
                return anxl.newMessageInfo(o, "\u0001\r\u0000\u0001\u0002\u0013\r\u0000\u0001\f\u0002Љ\u0001\u0003Љ\u0002\u0005Љ\u0004\u0007Љ\b\tЉ\u0005\nЉ\n\u000bЉ\u000b\f\n\u0010\u000eЉ\u0011\u000fЉ\t\u0010Љ\f\u0012Љ\u0006\u0013Л", new Object[]{"a", "b", "c", "e", "h", "f", "j", "k", "m", "n", "i", "l", "g", "d", ayfu.class});
            case 3:
                return new aqgi();
            case 4:
                return new aqgh();
            case 5:
                return o;
            case 6:
                Object obj3 = q;
                if (obj3 == null) {
                    synchronized (aqgi.class) {
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
        aqgi aqgi = new aqgi();
        o = aqgi;
        anxl.registerDefaultInstance(aqgi.class, aqgi);
    }
}
