package defpackage;

/* renamed from: atdv */
public final class atdv extends anxl implements anzf {
    public static final atdv o;
    private static volatile anzq q;
    public int a;
    public int b;
    public String c;
    public String d;
    public atdr e;
    public atdt f;
    public atdp g;
    public axak h;
    public atdd i;
    public atdb j;
    public atdl k;
    public atet l;
    public atdj m;
    public axak n;
    private byte p = (byte) 2;

    private atdv() {
        String str = "";
        this.c = str;
        this.d = str;
        anxl.emptyProtobufList();
        anxl.emptyProtobufList();
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.p);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.p = b;
                return null;
            case 2:
                return anxl.newMessageInfo(o, "\u0001\r\u0000\u0001\u0001\u0019\r\u0000\u0000\b\u0001\f\u0000\u0002\b\u0001\bЉ\u0005\nЉ\u000e\u000bЉ\n\rЉ\u0010\u0010Љ\u000b\u0011\t\u0003\u0012Љ\u0011\u0015\t\b\u0016\b\u0002\u0018Љ\t\u0019Љ\u0015", new Object[]{"a", "b", awag.a, "c", "f", "k", "i", "l", "j", "e", "m", "g", "d", "h", "n"});
            case 3:
                return new atdv();
            case 4:
                return new atdy();
            case 5:
                return o;
            case 6:
                Object obj3 = q;
                if (obj3 == null) {
                    synchronized (atdv.class) {
                        obj3 = q;
                        if (obj3 == null) {
                            obj3 = new anxn(o);
                            q = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        atdv atdv = new atdv();
        o = atdv;
        anxl.registerDefaultInstance(atdv.class, atdv);
    }
}
