package defpackage;

/* renamed from: azaj */
public final class azaj extends anxl implements anzf {
    public static final azaj h;
    private static volatile anzq j;
    public int a;
    public anyd b = anxl.emptyProtobufList();
    public anvu c = anvu.a;
    public anyd d = anxl.emptyProtobufList();
    public anyd e = anxl.emptyProtobufList();
    public azai f;
    public anyd g;
    private byte i = (byte) 2;

    private azaj() {
        anxl.emptyProtobufList();
        this.g = anxl.emptyProtobufList();
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
                return anxl.newMessageInfo(h, "\u0001\u0006\u0000\u0001\u0001\b\u0006\u0000\u0004\u0001\u0001Л\u0002\n\u0000\u0003\u001a\u0004\u001a\u0006\t\u0001\b\u001b", new Object[]{"a", "b", azag.class, "c", "d", "e", "f", "g", azae.class});
            case 3:
                return new azaj();
            case 4:
                return new azam();
            case 5:
                return h;
            case 6:
                Object obj3 = j;
                if (obj3 == null) {
                    synchronized (azaj.class) {
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
        azaj azaj = new azaj();
        h = azaj;
        anxl.registerDefaultInstance(azaj.class, azaj);
    }
}
