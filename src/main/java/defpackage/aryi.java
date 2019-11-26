package defpackage;

/* renamed from: aryi */
public final class aryi extends anxl implements anzf {
    public static final aryi o;
    private static volatile anzq q;
    public int a;
    public aygk b;
    public anyd c = anxl.emptyProtobufList();
    public axak d;
    public arml e;
    public aryg f;
    public anvu g = anvu.a;
    public apxu h;
    public apxu i;
    public String j = "";
    public apxu k;
    public aumg l;
    public ayym m;
    public axak n;
    private byte p = (byte) 2;

    private aryi() {
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
                return anxl.newMessageInfo(o, "\u0001\r\u0000\u0001\u0001\u0011\r\u0000\u0001\t\u0001Љ\u0000\u0002Љ\u0002\u0003Љ\u0003\u0005\n\u0005\u0006Љ\u0006\u0007\b\b\bЉ\u0007\tЉ\t\fЛ\r\t\f\u000fЉ\u0001\u0010\t\u000e\u0011Љ\u000f", new Object[]{"a", "b", "e", "f", "g", "h", "j", "i", "k", "c", ayfu.class, "l", "d", "m", "n"});
            case 3:
                return new aryi();
            case 4:
                return new aryh();
            case 5:
                return o;
            case 6:
                Object obj3 = q;
                if (obj3 == null) {
                    synchronized (aryi.class) {
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
        aryi aryi = new aryi();
        o = aryi;
        anxl.registerDefaultInstance(aryi.class, aryi);
    }
}
