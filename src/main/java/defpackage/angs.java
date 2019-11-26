package defpackage;

/* renamed from: angs */
public final class angs extends anxl implements anzf {
    public static final angs f;
    private static volatile anzq h;
    public int a;
    public String b;
    public String c;
    public String d;
    public int e;
    private byte g = (byte) 2;

    private angs() {
        String str = "";
        this.b = str;
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
                return anxl.newMessageInfo(f, "\u0001\u0004\u0000\u0001\u0005\b\u0004\u0000\u0000\u0003\u0005Ԉ\u0000\u0006Ԉ\u0001\u0007\b\u0002\bԄ\u0003", new Object[]{"a", "b", "c", "d", "e"});
            case 3:
                return new angs();
            case 4:
                return new angr();
            case 5:
                return f;
            case 6:
                Object obj3 = h;
                if (obj3 == null) {
                    synchronized (angs.class) {
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
        angs angs = new angs();
        f = angs;
        anxl.registerDefaultInstance(angs.class, angs);
    }
}
