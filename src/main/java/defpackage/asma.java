package defpackage;

/* renamed from: asma */
public final class asma extends anxl implements anzf {
    public static final asma k;
    private static volatile anzq m;
    public int a;
    public ashy b;
    public String c;
    public int d;
    public anvu e;
    public String f;
    public String g;
    public String h;
    public boolean i;
    public int j;
    private byte l = (byte) 2;

    private asma() {
        String str = "";
        this.c = str;
        this.e = anvu.a;
        this.f = str;
        this.g = str;
        this.h = str;
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.l);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.l = b;
                return null;
            case 2:
                return anxl.newMessageInfo(k, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0000\u0001\u0001Љ\u0000\u0002\b\u0001\u0003\f\u0002\u0004\n\u0003\u0005\b\u0004\u0006\b\u0005\u0007\b\u0006\b\u0007\u0007\t\u000b\b", new Object[]{"a", "b", "c", "d", argg.a, "e", "f", "g", "h", "i", "j"});
            case 3:
                return new asma();
            case 4:
                return new asmd();
            case 5:
                return k;
            case 6:
                Object obj3 = m;
                if (obj3 == null) {
                    synchronized (asma.class) {
                        obj3 = m;
                        if (obj3 == null) {
                            obj3 = new anxn(k);
                            m = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        asma asma = new asma();
        k = asma;
        anxl.registerDefaultInstance(asma.class, asma);
    }
}
