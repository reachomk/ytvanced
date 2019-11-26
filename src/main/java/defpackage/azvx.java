package defpackage;

/* renamed from: azvx */
public final class azvx extends anxl implements anzf {
    public static final azvx e;
    public static final anxr f;
    private static volatile anzq h;
    public int a;
    public String b = "";
    public azsb c;
    public azvz d;
    private byte g = (byte) 2;

    private azvx() {
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
                return anxl.newMessageInfo(e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001\b\u0000\u0002\t\u0001\u0003Љ\u0002", new Object[]{"a", "b", "c", "d"});
            case 3:
                return new azvx();
            case 4:
                return new azvw();
            case 5:
                return e;
            case 6:
                Object obj3 = h;
                if (obj3 == null) {
                    synchronized (azvx.class) {
                        obj3 = h;
                        if (obj3 == null) {
                            obj3 = new anxn(e);
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
        azvx azvx = new azvx();
        e = azvx;
        anxl.registerDefaultInstance(azvx.class, azvx);
        azsr azsr = azsr.a;
        azvx azvx2 = e;
        f = anxl.newSingularGeneratedExtension(azsr, azvx2, azvx2, null, 194114827, aobm.MESSAGE, azvx.class);
    }
}
