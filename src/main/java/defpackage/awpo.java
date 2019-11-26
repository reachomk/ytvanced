package defpackage;

/* renamed from: awpo */
public final class awpo extends anxl implements anzf {
    public static final awpo i;
    private static volatile anzq k;
    public int a;
    public arml b;
    public axak c;
    public axak d;
    public apxu e;
    public apxu f;
    public axak g;
    public arml h;
    private byte j = (byte) 2;

    private awpo() {
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
                return anxl.newMessageInfo(i, "\u0001\u0007\u0000\u0001\u0001\u000f\u0007\u0000\u0000\u0007\u0001Љ\u0000\u0004Љ\u0003\bЉ\u0007\tЉ\b\u000bЉ\t\fЉ\n\u000fЉ\r", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h"});
            case 3:
                return new awpo();
            case 4:
                return new awpr();
            case 5:
                return i;
            case 6:
                Object obj3 = k;
                if (obj3 == null) {
                    synchronized (awpo.class) {
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
        awpo awpo = new awpo();
        i = awpo;
        anxl.registerDefaultInstance(awpo.class, awpo);
    }
}
