package defpackage;

/* renamed from: bcfe */
public final class bcfe extends anxl implements anzf {
    public static final bcfe x;
    private static volatile anzq z;
    public int a;
    public bcbn b;
    public long c;
    public String d;
    public bcfg e;
    public bcdl f;
    public bcca g;
    public bcdq h;
    public bcew i;
    public bcei j;
    public bcad k;
    public bcdv l;
    public bcec m;
    public bcbb n;
    public bcdx o;
    public bccz p;
    public String q;
    public bcav r;
    public bcdj s;
    public bccq t;
    public bcdr u;
    public bcem v;
    public bcfc w;
    private byte y = (byte) 2;

    private bcfe() {
        String str = "";
        this.d = str;
        this.q = str;
        anxl.emptyProtobufList();
        anxl.emptyProtobufList();
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.y);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.y = b;
                return null;
            case 2:
                return anxl.newMessageInfo(x, "\u0001\u0016\u0000\u0001\u0001\u001c\u0016\u0000\u0000\u0001\u0001Љ\u0000\u0002\u0005\u0001\u0003\b\u0002\u0004\t\u0003\u0005\t\u0004\u0006\t\u0005\u0007\t\u0006\b\t\u0007\t\t\b\n\t\t\f\t\u000b\r\t\f\u000e\t\r\u000f\t\u000e\u0010\t\u000f\u0011\b\u0010\u0015\t\u0014\u0016\t\u0015\u0017\t\u0016\u0018\t\u0017\u001b\t\u0012\u001c\t\u0019", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "s", "t", "u", "v", "r", "w"});
            case 3:
                return new bcfe();
            case 4:
                return new bcfd();
            case 5:
                return x;
            case 6:
                Object obj3 = z;
                if (obj3 == null) {
                    synchronized (bcfe.class) {
                        obj3 = z;
                        if (obj3 == null) {
                            obj3 = new anxn(x);
                            z = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        bcfe bcfe = new bcfe();
        x = bcfe;
        anxl.registerDefaultInstance(bcfe.class, bcfe);
    }
}
