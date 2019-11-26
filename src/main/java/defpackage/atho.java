package defpackage;

/* renamed from: atho */
public final class atho extends anxl implements anzf {
    public static final atho g;
    private static volatile anzq i;
    public int a;
    public int b = 0;
    public Object c;
    public ashy d;
    public anvu e = anvu.a;
    public String f = "";
    private byte h = (byte) 2;

    private atho() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.h);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.h = b;
                return null;
            case 2:
                return anxl.newMessageInfo(g, "\u0001\u0005\u0001\u0001\u0001\u0006\u0005\u0000\u0000\u0001\u0001Љ\u0000\u0003\n\u0001\u0004;\u0000\u0005\b\u0004\u0006<\u0000", new Object[]{"c", "b", "a", "d", "e", "f", augl.class});
            case 3:
                return new atho();
            case 4:
                return new athn();
            case 5:
                return g;
            case 6:
                Object obj3 = i;
                if (obj3 == null) {
                    synchronized (atho.class) {
                        obj3 = i;
                        if (obj3 == null) {
                            obj3 = new anxn(g);
                            i = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        atho atho = new atho();
        g = atho;
        anxl.registerDefaultInstance(atho.class, atho);
    }
}
