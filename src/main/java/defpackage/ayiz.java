package defpackage;

/* renamed from: ayiz */
public final class ayiz extends anxl implements anzf {
    public static final ayiz i;
    private static volatile anzq k;
    public int a;
    public arml b;
    public arml c;
    public arml d;
    public arml e;
    public apxu f;
    public apxu g;
    public auvr h;
    private byte j = (byte) 2;

    private ayiz() {
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
                return anxl.newMessageInfo(i, "\u0001\u0007\u0000\u0001\u0003\u000e\u0007\u0000\u0000\u0007\u0003Љ\u0002\u0004Љ\u0003\u0005Љ\u0004\u0007Љ\u0006\u000bЉ\u0007\fЉ\u0005\u000eЉ\n", new Object[]{"a", "b", "c", "d", "f", "g", "e", "h"});
            case 3:
                return new ayiz();
            case 4:
                return new ayiy();
            case 5:
                return i;
            case 6:
                Object obj3 = k;
                if (obj3 == null) {
                    synchronized (ayiz.class) {
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
        ayiz ayiz = new ayiz();
        i = ayiz;
        anxl.registerDefaultInstance(ayiz.class, ayiz);
    }
}
