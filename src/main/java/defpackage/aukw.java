package defpackage;

/* renamed from: aukw */
public final class aukw extends anxp implements anzf {
    public static final aukw c;
    public static final anxr d;
    private static volatile anzq f;
    public int a;
    public anvu b = anvu.a;
    private byte e = (byte) 2;

    private aukw() {
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
                return anxl.newMessageInfo(c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\n\u0000", new Object[]{"a", "b"});
            case 3:
                return new aukw();
            case 4:
                return new aukz();
            case 5:
                return c;
            case 6:
                Object obj3 = f;
                if (obj3 == null) {
                    synchronized (aukw.class) {
                        obj3 = f;
                        if (obj3 == null) {
                            obj3 = new anxn(c);
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
        aukw aukw = new aukw();
        c = aukw;
        anxl.registerDefaultInstance(aukw.class, aukw);
        azvh azvh = azvh.a;
        aukw aukw2 = c;
        d = anxl.newSingularGeneratedExtension(azvh, aukw2, aukw2, null, 169494678, aobm.MESSAGE, aukw.class);
    }
}
