package defpackage;

/* renamed from: aqhy */
public final class aqhy extends anxl implements anzf {
    public static final aqhy q;
    private static volatile anzq s;
    public int a;
    public arml b;
    public aygk c;
    public arwf d;
    public anyd e = anxl.emptyProtobufList();
    public aphj f;
    public aphj g;
    public anyd h = anxl.emptyProtobufList();
    public anyd i = anxl.emptyProtobufList();
    public anvu j;
    public arml k;
    public arml l;
    public apxu m;
    public apxu n;
    public apxu o;
    public arml p;
    private byte r = (byte) 2;

    private aqhy() {
        anxl.emptyProtobufList();
        this.j = anvu.a;
        anxl.emptyProtobufList();
        anxl.emptyProtobufList();
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.r);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.r = b;
                return null;
            case 2:
                return anxl.newMessageInfo(q, "\u0001\u000f\u0000\u0001\u0001\u0019\u000f\u0000\u0003\r\u0001Љ\u0000\u0002Љ\u0013\u0003Љ\u000e\u0004Љ\u000f\u0005Љ\u0010\u0007\n\f\bЛ\tЉ\u0011\nЉ\u0012\fЉ\u0005\rЉ\u0006\u000eЉ\u0001\u0010\t\u0003\u0018Л\u0019Л", new Object[]{"a", "b", "p", "k", "l", "m", "j", "e", arml.class, "n", "o", "f", "g", "c", "d", "h", apxu.class, "i", apxu.class});
            case 3:
                return new aqhy();
            case 4:
                return new aqhx();
            case 5:
                return q;
            case 6:
                Object obj3 = s;
                if (obj3 == null) {
                    synchronized (aqhy.class) {
                        obj3 = s;
                        if (obj3 == null) {
                            obj3 = new anxn(q);
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
        aqhy aqhy = new aqhy();
        q = aqhy;
        anxl.registerDefaultInstance(aqhy.class, aqhy);
    }
}
