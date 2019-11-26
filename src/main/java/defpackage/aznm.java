package defpackage;

/* renamed from: aznm */
public final class aznm extends anxl implements anzf {
    public static final aznm h;
    private static volatile anzq j;
    public int a;
    public arml b;
    public anyd c = anxl.emptyProtobufList();
    public azny d;
    public azng e;
    public anvu f = anvu.a;
    public aphj g;
    private byte i = (byte) 2;

    private aznm() {
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
                return anxl.newMessageInfo(h, "\u0001\u0006\u0000\u0001\u0001\b\u0006\u0000\u0001\u0005\u0001Љ\u0000\u0002Л\u0004Љ\u0003\u0006\n\u0005\u0007Љ\u0006\bЉ\u0001", new Object[]{"a", "b", "c", arml.class, "e", "f", "g", "d"});
            case 3:
                return new aznm();
            case 4:
                return new aznp();
            case 5:
                return h;
            case 6:
                Object obj3 = j;
                if (obj3 == null) {
                    synchronized (aznm.class) {
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
        aznm aznm = new aznm();
        h = aznm;
        anxl.registerDefaultInstance(aznm.class, aznm);
    }
}
