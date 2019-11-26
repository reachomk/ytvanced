package defpackage;

/* renamed from: aptw */
public final class aptw extends anxp implements anzf {
    public static final aptw n;
    private static volatile anzq p;
    public int a;
    public int b = 0;
    public Object c;
    public arml d;
    public apxu e;
    public auvr f;
    public arml g;
    public int i;
    public arml j;
    public arml k;
    public anvu l = anvu.a;
    public arml m;
    private byte o = (byte) 2;

    private aptw() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.o);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.o = b;
                return null;
            case 2:
                return anxl.newMessageInfo(n, "\u0001\u000b\u0001\u0001\u0001\r\u000b\u0000\u0000\b\u0001Љ\u0000\u0002м\u0000\u0003Љ\u0003\u0004Љ\u0004\u0005Љ\u0005\u0007\n\n\t\f\u0007\nЉ\b\u000bЉ\t\f<\u0000\rЉ\f", new Object[]{"c", "b", "a", "d", aygk.class, "e", "f", "g", "l", "i", aptu.a, "j", "k", arwf.class, "m"});
            case 3:
                return new aptw();
            case 4:
                return new aptx();
            case 5:
                return n;
            case 6:
                Object obj3 = p;
                if (obj3 == null) {
                    synchronized (aptw.class) {
                        obj3 = p;
                        if (obj3 == null) {
                            obj3 = new anxn(n);
                            p = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public static anzq b() {
        return n.getParserForType();
    }

    static {
        aptw aptw = new aptw();
        n = aptw;
        anxl.registerDefaultInstance(aptw.class, aptw);
    }
}
