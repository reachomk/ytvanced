package defpackage;

/* renamed from: aoct */
public final class aoct extends anxl implements anzf {
    public static final aoct d;
    private static volatile anzq f;
    public int a;
    public int b;
    public anyd c = anxl.emptyProtobufList();
    private byte e = (byte) 2;

    private aoct() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.e);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.e = b;
                return null;
            case 2:
                return anxl.newMessageInfo(d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0002\u0001ԋ\u0000\u0002Л", new Object[]{"a", "b", "c", aocr.class});
            case 3:
                return new aoct();
            case 4:
                return new aocw();
            case 5:
                return d;
            case 6:
                Object obj3 = f;
                if (obj3 == null) {
                    synchronized (aoct.class) {
                        obj3 = f;
                        if (obj3 == null) {
                            obj3 = new anxn(d);
                            f = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        aoct aoct = new aoct();
        d = aoct;
        anxl.registerDefaultInstance(aoct.class, aoct);
    }
}
