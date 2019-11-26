package defpackage;

/* renamed from: atnu */
public final class atnu extends anxl implements anzf {
    public static final atnu d;
    private static volatile anzq e;
    public int a;
    public String b = "3.0";
    public anyd c = anxl.emptyProtobufList();

    private atnu() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\b\u0000\u0002\u001b", new Object[]{"a", "b", "c", atmo.class});
            case 3:
                return new atnu();
            case 4:
                return new atnt();
            case 5:
                return d;
            case 6:
                Object obj3 = e;
                if (obj3 == null) {
                    synchronized (atnu.class) {
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
        atnu atnu = new atnu();
        d = atnu;
        anxl.registerDefaultInstance(atnu.class, atnu);
    }
}
