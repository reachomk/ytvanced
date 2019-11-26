package defpackage;

/* renamed from: axgk */
public final class axgk extends anxl implements anzf {
    public static final axgk p;
    private static volatile anzq r;
    public int a;
    public int b;
    public arml c;
    public arml d;
    public boolean e;
    public boolean f;
    public apxu g;
    public apxu h;
    public arml i;
    public arml j;
    public axgo k;
    public axgo l;
    public axak m;
    public anyd n = anxl.emptyProtobufList();
    public anvu o = anvu.a;
    private byte q = (byte) 2;

    private axgk() {
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
                return anxl.newMessageInfo(p, "\u0001\u000e\u0000\u0001\u0002\u0012\u000e\u0000\u0001\t\u0002Љ\u0003\u0003Љ\u0004\u0004\u0007\u0005\u0005Љ\u0007\u0006Љ\b\u0007Љ\t\b\u001b\t\u0007\u0006\nЉ\n\u000bЉ\f\r\n\u000f\u000eЉ\u000b\u000f\f\u0000\u0012Љ\r", new Object[]{"a", "c", "d", "e", "g", "h", "i", "n", axhe.class, "f", "j", "l", "o", "k", "b", axhl.a, "m"});
            case 3:
                return new axgk();
            case 4:
                return new axgn();
            case 5:
                return p;
            case 6:
                Object obj3 = r;
                if (obj3 == null) {
                    synchronized (axgk.class) {
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

    public static anzq a() {
        return p.getParserForType();
    }

    static {
        axgk axgk = new axgk();
        p = axgk;
        anxl.registerDefaultInstance(axgk.class, axgk);
    }
}
