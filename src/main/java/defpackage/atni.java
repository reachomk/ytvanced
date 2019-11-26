package defpackage;

/* renamed from: atni */
public final class atni extends anxl implements anzf {
    public static final atni d;
    private static volatile anzq e;
    public int a;
    public atng b;
    public String c = "";

    private atni() {
        anxl.emptyProtobufList();
        anxl.emptyProtobufList();
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(d, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001\t\u0000\u0003\b\u0001", new Object[]{"a", "b", "c"});
            case 3:
                return new atni();
            case 4:
                return new atnh();
            case 5:
                return d;
            case 6:
                Object obj3 = e;
                if (obj3 == null) {
                    synchronized (atni.class) {
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
        atni atni = new atni();
        d = atni;
        anxl.registerDefaultInstance(atni.class, atni);
    }
}
