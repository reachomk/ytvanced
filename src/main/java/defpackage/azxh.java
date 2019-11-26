package defpackage;

/* renamed from: azxh */
public final class azxh extends anxl implements anzf {
    public static final azxh b;
    private static volatile anzq d;
    public anyy a = anyy.b;
    private byte c = (byte) 2;

    private azxh() {
        anxl.emptyProtobufList();
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.c);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.c = b;
                return null;
            case 2:
                return anxl.newMessageInfo(b, "\u0001\u0001\u0000\u0000\u0004\u0004\u0001\u0001\u0000\u0000\u00042", new Object[]{"a", azxj.a});
            case 3:
                return new azxh();
            case 4:
                return new azxg();
            case 5:
                return b;
            case 6:
                Object obj3 = d;
                if (obj3 == null) {
                    synchronized (azxh.class) {
                        obj3 = d;
                        if (obj3 == null) {
                            obj3 = new anxn(b);
                            d = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        azxh azxh = new azxh();
        b = azxh;
        anxl.registerDefaultInstance(azxh.class, azxh);
    }
}
