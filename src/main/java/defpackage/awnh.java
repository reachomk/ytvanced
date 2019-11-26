package defpackage;

/* renamed from: awnh */
public final class awnh extends anxl implements anzf {
    public static final awnh d;
    private static volatile anzq e;
    public int a;
    public String b = "";
    public anvu c = anvu.a;

    private awnh() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\b\u0000\u0002\n\u0001", new Object[]{"a", "b", "c"});
            case 3:
                return new awnh();
            case 4:
                return new awnk();
            case 5:
                return d;
            case 6:
                Object obj3 = e;
                if (obj3 == null) {
                    synchronized (awnh.class) {
                        obj3 = e;
                        if (obj3 == null) {
                            obj3 = new anxn(d);
                            e = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        awnh awnh = new awnh();
        d = awnh;
        anxl.registerDefaultInstance(awnh.class, awnh);
    }
}
