package defpackage;

/* renamed from: apgu */
public final class apgu extends anxl implements anzf {
    public static final apgu l;
    private static volatile anzq n;
    public int a;
    public arml b;
    public arml c;
    public anyd d = anxl.emptyProtobufList();
    public anyd e = anxl.emptyProtobufList();
    public apxu f;
    public axak g;
    public String h = "";
    public int i;
    public aygk j;
    public anvu k = anvu.a;
    private byte m = (byte) 2;

    private apgu() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.m);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.m = b;
                return null;
            case 2:
                return anxl.newMessageInfo(l, "\u0001\n\u0000\u0001\u0001\u000b\n\u0000\u0002\u0007\u0001Љ\u0000\u0002Љ\u0001\u0003Л\u0004Л\u0005Љ\u0002\u0006Љ\u0003\u0007\b\u0004\t\n\u0007\n\f\u0005\u000bЉ\u0006", new Object[]{"a", "b", "c", "d", arml.class, "e", aygk.class, "f", "g", "h", "k", "i", apgw.a(), "j"});
            case 3:
                return new apgu();
            case 4:
                return new apgx();
            case 5:
                return l;
            case 6:
                Object obj3 = n;
                if (obj3 == null) {
                    synchronized (apgu.class) {
                        obj3 = n;
                        if (obj3 == null) {
                            obj3 = new anxn(l);
                            n = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public static anzq a() {
        return l.getParserForType();
    }

    static {
        apgu apgu = new apgu();
        l = apgu;
        anxl.registerDefaultInstance(apgu.class, apgu);
    }
}
