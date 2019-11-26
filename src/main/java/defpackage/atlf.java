package defpackage;

/* renamed from: atlf */
public final class atlf extends anxl implements anzf {
    public static final atlf h;
    private static volatile anzq j;
    public int a;
    public ashy b;
    public String c = "";
    public int d = 1;
    public avak e;
    public azaz f;
    public boolean g;
    private byte i = (byte) 2;

    private atlf() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.i);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.i = b;
                return null;
            case 2:
                return anxl.newMessageInfo(h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0001\u0001Љ\u0000\u0002\b\u0001\u0003\f\u0002\u0004\t\u0003\u0005\t\u0004\u0006\u0007\u0005", new Object[]{"a", "b", "c", "d", atlk.a, "e", "f", "g"});
            case 3:
                return new atlf();
            case 4:
                return new atli();
            case 5:
                return h;
            case 6:
                Object obj3 = j;
                if (obj3 == null) {
                    synchronized (atlf.class) {
                        obj3 = j;
                        if (obj3 == null) {
                            obj3 = new anxn(h);
                            j = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        atlf atlf = new atlf();
        h = atlf;
        anxl.registerDefaultInstance(atlf.class, atlf);
    }
}
