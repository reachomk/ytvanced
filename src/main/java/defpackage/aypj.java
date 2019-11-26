package defpackage;

/* renamed from: aypj */
public final class aypj extends anxl implements anzf {
    public static final aypj i;
    private static volatile anzq k;
    public int a;
    public arml b;
    public arml c;
    public arml d;
    public auvr e;
    public axkj f;
    public aphj g;
    public axak h;
    private byte j = (byte) 2;

    private aypj() {
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
                return anxl.newMessageInfo(i, "\u0001\u0007\u0000\u0001\u0001\n\u0007\u0000\u0000\u0007\u0001Љ\u0000\u0002Љ\u0001\u0003Љ\u0002\u0004Љ\u0003\u0006Љ\u0005\tЉ\b\nЉ\t", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h"});
            case 3:
                return new aypj();
            case 4:
                return new aypm();
            case 5:
                return i;
            case 6:
                Object obj3 = k;
                if (obj3 == null) {
                    synchronized (aypj.class) {
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
        aypj aypj = new aypj();
        i = aypj;
        anxl.registerDefaultInstance(aypj.class, aypj);
    }
}
