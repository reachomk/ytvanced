package defpackage;

/* renamed from: atna */
public final class atna extends anxl implements anzf {
    public static final atna h;
    private static volatile anzq i;
    public int a;
    public atmu b;
    public anyd c = anxl.emptyProtobufList();
    public anyd d = anxl.emptyProtobufList();
    public anyd e = anxl.emptyProtobufList();
    public anyd f = anxl.emptyProtobufList();
    public anyd g = anxl.emptyProtobufList();

    private atna() {
        anxl.emptyProtobufList();
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf((byte) 1);
            case 1:
                return null;
            case 2:
                return anxl.newMessageInfo(h, "\u0001\u0006\u0000\u0001\u0001\u000b\u0006\u0000\u0005\u0000\u0001\t\u0000\u0007\u001a\b\u001b\t\u001b\n\u001b\u000b\u001b", new Object[]{"a", "b", "c", "d", atns.class, "e", atnc.class, "f", atmy.class, "g", astv.class});
            case 3:
                return new atna();
            case 4:
                return new atmz();
            case 5:
                return h;
            case 6:
                Object obj3 = i;
                if (obj3 == null) {
                    synchronized (atna.class) {
                        obj3 = i;
                        if (obj3 == null) {
                            obj3 = new anxn(h);
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
        atna atna = new atna();
        h = atna;
        anxl.registerDefaultInstance(atna.class, atna);
    }
}
