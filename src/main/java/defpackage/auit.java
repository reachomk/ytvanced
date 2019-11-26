package defpackage;

/* renamed from: auit */
public final class auit extends anxl implements anzf {
    public static final auit d;
    private static volatile anzq f;
    public int a;
    public String b;
    public String c;
    private byte e = (byte) 2;

    private auit() {
        String str = "";
        this.b = str;
        this.c = str;
        anxl.emptyProtobufList();
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.e);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.e = b;
                return null;
            case 2:
                return anxl.newMessageInfo(d, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001\b\u0000\u0003\b\u0006", new Object[]{"a", "b", "c"});
            case 3:
                return new auit();
            case 4:
                return new auiw();
            case 5:
                return d;
            case 6:
                Object obj3 = f;
                if (obj3 == null) {
                    synchronized (auit.class) {
                        obj3 = f;
                        if (obj3 == null) {
                            obj3 = new anxn(d);
                            f = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        auit auit = new auit();
        d = auit;
        anxl.registerDefaultInstance(auit.class, auit);
    }
}
