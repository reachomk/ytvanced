package defpackage;

/* renamed from: anen */
public final class anen extends anxl implements anzf {
    public static final anen a;
    private static volatile anzq b;

    private anen() {
        anxl.emptyProtobufList();
        anxl.emptyProtobufList();
        anxl.emptyProtobufList();
        anxl.emptyProtobufList();
        anxl.emptyProtobufList();
        anxl.emptyProtobufList();
        anxl.emptyProtobufList();
        anxl.emptyFloatList();
        anxl.emptyFloatList();
        anxl.emptyFloatList();
        anxl.emptyFloatList();
        anxl.emptyFloatList();
        anxl.emptyFloatList();
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
                return anxl.newMessageInfo(a, "\u0001\u0000", null);
            case 3:
                return new anen();
            case 4:
                return new aneq();
            case 5:
                return a;
            case 6:
                Object obj3 = b;
                if (obj3 == null) {
                    synchronized (anen.class) {
                        obj3 = b;
                        if (obj3 == null) {
                            obj3 = new anxn(a);
                            b = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        anen anen = new anen();
        a = anen;
        anxl.registerDefaultInstance(anen.class, anen);
    }
}
