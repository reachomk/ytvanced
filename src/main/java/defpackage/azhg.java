package defpackage;

/* renamed from: azhg */
public final class azhg extends anxp implements anzf {
    public static final azhg f;
    private static volatile anzq i;
    public int a;
    public azhy b;
    public azhs c;
    public arml d;
    public arml e;
    private byte g = (byte) 2;

    private azhg() {
        anxl.emptyProtobufList();
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
                return anxl.newMessageInfo(f, "\u0001\u0004\u0000\u0001\u0001\n\u0004\u0000\u0000\u0004\u0001Љ\u0000\u0002Љ\u0001\u0005Љ\u0003\nЉ\u0005", new Object[]{"a", "b", "c", "d", "e"});
            case 3:
                return new azhg();
            case 4:
                return new azhj();
            case 5:
                return f;
            case 6:
                Object obj3 = i;
                if (obj3 == null) {
                    synchronized (azhg.class) {
                        obj3 = i;
                        if (obj3 == null) {
                            obj3 = new anxn(f);
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
        azhg azhg = new azhg();
        f = azhg;
        anxl.registerDefaultInstance(azhg.class, azhg);
    }
}
