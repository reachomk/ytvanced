package defpackage;

/* renamed from: atze */
public final class atze extends anxl implements anzf {
    public static final atze q;
    private static volatile anzq s;
    public int a;
    public arml b;
    public arml c;
    public arml d;
    public String e = "";
    public int f;
    public arml g;
    public arml h;
    public arml i;
    public axak j;
    public axak k;
    public arml l;
    public arml m;
    public arml n;
    public aphj o;
    public aphj p;
    private byte r = (byte) 2;

    private atze() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.r);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.r = b;
                return null;
            case 2:
                return anxl.newMessageInfo(q, "\u0001\u000f\u0000\u0001\u0001\u0014\u000f\u0000\u0000\r\u0001Љ\u0000\u0002Љ\u0005\u0003Љ\u0006\u0005Љ\u0007\u0007Љ\b\tЉ\t\nЉ\n\fЉ\u0001\rЉ\u000b\u000eЉ\f\u000fЉ\u000e\u0010Љ\u0002\u0011Љ\u000f\u0012\u0004\u0004\u0014\b\u0003", new Object[]{"a", "b", "g", "h", "i", "j", "k", "l", "c", "m", "n", "o", "d", "p", "f", "e"});
            case 3:
                return new atze();
            case 4:
                return new atzd();
            case 5:
                return q;
            case 6:
                Object obj3 = s;
                if (obj3 == null) {
                    synchronized (atze.class) {
                        obj3 = s;
                        if (obj3 == null) {
                            obj3 = new anxn(q);
                            s = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        atze atze = new atze();
        q = atze;
        anxl.registerDefaultInstance(atze.class, atze);
    }
}
