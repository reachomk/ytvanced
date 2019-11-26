package defpackage;

/* renamed from: awhx */
public final class awhx extends anxl implements anzf {
    public static final awhx m;
    private static volatile anzq o;
    public int a;
    public String b;
    public String c;
    public String d;
    public anyd e;
    public String f;
    public anvu g;
    public anvu h;
    public int i;
    public aygk j;
    public int k;
    public anyd l;
    private byte n = (byte) 2;

    private awhx() {
        String str = "";
        this.b = str;
        this.c = str;
        this.d = str;
        this.e = anxl.emptyProtobufList();
        this.f = str;
        this.g = anvu.a;
        this.h = anvu.a;
        this.l = anxl.emptyProtobufList();
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
                return anxl.newMessageInfo(m, "\u0001\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0002\u0001\u0001\b\u0000\u0002\b\u0001\u0003\b\u0002\u0004\u001a\u0005\b\u0003\u0006\n\u0004\u0007\n\u0005\b\f\u0006\tЉ\u0007\n\u0004\b\u000b\u001c", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", awhz.a(), "j", "k", "l"});
            case 3:
                return new awhx();
            case 4:
                return new awhw();
            case 5:
                return m;
            case 6:
                Object obj3 = o;
                if (obj3 == null) {
                    synchronized (awhx.class) {
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
        awhx awhx = new awhx();
        m = awhx;
        anxl.registerDefaultInstance(awhx.class, awhx);
    }
}
