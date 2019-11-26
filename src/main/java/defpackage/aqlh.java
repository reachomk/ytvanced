package defpackage;

/* renamed from: aqlh */
public final class aqlh extends anxl implements anzf {
    public static final aqlh h;
    private static volatile anzq j;
    public int a;
    public arml b;
    public arwf c;
    public aqkz d;
    public anvu e = anvu.a;
    public aqld f;
    public apxu g;
    private byte i = (byte) 2;

    private aqlh() {
        anxl.emptyProtobufList();
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
                return anxl.newMessageInfo(h, "\u0001\u0006\u0000\u0001\u0001\u000b\u0006\u0000\u0000\u0002\u0001Љ\u0000\u0002\t\u0001\u0003\t\u0002\u0005\n\u0004\t\t\u0007\u000bЉ\t", new Object[]{"a", "b", "c", "d", "e", "f", "g"});
            case 3:
                return new aqlh();
            case 4:
                return new aqlg();
            case 5:
                return h;
            case 6:
                Object obj3 = j;
                if (obj3 == null) {
                    synchronized (aqlh.class) {
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
        aqlh aqlh = new aqlh();
        h = aqlh;
        anxl.registerDefaultInstance(aqlh.class, aqlh);
    }
}
