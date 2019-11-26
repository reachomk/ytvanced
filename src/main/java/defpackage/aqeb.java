package defpackage;

/* renamed from: aqeb */
public final class aqeb extends anxl implements anzf {
    public static final aqeb p;
    private static volatile anzq r;
    public int a;
    public aygk b;
    public aqec c;
    public aqec d;
    public axak e;
    public axak f;
    public int g;
    public axak h;
    public apxu i;
    public axak j;
    public anyd k = anxl.emptyProtobufList();
    public apxu l;
    public int m;
    public aqlj n;
    public anvu o = anvu.a;
    private byte q = (byte) 2;

    private aqeb() {
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
                return anxl.newMessageInfo(p, "\u0001\u000e\u0000\u0001\u0001\u000f\u000e\u0000\u0001\n\u0001Љ\u0000\u0002Љ\u0001\u0003Љ\u0002\u0004Љ\u0003\u0005\u000b\u0005\u0006Љ\u0007\u0007Љ\b\t\n\r\nЛ\u000bЉ\u0006\f\f\n\r\t\u000b\u000eЉ\u0004\u000fЉ\t", new Object[]{"a", "b", "c", "d", "e", "g", "i", "j", "o", "k", apxu.class, "h", "m", aqhd.a, "n", "f", "l"});
            case 3:
                return new aqeb();
            case 4:
                return new aqed();
            case 5:
                return p;
            case 6:
                Object obj3 = r;
                if (obj3 == null) {
                    synchronized (aqeb.class) {
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
        aqeb aqeb = new aqeb();
        p = aqeb;
        anxl.registerDefaultInstance(aqeb.class, aqeb);
    }
}
