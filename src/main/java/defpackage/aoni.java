package defpackage;

/* renamed from: aoni */
public final class aoni extends anxl implements anzf {
    public static final aoni c;
    private static volatile anzq e;
    public anyd a = anxl.emptyProtobufList();
    public anyd b = anxl.emptyProtobufList();
    private byte d = (byte) 2;

    private aoni() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.d);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.d = b;
                return null;
            case 2:
                return anxl.newMessageInfo(c, "\u0001\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0002\u0001Л\u0002Л", new Object[]{"a", aong.class, "b", aone.class});
            case 3:
                return new aoni();
            case 4:
                return new aonh();
            case 5:
                return c;
            case 6:
                Object obj3 = e;
                if (obj3 == null) {
                    synchronized (aoni.class) {
                        obj3 = e;
                        if (obj3 == null) {
                            obj3 = new anxn(c);
                            e = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        aoni aoni = new aoni();
        c = aoni;
        anxl.registerDefaultInstance(aoni.class, aoni);
    }
}
