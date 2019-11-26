package defpackage;

/* renamed from: avig */
public final class avig extends anxl implements anzf {
    public static final avig l;
    private static volatile anzq n;
    public int a;
    public arml b;
    public arml c;
    public arml d;
    public arml e;
    public arml f;
    public arml g;
    public atzt h;
    public aphr i;
    public avie j;
    public arml k;
    private byte m = (byte) 2;

    private avig() {
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
                return anxl.newMessageInfo(l, "\u0001\n\u0000\u0001\u0001\u000f\n\u0000\u0000\n\u0001Љ\u0000\u0002Љ\u0001\u0003Љ\u0002\u0005Љ\u0003\u0007Љ\u0004\bЉ\u0005\tЉ\u0006\nЉ\u0007\rЉ\n\u000fЉ\u000b", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k"});
            case 3:
                return new avig();
            case 4:
                return new avif();
            case 5:
                return l;
            case 6:
                Object obj3 = n;
                if (obj3 == null) {
                    synchronized (avig.class) {
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
        avig avig = new avig();
        l = avig;
        anxl.registerDefaultInstance(avig.class, avig);
    }
}
