package defpackage;

/* renamed from: apyg */
public final class apyg extends anxl implements anzf {
    public static final apyg f;
    private static volatile anzq h;
    public int a;
    public apyi b;
    public apyc c;
    public apyk d;
    public apym e;
    private byte g = (byte) 2;

    private apyg() {
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
                return anxl.newMessageInfo(f, "\u0001\u0004\u0000\u0001㰻䲹\u0004\u0000\u0000\u0004㰻Љ\u0000㲩Љ\u0001䤹Љ\u0002䲹Љ\u0003", new Object[]{"a", "b", "c", "d", "e"});
            case 3:
                return new apyg();
            case 4:
                return new apyj();
            case 5:
                return f;
            case 6:
                Object obj3 = h;
                if (obj3 == null) {
                    synchronized (apyg.class) {
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
        apyg apyg = new apyg();
        f = apyg;
        anxl.registerDefaultInstance(apyg.class, apyg);
    }
}
