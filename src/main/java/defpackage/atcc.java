package defpackage;

/* renamed from: atcc */
public final class atcc extends anxl implements anzf {
    public static final atcc f;
    private static volatile anzq h;
    public int a;
    public ashy b;
    public String c;
    public String d;
    public int e;
    private byte g = (byte) 2;

    private atcc() {
        String str = "";
        this.c = str;
        this.d = str;
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.g);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.g = b;
                return null;
            case 2:
                return anxl.newMessageInfo(f, "\u0001\u0004\u0000\u0001\u0001\u0007\u0004\u0000\u0000\u0001\u0001Љ\u0000\u0002\b\u0001\u0003\b\u0002\u0007\u0004\u0005", new Object[]{"a", "b", "c", "d", "e"});
            case 3:
                return new atcc();
            case 4:
                return new atcb();
            case 5:
                return f;
            case 6:
                Object obj3 = h;
                if (obj3 == null) {
                    synchronized (atcc.class) {
                        obj3 = h;
                        if (obj3 == null) {
                            obj3 = new anxn(f);
                            h = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        atcc atcc = new atcc();
        f = atcc;
        anxl.registerDefaultInstance(atcc.class, atcc);
    }
}
