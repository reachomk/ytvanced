package defpackage;

/* renamed from: avlm */
public final class avlm extends anxl implements anzf {
    public static final avlm l;
    private static volatile anzq n;
    public int a;
    public arml b;
    public arml c;
    public arml d;
    public arml e;
    public arml f;
    public apxu g;
    public apxu h;
    public apxu i;
    public axak j;
    public apxu k;
    private byte m = (byte) 2;

    private avlm() {
        anxl.emptyProtobufList();
        anxl.emptyProtobufList();
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.m);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.m = b;
                return null;
            case 2:
                return anxl.newMessageInfo(l, "\u0001\n\u0000\u0001\u0003\u001d\n\u0000\u0000\n\u0003Љ\u0002\u0004Љ\u0004\u0005Љ\u0006\u0006Љ\u0007\nЉ\b\u000eЉ\u0012\u000fЉ\u0003\u0011Љ\u0005\u001bЉ\u0017\u001dЉ\u0018", new Object[]{"a", "b", "d", "f", "g", "h", "i", "c", "e", "j", "k"});
            case 3:
                return new avlm();
            case 4:
                return new avlp();
            case 5:
                return l;
            case 6:
                Object obj3 = n;
                if (obj3 == null) {
                    synchronized (avlm.class) {
                        obj3 = n;
                        if (obj3 == null) {
                            obj3 = new anxn(l);
                            n = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        avlm avlm = new avlm();
        l = avlm;
        anxl.registerDefaultInstance(avlm.class, avlm);
    }
}
