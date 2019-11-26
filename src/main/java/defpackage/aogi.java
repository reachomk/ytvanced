package defpackage;

/* renamed from: aogi */
public final class aogi extends anxl implements anzf {
    public static final aogi h;
    private static volatile anzq j;
    public int a;
    public int b;
    public anyd c = anxl.emptyProtobufList();
    public int d;
    public String e = "";
    public anyd f = anxl.emptyProtobufList();
    public anyd g = anxl.emptyProtobufList();
    private byte i = (byte) 2;

    private aogi() {
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
                return anxl.newMessageInfo(h, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0003\u0001\u0001\u000b\u0000\u0002Л\u0003\f\u0001\u0004\b\u0002\u0006\u001b\u0007\u001b", new Object[]{"a", "b", "c", aogm.class, "d", aogk.a, "e", "f", aojo.class, "g", aojo.class});
            case 3:
                return new aogi();
            case 4:
                return new aogj();
            case 5:
                return h;
            case 6:
                Object obj3 = j;
                if (obj3 == null) {
                    synchronized (aogi.class) {
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
        aogi aogi = new aogi();
        h = aogi;
        anxl.registerDefaultInstance(aogi.class, aogi);
    }
}
