package defpackage;

/* renamed from: awda */
public final class awda extends anxl implements anzf {
    public static final awda f;
    private static volatile anzq h;
    public int a;
    public String b;
    public arml c;
    public String d;
    public String e;
    private byte g = (byte) 2;

    private awda() {
        String str = "";
        this.b = str;
        this.d = str;
        this.e = str;
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.g);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.g = b;
                return null;
            case 2:
                return anxl.newMessageInfo(f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0001\u0001\b\u0003\u0002Љ\u0004\u0003\b\u0005\u0004\b\u0006", new Object[]{"a", "b", "c", "d", "e"});
            case 3:
                return new awda();
            case 4:
                return new awcz();
            case 5:
                return f;
            case 6:
                Object obj3 = h;
                if (obj3 == null) {
                    synchronized (awda.class) {
                        obj3 = h;
                        if (obj3 == null) {
                            obj3 = new anxn(f);
                            h = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        awda awda = new awda();
        f = awda;
        anxl.registerDefaultInstance(awda.class, awda);
    }
}
