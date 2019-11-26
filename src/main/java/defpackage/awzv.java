package defpackage;

/* renamed from: awzv */
public final class awzv extends anxl implements anzf {
    public static final awzv d;
    public static final anxr e;
    private static volatile anzq g;
    public int a;
    public String b = "";
    public anvu c = anvu.a;
    private byte f = (byte) 2;

    private awzv() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.f);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.f = b;
                return null;
            case 2:
                return anxl.newMessageInfo(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\b\u0000\u0002\n\u0004", new Object[]{"a", "b", "c"});
            case 3:
                return new awzv();
            case 4:
                return new awzu();
            case 5:
                return d;
            case 6:
                Object obj3 = g;
                if (obj3 == null) {
                    synchronized (awzv.class) {
                        obj3 = g;
                        if (obj3 == null) {
                            obj3 = new anxn(d);
                            g = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        awzv awzv = new awzv();
        d = awzv;
        anxl.registerDefaultInstance(awzv.class, awzv);
        aqll aqll = aqll.a;
        awzv awzv2 = d;
        e = anxl.newSingularGeneratedExtension(aqll, awzv2, awzv2, null, 60487319, aobm.MESSAGE, awzv.class);
    }
}
