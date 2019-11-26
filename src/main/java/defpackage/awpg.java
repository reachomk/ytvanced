package defpackage;

/* renamed from: awpg */
public final class awpg extends anxl implements anzf {
    public static final awpg i;
    private static volatile anzq k;
    public int a;
    public arml b;
    public arml c;
    public arml d;
    public apxu e;
    public aphj f;
    public auvr g;
    public aojc h;
    private byte j = (byte) 2;

    private awpg() {
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
                return anxl.newMessageInfo(i, "\u0001\u0007\u0000\u0001\u0002\u0010\u0007\u0000\u0000\u0007\u0002Љ\u0001\u0004Љ\u0003\u0005Љ\u0004\u0006Љ\u0005\bЉ\u0006\tЉ\u0007\u0010Љ\f", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h"});
            case 3:
                return new awpg();
            case 4:
                return new awpj();
            case 5:
                return i;
            case 6:
                Object obj3 = k;
                if (obj3 == null) {
                    synchronized (awpg.class) {
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
        awpg awpg = new awpg();
        i = awpg;
        anxl.registerDefaultInstance(awpg.class, awpg);
    }
}
