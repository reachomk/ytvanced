package defpackage;

/* renamed from: aryt */
public final class aryt extends anxl implements anzf {
    public static final aryt h;
    private static volatile anzq j;
    public int a;
    public apxu b;
    public arml c;
    public arml d;
    public arml e;
    public aryr f;
    public aryv g;
    private byte i = (byte) 2;

    private aryt() {
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
                return anxl.newMessageInfo(h, "\u0001\u0006\u0000\u0001\u0003\u000b\u0006\u0000\u0000\u0006\u0003Љ\u0002\u0004Љ\u0004\u0005Љ\u0005\u0006Љ\u0006\u0007Љ\b\u000bЉ\u0003", new Object[]{"a", "b", "d", "e", "f", "g", "c"});
            case 3:
                return new aryt();
            case 4:
                return new aryw();
            case 5:
                return h;
            case 6:
                Object obj3 = j;
                if (obj3 == null) {
                    synchronized (aryt.class) {
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
        aryt aryt = new aryt();
        h = aryt;
        anxl.registerDefaultInstance(aryt.class, aryt);
    }
}
