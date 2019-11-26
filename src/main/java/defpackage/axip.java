package defpackage;

/* renamed from: axip */
public final class axip extends anxl implements anzf {
    public static final axip n;
    private static volatile anzq p;
    public int a;
    public String b = "";
    public anyd c = anxl.emptyProtobufList();
    public anyd d = anxl.emptyProtobufList();
    public arml e;
    public arml f;
    public axib g;
    public apxu h;
    public anvu i = anvu.a;
    public anvu j = anvu.a;
    public boolean k;
    public axiv l;
    public axin m;
    private byte o = (byte) 2;

    private axip() {
        anxl.emptyProtobufList();
        anxl.emptyProtobufList();
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.o);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.o = b;
                return null;
            case 2:
                return anxl.newMessageInfo(n, "\u0001\f\u0000\u0001\u0002\u0011\f\u0000\u0002\b\u0002\b\u0001\u0003Л\u0004Л\u0005Љ\u0002\u0006Љ\u0003\u0007Љ\u0005\b\n\u0006\t\n\u0007\u000bЉ\u0004\r\u0007\n\u0010Љ\f\u0011Љ\r", new Object[]{"a", "b", "c", axih.class, "d", axih.class, "e", "f", "h", "i", "j", "g", "k", "l", "m"});
            case 3:
                return new axip();
            case 4:
                return new axis();
            case 5:
                return n;
            case 6:
                Object obj3 = p;
                if (obj3 == null) {
                    synchronized (axip.class) {
                        obj3 = p;
                        if (obj3 == null) {
                            obj3 = new anxn(n);
                            p = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public static anzq a() {
        return n.getParserForType();
    }

    static {
        axip axip = new axip();
        n = axip;
        anxl.registerDefaultInstance(axip.class, axip);
    }
}
