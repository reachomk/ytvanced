package defpackage;

/* renamed from: atci */
public final class atci extends anxl implements anzf {
    public static final atci f;
    private static volatile anzq h;
    public int a;
    public asic b;
    public anyd c = anxl.emptyProtobufList();
    public atck d;
    public int e;
    private byte g = (byte) 2;

    private atci() {
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
                return anxl.newMessageInfo(f, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0001\u0002\u0001Љ\u0000\u0002Л\u0003\t\u0001\u0005\u000b\u0002", new Object[]{"a", "b", "c", atcw.class, "d", "e"});
            case 3:
                return new atci();
            case 4:
                return new atch();
            case 5:
                return f;
            case 6:
                Object obj3 = h;
                if (obj3 == null) {
                    synchronized (atci.class) {
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
        atci atci = new atci();
        f = atci;
        anxl.registerDefaultInstance(atci.class, atci);
    }
}
