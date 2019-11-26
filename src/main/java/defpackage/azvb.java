package defpackage;

/* renamed from: azvb */
public final class azvb extends anxl implements anzf {
    public static final azvb f;
    public static final anxr g;
    private static volatile anzq i;
    public int a;
    public azsr b;
    public azsr c;
    public azsr d;
    public azsr e;
    private byte h = (byte) 2;

    private azvb() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.h);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.h = b;
                return null;
            case 2:
                return anxl.newMessageInfo(f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0004\u0001Љ\u0000\u0002Љ\u0001\u0003Љ\u0002\u0004Љ\u0003", new Object[]{"a", "b", "c", "d", "e"});
            case 3:
                return new azvb();
            case 4:
                return new azva();
            case 5:
                return f;
            case 6:
                Object obj3 = i;
                if (obj3 == null) {
                    synchronized (azvb.class) {
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
        azvb azvb = new azvb();
        f = azvb;
        anxl.registerDefaultInstance(azvb.class, azvb);
        azsr azsr = azsr.a;
        azvb azvb2 = f;
        g = anxl.newSingularGeneratedExtension(azsr, azvb2, azvb2, null, 170382629, aobm.MESSAGE, azvb.class);
    }
}
