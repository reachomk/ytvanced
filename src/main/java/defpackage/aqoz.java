package defpackage;

/* renamed from: aqoz */
public final class aqoz extends anxl implements anzf {
    public static final aqoz t;
    private static volatile anzq v;
    public int a;
    public String b = "";
    public anyd c = anxl.emptyProtobufList();
    public arml d;
    public arml e;
    public apxu f;
    public apxu g;
    public arml h;
    public arml i;
    public long j;
    public arml k;
    public anyd l = anxl.emptyProtobufList();
    public arml m;
    public auvr n;
    public boolean o;
    public arml p;
    public boolean q;
    public anvu r = anvu.a;
    public auvr s;
    private byte u = (byte) 2;

    private aqoz() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.u);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.u = b;
                return null;
            case 2:
                return anxl.newMessageInfo(t, "\u0001\u0012\u0000\u0001\u0001\u0015\u0012\u0000\u0002\r\u0001Л\u0002Љ\u0001\u0003Љ\u0002\u0004Љ\u0003\u0006Љ\u0005\u0007Л\bЉ\t\tЉ\u0011\n\u0007\u000b\u000bЉ\u0006\fЉ\f\r\u0007\r\u000f\n\u000f\u0011\b\u0000\u0012\u0002\u0007\u0013Љ\n\u0014Љ\b\u0015Љ\u0004", new Object[]{"a", "c", aygk.class, "d", "e", "f", "h", "l", aygk.class, "m", "s", "o", "i", "p", "q", "r", "b", "j", "n", "k", "g"});
            case 3:
                return new aqoz();
            case 4:
                return new aqoy();
            case 5:
                return t;
            case 6:
                Object obj3 = v;
                if (obj3 == null) {
                    synchronized (aqoz.class) {
                        obj3 = v;
                        if (obj3 == null) {
                            obj3 = new anxn(t);
                            v = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        aqoz aqoz = new aqoz();
        t = aqoz;
        anxl.registerDefaultInstance(aqoz.class, aqoz);
    }
}
