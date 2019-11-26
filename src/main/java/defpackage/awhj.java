package defpackage;

/* renamed from: awhj */
public final class awhj extends anxl implements anzf {
    public static final awhj h;
    private static volatile anzq j;
    public int a;
    public apxu b;
    public apxu c;
    public apxu d;
    public arml e;
    public arml f;
    public awhl g;
    private byte i = (byte) 2;

    private awhj() {
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
                return anxl.newMessageInfo(h, "\u0001\u0006\u0000\u0001\u0002\u000b\u0006\u0000\u0000\u0006\u0002Љ\u0001\u0003Љ\u0002\u0004Љ\u0003\bЉ\u0007\tЉ\b\u000bЉ\n", new Object[]{"a", "b", "c", "d", "e", "f", "g"});
            case 3:
                return new awhj();
            case 4:
                return new awhi();
            case 5:
                return h;
            case 6:
                Object obj3 = j;
                if (obj3 == null) {
                    synchronized (awhj.class) {
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
        awhj awhj = new awhj();
        h = awhj;
        anxl.registerDefaultInstance(awhj.class, awhj);
    }
}
