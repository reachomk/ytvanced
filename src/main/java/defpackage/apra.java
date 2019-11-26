package defpackage;

/* renamed from: apra */
public final class apra extends anxl implements anzf {
    public static final apra l;
    private static volatile anzq n;
    public int a;
    public String b;
    public anyd c;
    public anvu d;
    public anvu e;
    public aygk f;
    public boolean g;
    public long h;
    public int i;
    public anvu j;
    public String k;
    private byte m = (byte) 2;

    private apra() {
        String str = "";
        this.b = str;
        this.c = anxl.emptyProtobufList();
        this.d = anvu.a;
        this.e = anvu.a;
        this.j = anvu.a;
        this.k = str;
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.m);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.m = b;
                return null;
            case 2:
                return anxl.newMessageInfo(l, "\u0001\n\u0000\u0001\u0001\n\n\u0000\u0001\u0001\u0001\b\u0000\u0002\u001a\u0003\n\u0001\u0004\n\u0002\u0005Љ\u0003\u0006\u0007\u0004\u0007\u0002\u0005\b\u0004\u0006\t\n\u0007\n\b\b", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k"});
            case 3:
                return new apra();
            case 4:
                return new aprd();
            case 5:
                return l;
            case 6:
                Object obj3 = n;
                if (obj3 == null) {
                    synchronized (apra.class) {
                        obj3 = n;
                        if (obj3 == null) {
                            obj3 = new anxn(l);
                            n = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        apra apra = new apra();
        l = apra;
        anxl.registerDefaultInstance(apra.class, apra);
    }
}
