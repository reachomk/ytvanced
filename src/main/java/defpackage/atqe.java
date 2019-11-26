package defpackage;

/* renamed from: atqe */
public final class atqe extends anxl implements anzf {
    public static final atqe o;
    private static volatile anzq q;
    public int a;
    public int b = 0;
    public Object c;
    public int d = 0;
    public Object e;
    public asic f;
    public String g;
    public String h;
    public anvu i;
    public atqm j;
    public anvu k;
    public anvu l;
    public anvu m;
    public apxu n;
    private byte p = (byte) 2;

    private atqe() {
        String str = "";
        this.g = str;
        this.h = str;
        this.i = anvu.a;
        this.k = anvu.a;
        this.l = anvu.a;
        this.m = anvu.a;
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
                return anxl.newMessageInfo(o, "\u0001\r\u0002\u0001\u0001\u000f\r\u0000\u0000\u0006\u0001Љ\u0000\u0004\b\u0004\u0005\b\u0005\u0006Љ\u0007\u0007=\u0000\b\n\b\t\n\t\n\n\u0006\u000bм\u0001\fм\u0001\r\n\f\u000eЉ\r\u000fм\u0000", new Object[]{"c", "b", "e", "d", "a", "f", "g", "h", "j", "k", "l", "i", apxu.class, apxu.class, "m", "n", axak.class});
            case 3:
                return new atqe();
            case 4:
                return new atqd();
            case 5:
                return o;
            case 6:
                Object obj3 = q;
                if (obj3 == null) {
                    synchronized (atqe.class) {
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
        atqe atqe = new atqe();
        o = atqe;
        anxl.registerDefaultInstance(atqe.class, atqe);
    }
}
