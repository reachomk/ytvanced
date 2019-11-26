package defpackage;

/* renamed from: avia */
public final class avia extends anxl implements anzf {
    public static final avia l;
    private static volatile anzq n;
    public int a;
    public arml b;
    public arml c;
    public arml d;
    public arml e;
    public arml f;
    public axak g;
    public axak h;
    public apxu i;
    public apxu j;
    public axak k;
    private byte m = (byte) 2;

    private avia() {
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
                return anxl.newMessageInfo(l, "\u0001\n\u0000\u0001\u0001\u0010\n\u0000\u0000\n\u0001Љ\u0000\u0002Љ\u0001\u0003Љ\u0002\u0004Љ\u0003\u0005Љ\u0005\u0006Љ\t\u000bЉ\u000e\fЉ\n\u000fЉ\u0004\u0010Љ\u0007", new Object[]{"a", "b", "c", "d", "e", "g", "i", "k", "j", "f", "h"});
            case 3:
                return new avia();
            case 4:
                return new avhz();
            case 5:
                return l;
            case 6:
                Object obj3 = n;
                if (obj3 == null) {
                    synchronized (avia.class) {
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
        avia avia = new avia();
        l = avia;
        anxl.registerDefaultInstance(avia.class, avia);
    }
}
