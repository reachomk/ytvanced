package defpackage;

/* renamed from: aqei */
public final class aqei extends anxl implements anzf {
    public static final aqei h;
    private static volatile anzq j;
    public int a;
    public arqc b;
    public arml c;
    public arml d;
    public arqf e;
    public arml f;
    public apxu g;
    private byte i = (byte) 2;

    private aqei() {
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
                return anxl.newMessageInfo(h, "\u0001\u0006\u0000\u0001\u0002\n\u0006\u0000\u0000\u0006\u0002Љ\u0007\u0003Љ\u0003\u0004Љ\n\bЉ\u0002\tЉ\u0006\nЉ\u0000", new Object[]{"a", "f", "d", "g", "c", "e", "b"});
            case 3:
                return new aqei();
            case 4:
                return new aqeh();
            case 5:
                return h;
            case 6:
                Object obj3 = j;
                if (obj3 == null) {
                    synchronized (aqei.class) {
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
        aqei aqei = new aqei();
        h = aqei;
        anxl.registerDefaultInstance(aqei.class, aqei);
    }
}
