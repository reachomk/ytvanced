package defpackage;

/* renamed from: azem */
public final class azem extends anxp implements anzf {
    public static final azem D;
    private static volatile anzq F;
    public axak A;
    public apxu B;
    public axak C;
    private byte E = (byte) 2;
    public int a;
    public arml b;
    public arml c;
    public aygk d;
    public arml e;
    public appu f;
    public arml g;
    public arml i;
    public arml j;
    public apxu k;
    public azeo l;
    public auvr m;
    public boolean n;
    public anyd o = anxl.emptyProtobufList();
    public azeq p;
    public anvu q = anvu.a;
    public String r = "";
    public apdx s;
    public apdx t;
    public apdx u;
    public arml v;
    public ayri w;
    public anyd x = anxl.emptyProtobufList();
    public azes y;
    public ayym z;

    private azem() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.E);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.E = b;
                return null;
            case 2:
                return anxl.newMessageInfo(D, "\u0001\u001b\u0000\u0001\u0001 \u001b\u0000\u0002\u0016\u0001Љ\u0000\u0002Љ\u0001\u0003Љ\u0002\u0004Љ\u0003\u0005Љ\u0006\u0006Љ\u0007\u0007Љ\t\bЉ\n\tЉ\u000b\n\u0007\f\r\n\u0011\u000e\b\u0012\u000fЛ\u0010Љ\u0005\u0011Љ\u0013\u0012Љ\u0014\u0013Љ\u0015\u0014Љ\u0016\u0015Љ\b\u0016Љ\r\u0017Љ\u0017\u0019Л\u001a\t\u0019\u001b\t\u001a\u001dЉ\u001b\u001fЉ\u001d Љ\u001e", new Object[]{"a", "b", "c", "d", "e", "g", "i", "k", "l", "m", "n", "q", "r", "o", ayfu.class, "f", "s", "t", "u", "v", "j", "p", "w", "x", apdh.class, "y", "z", "A", "B", "C"});
            case 3:
                return new azem();
            case 4:
                return new azep();
            case 5:
                return D;
            case 6:
                Object obj3 = F;
                if (obj3 == null) {
                    synchronized (azem.class) {
                        obj3 = F;
                        if (obj3 == null) {
                            obj3 = new anxn(D);
                            F = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public static anzq b() {
        return D.getParserForType();
    }

    static {
        azem azem = new azem();
        D = azem;
        anxl.registerDefaultInstance(azem.class, azem);
    }
}
