package defpackage;

/* renamed from: arqd */
public final class arqd extends anxl implements anzf {
    public static final arqd i;
    private static volatile anzq k;
    public int a;
    public arml b;
    public aygk c;
    public arml d;
    public apxu e;
    public arml f;
    public arml g;
    public arml h;
    private byte j = (byte) 2;

    private arqd() {
        anxl.emptyProtobufList();
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.j);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.j = b;
                return null;
            case 2:
                return anxl.newMessageInfo(i, "\u0001\u0007\u0000\u0001\u0001\f\u0007\u0000\u0000\u0007\u0001Љ\u0000\u0002Љ\u0001\u0003Љ\u0003\u0005Љ\u0005\u0006Љ\u0006\tЉ\u0007\fЉ\b", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h"});
            case 3:
                return new arqd();
            case 4:
                return new arqg();
            case 5:
                return i;
            case 6:
                Object obj3 = k;
                if (obj3 == null) {
                    synchronized (arqd.class) {
                        obj3 = k;
                        if (obj3 == null) {
                            obj3 = new anxn(i);
                            k = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        arqd arqd = new arqd();
        i = arqd;
        anxl.registerDefaultInstance(arqd.class, arqd);
    }
}
