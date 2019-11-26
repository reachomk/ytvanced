package defpackage;

/* renamed from: apao */
public final class apao extends anxl implements anzf {
    public static final apao f;
    private static volatile anzq h;
    public int a;
    public aqwx b;
    public ayvi c;
    public aozy d;
    public avls e;
    private byte g = (byte) 2;

    private apao() {
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
                return anxl.newMessageInfo(f, "\u0001\u0004\u0000\u0001ﱃ᥯ﮣⵇ\u0004\u0000\u0000\u0004ﱃ᥯Љ\u0000︚⌶Љ\u0003⨅Љ\u0001ﮣⵇЉ\u0002", new Object[]{"a", "b", "e", "c", "d"});
            case 3:
                return new apao();
            case 4:
                return new apar();
            case 5:
                return f;
            case 6:
                Object obj3 = h;
                if (obj3 == null) {
                    synchronized (apao.class) {
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
        apao apao = new apao();
        f = apao;
        anxl.registerDefaultInstance(apao.class, apao);
    }
}
