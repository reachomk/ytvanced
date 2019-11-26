package defpackage;

/* renamed from: axav */
public final class axav extends anxl implements anzf {
    public static final axav l;
    private static volatile anzq n;
    public int a;
    public avuo b;
    public arml c;
    public arml d;
    public arml e;
    public aphj f;
    public aphj g;
    public aphj h;
    public apfm i;
    public apfm j;
    public anvu k = anvu.a;
    private byte m = (byte) 2;

    private axav() {
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
                return anxl.newMessageInfo(l, "\u0001\n\u0000\u0001\u0001\u000b\n\u0000\u0000\t\u0001Љ\u0000\u0003\n\n\u0004Љ\u0001\u0005Љ\u0004\u0006Љ\u0005\u0007Љ\u0002\bЉ\u0003\tЉ\u0006\nЉ\u0007\u000bЉ\b", new Object[]{"a", "b", "k", "c", "f", "g", "d", "e", "h", "i", "j"});
            case 3:
                return new axav();
            case 4:
                return new axau();
            case 5:
                return l;
            case 6:
                Object obj3 = n;
                if (obj3 == null) {
                    synchronized (axav.class) {
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
        axav axav = new axav();
        l = axav;
        anxl.registerDefaultInstance(axav.class, axav);
    }
}
