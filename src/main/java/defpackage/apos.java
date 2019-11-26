package defpackage;

/* renamed from: apos */
public final class apos extends anxl implements anzf {
    public static final apos j;
    private static volatile anzq l;
    public int a;
    public arml b;
    public arml c;
    public arml d;
    public arml e;
    public apou f;
    public arml g;
    public arml h;
    public aphj i;
    private byte k = (byte) 2;

    private apos() {
        anxl.emptyProtobufList();
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.k);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.k = b;
                return null;
            case 2:
                return anxl.newMessageInfo(j, "\u0001\b\u0000\u0001\u0001\u000b\b\u0000\u0000\b\u0001Љ\u0000\u0002Љ\u0001\u0004Љ\u0002\u0006Љ\t\u0007Љ\u0004\tЉ\u0006\nЉ\u0007\u000bЉ\b", new Object[]{"a", "b", "c", "d", "i", "e", "f", "g", "h"});
            case 3:
                return new apos();
            case 4:
                return new apov();
            case 5:
                return j;
            case 6:
                Object obj3 = l;
                if (obj3 == null) {
                    synchronized (apos.class) {
                        obj3 = l;
                        if (obj3 == null) {
                            obj3 = new anxn(j);
                            l = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        apos apos = new apos();
        j = apos;
        anxl.registerDefaultInstance(apos.class, apos);
    }
}
