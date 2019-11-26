package defpackage;

/* renamed from: aosv */
public final class aosv extends anxl implements anzf {
    public static final aosv d;
    private static volatile anzq e;
    public int a;
    public String b = "";
    public anyd c = anxl.emptyProtobufList();

    private aosv() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\b\u0000\u0002\u001a", new Object[]{"a", "b", "c"});
            case 3:
                return new aosv();
            case 4:
                return new aosy();
            case 5:
                return d;
            case 6:
                Object obj3 = e;
                if (obj3 == null) {
                    synchronized (aosv.class) {
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
        aosv aosv = new aosv();
        d = aosv;
        anxl.registerDefaultInstance(aosv.class, aosv);
    }
}
