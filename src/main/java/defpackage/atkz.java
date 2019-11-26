package defpackage;

/* renamed from: atkz */
public final class atkz extends anxl implements anzf {
    public static final atkz g;
    private static volatile anzq i;
    public int a;
    public ashy b;
    public String c;
    public String d;
    public ayuo e;
    public apwu f;
    private byte h = (byte) 2;

    private atkz() {
        String str = "";
        this.c = str;
        this.d = str;
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
                return anxl.newMessageInfo(g, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0001\u0001Љ\u0000\u0002\b\u0001\u0003\b\u0002\u0004\t\u0003\u0006\t\u0005", new Object[]{"a", "b", "c", "d", "e", "f"});
            case 3:
                return new atkz();
            case 4:
                return new atlc();
            case 5:
                return g;
            case 6:
                Object obj3 = i;
                if (obj3 == null) {
                    synchronized (atkz.class) {
                        obj3 = i;
                        if (obj3 == null) {
                            obj3 = new anxn(g);
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
        atkz atkz = new atkz();
        g = atkz;
        anxl.registerDefaultInstance(atkz.class, atkz);
    }
}
