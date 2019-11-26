package defpackage;

/* renamed from: aojc */
public final class aojc extends anxl implements anzf {
    public static final aojc f;
    private static volatile anzq h;
    public int a;
    public anyd b = anxl.emptyProtobufList();
    public anyd c = anxl.emptyProtobufList();
    public aojq d;
    public String e = "";
    private byte g = (byte) 2;

    private aojc() {
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
                return anxl.newMessageInfo(f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0002\u0001Л\u0002Л\u0003\t\u0000\u0004\b\u0001", new Object[]{"a", "b", apxu.class, "c", apxu.class, "d", "e"});
            case 3:
                return new aojc();
            case 4:
                return new aojf();
            case 5:
                return f;
            case 6:
                Object obj3 = h;
                if (obj3 == null) {
                    synchronized (aojc.class) {
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
        aojc aojc = new aojc();
        f = aojc;
        anxl.registerDefaultInstance(aojc.class, aojc);
    }
}
