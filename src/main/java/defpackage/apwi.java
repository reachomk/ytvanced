package defpackage;

/* renamed from: apwi */
public final class apwi extends anxl implements anzf {
    public static final apwi f;
    private static volatile anzq h;
    public int a;
    public arml b;
    public anyd c = anxl.emptyProtobufList();
    public anvu d = anvu.a;
    public anyd e = anxl.emptyProtobufList();
    private byte g = (byte) 2;

    private apwi() {
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
                return anxl.newMessageInfo(f, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0002\u0003\u0001Љ\u0000\u0002Л\u0004\n\u0002\u0005Л", new Object[]{"a", "b", "c", apwe.class, "d", "e", aphj.class});
            case 3:
                return new apwi();
            case 4:
                return new apwh();
            case 5:
                return f;
            case 6:
                Object obj3 = h;
                if (obj3 == null) {
                    synchronized (apwi.class) {
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
        apwi apwi = new apwi();
        f = apwi;
        anxl.registerDefaultInstance(apwi.class, apwi);
    }
}
