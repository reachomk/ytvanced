package defpackage;

/* renamed from: ascw */
public final class ascw extends anxl implements anzf {
    public static final ascw k;
    private static volatile anzq m;
    public int a;
    public ashy b;
    public anvu c = anvu.a;
    public String d;
    public String e;
    public int f;
    public int g;
    public int h;
    public String i;
    public azrm j;
    private byte l = (byte) 2;

    private ascw() {
        String str = "";
        this.d = str;
        this.e = str;
        this.i = str;
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.l);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.l = b;
                return null;
            case 2:
                return anxl.newMessageInfo(k, "\u0001\t\u0000\u0001\u0001\n\t\u0000\u0000\u0001\u0001Љ\u0000\u0003\n\u0001\u0004\b\u0002\u0005\b\u0003\u0006\u0004\u0004\u0007\u0004\u0005\b\u0004\u0006\t\b\u0007\n\t\b", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j"});
            case 3:
                return new ascw();
            case 4:
                return new ascz();
            case 5:
                return k;
            case 6:
                Object obj3 = m;
                if (obj3 == null) {
                    synchronized (ascw.class) {
                        obj3 = m;
                        if (obj3 == null) {
                            obj3 = new anxn(k);
                            m = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        ascw ascw = new ascw();
        k = ascw;
        anxl.registerDefaultInstance(ascw.class, ascw);
    }
}
