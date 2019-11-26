package defpackage;

/* renamed from: arkl */
public final class arkl extends anxl implements anzf {
    public static final arkl f;
    private static volatile anzq g;
    public int a;
    public String b;
    public String c;
    public arkn d;
    public anyd e = anxl.emptyProtobufList();

    private arkl() {
        anxl.emptyProtobufList();
        anxl.emptyProtobufList();
        String str = "";
        this.b = str;
        this.c = str;
        anxl.emptyLongList();
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(f, "\u0001\u0003\u0000\u0001\u0004\b\u0003\u0000\u0001\u0000\u0004\b\u0001\u0007\t\u0004\b\u001b", new Object[]{"a", "c", "d", "e", arkp.class});
            case 3:
                return new arkl();
            case 4:
                return new arkk();
            case 5:
                return f;
            case 6:
                Object obj3 = g;
                if (obj3 == null) {
                    synchronized (arkl.class) {
                        obj3 = g;
                        if (obj3 == null) {
                            obj3 = new anxn(f);
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
        arkl arkl = new arkl();
        f = arkl;
        anxl.registerDefaultInstance(arkl.class, arkl);
    }
}
