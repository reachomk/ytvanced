package defpackage;

/* renamed from: apxw */
public final class apxw extends anxl implements anzf {
    public static final apxw p;
    private static volatile anzq r;
    public int a;
    public aphj b;
    public aphj c;
    public aphj d;
    public axak e;
    public aqrq f;
    public aphj g;
    public apya h;
    public aphj i;
    public apya j;
    public aphj k;
    public apya l;
    public aphj m;
    public apya n;
    public apya o;
    private byte q = (byte) 2;

    private apxw() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.q);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.q = b;
                return null;
            case 2:
                return anxl.newMessageInfo(p, "\u0001\u000e\u0000\u0001\u0001\u0011\u000e\u0000\u0000\u000e\u0001Љ\u0000\u0002Љ\u0002\u0003Љ\t\u0004Љ\u0005\u0005Љ\u0007\u0006Љ\u000b\u0007Љ\u0001\nЉ\u0006\u000bЉ\b\fЉ\n\rЉ\f\u000eЉ\r\u000fЉ\u0004\u0011Љ\u0003", new Object[]{"a", "b", "d", "k", "g", "i", "m", "c", "h", "j", "l", "n", "o", "f", "e"});
            case 3:
                return new apxw();
            case 4:
                return new apxz();
            case 5:
                return p;
            case 6:
                Object obj3 = r;
                if (obj3 == null) {
                    synchronized (apxw.class) {
                        obj3 = r;
                        if (obj3 == null) {
                            obj3 = new anxn(p);
                            r = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        apxw apxw = new apxw();
        p = apxw;
        anxl.registerDefaultInstance(apxw.class, apxw);
    }
}
