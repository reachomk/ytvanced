package defpackage;

/* renamed from: awld */
public final class awld extends anxl implements anzf {
    public static final awld h;
    private static volatile anzq i;
    public int a;
    public String b;
    public String c;
    public String d;
    public String e;
    public boolean f;
    public anyd g = anxl.emptyProtobufList();

    private awld() {
        String str = "";
        this.b = str;
        this.c = str;
        this.d = str;
        this.e = str;
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001\b\u0000\u0002\b\u0001\u0003\b\u0002\u0004\b\u0003\u0005\u0007\u0004\u0006\u001c", new Object[]{"a", "b", "c", "d", "e", "f", "g"});
            case 3:
                return new awld();
            case 4:
                return new awlc();
            case 5:
                return h;
            case 6:
                Object obj3 = i;
                if (obj3 == null) {
                    synchronized (awld.class) {
                        obj3 = i;
                        if (obj3 == null) {
                            obj3 = new anxn(h);
                            i = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        awld awld = new awld();
        h = awld;
        anxl.registerDefaultInstance(awld.class, awld);
    }
}
