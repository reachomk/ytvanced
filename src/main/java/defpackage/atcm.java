package defpackage;

/* renamed from: atcm */
public final class atcm extends anxl implements anzf {
    public static final atcm h;
    private static volatile anzq i;
    public int a;
    public String b = "";
    public int c;
    public int d;
    public anyd e = anxl.emptyProtobufList();
    public int f;
    public int g;

    private atcm() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001\b\u0000\u0002\u000b\u0001\u0003\u000b\u0002\u0004\u001b\u0005\u000b\u0003\u0006\u000b\u0004", new Object[]{"a", "b", "c", "d", "e", atcs.class, "f", "g"});
            case 3:
                return new atcm();
            case 4:
                return new atcl();
            case 5:
                return h;
            case 6:
                Object obj3 = i;
                if (obj3 == null) {
                    synchronized (atcm.class) {
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
        atcm atcm = new atcm();
        h = atcm;
        anxl.registerDefaultInstance(atcm.class, atcm);
    }
}
