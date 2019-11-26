package defpackage;

/* renamed from: armp */
public final class armp extends anxp implements anzf {
    public static final armp m;
    private static volatile anzq o;
    public int a;
    public String b = "";
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public int i;
    public int j;
    public apxu k;
    public auko l;
    private byte n = (byte) 2;

    private armp() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.n);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.n = b;
                return null;
            case 2:
                return anxl.newMessageInfo(m, "\u0001\n\u0000\u0001\u0001ϧ\n\u0000\u0000\u0002\u0001\b\u0000\u0002\u0007\u0001\u0003\u0007\u0002\u0004\u0007\u0003\u0005Љ\b\u0006\u0007\u0004\b\u000b\u0006\t\f\u0007\n\u0007\u0005ϧЉ\t", new Object[]{"a", "b", "c", "d", "e", "k", "f", "i", "j", armi.a, "g", "l"});
            case 3:
                return new armp();
            case 4:
                return new armo();
            case 5:
                return m;
            case 6:
                Object obj3 = o;
                if (obj3 == null) {
                    synchronized (armp.class) {
                        obj3 = o;
                        if (obj3 == null) {
                            obj3 = new anxn(m);
                            o = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        armp armp = new armp();
        m = armp;
        anxl.registerDefaultInstance(armp.class, armp);
    }
}
