package defpackage;

/* renamed from: azvn */
public final class azvn extends anxl implements anzf {
    public static final azvn b;
    public static final anxr c;
    private static volatile anzq e;
    public anyd a = anxl.emptyProtobufList();
    private byte d = (byte) 2;

    private azvn() {
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
                return new azvn();
            case 4:
                return new azvm();
            case 5:
                return b;
            case 6:
                Object obj3 = e;
                if (obj3 == null) {
                    synchronized (azvn.class) {
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
        azvn azvn = new azvn();
        b = azvn;
        anxl.registerDefaultInstance(azvn.class, azvn);
        azsr azsr = azsr.a;
        azvn azvn2 = b;
        c = anxl.newSingularGeneratedExtension(azsr, azvn2, azvn2, null, 170382688, aobm.MESSAGE, azvn.class);
    }
}
