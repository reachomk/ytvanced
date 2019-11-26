package defpackage;

/* renamed from: aqin */
public final class aqin extends anxl implements anzf {
    public static final aqin j;
    private static volatile anzq l;
    public int a;
    public String b = "";
    public aqtc c;
    public aygk d;
    public arml e;
    public arml f;
    public arml g;
    public apxu h;
    public aphj i;
    private byte k = (byte) 2;

    private aqin() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.k);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.k = b;
                return null;
            case 2:
                return anxl.newMessageInfo(j, "\u0001\b\u0000\u0001\u0001\f\b\u0000\u0000\u0006\u0001\b\u0000\u0002Љ\u0002\u0003Љ\u0006\u0004Љ\u0007\u0006Љ\u0003\u0007\t\u0001\nЉ\u0005\fЉ\u0004", new Object[]{"a", "b", "d", "h", "i", "e", "c", "g", "f"});
            case 3:
                return new aqin();
            case 4:
                return new aqiq();
            case 5:
                return j;
            case 6:
                Object obj3 = l;
                if (obj3 == null) {
                    synchronized (aqin.class) {
                        obj3 = l;
                        if (obj3 == null) {
                            obj3 = new anxn(j);
                            l = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        aqin aqin = new aqin();
        j = aqin;
        anxl.registerDefaultInstance(aqin.class, aqin);
    }
}
