package defpackage;

/* renamed from: azvd */
public final class azvd extends anxl implements anzf {
    public static final azvd b;
    public static final anxr c;
    private static volatile anzq e;
    public anyd a = anxl.emptyProtobufList();
    private byte d = (byte) 2;

    private azvd() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.d);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.d = b;
                return null;
            case 2:
                return anxl.newMessageInfo(b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"a", azsr.class});
            case 3:
                return new azvd();
            case 4:
                return new azvc();
            case 5:
                return b;
            case 6:
                Object obj3 = e;
                if (obj3 == null) {
                    synchronized (azvd.class) {
                        obj3 = e;
                        if (obj3 == null) {
                            obj3 = new anxn(b);
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
        azvd azvd = new azvd();
        b = azvd;
        anxl.registerDefaultInstance(azvd.class, azvd);
        azsr azsr = azsr.a;
        azvd azvd2 = b;
        c = anxl.newSingularGeneratedExtension(azsr, azvd2, azvd2, null, 170382656, aobm.MESSAGE, azvd.class);
    }
}
