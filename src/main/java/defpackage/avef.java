package defpackage;

/* renamed from: avef */
public final class avef extends anxl implements anzf {
    public static final avef h;
    private static volatile anzq j;
    public int a;
    public arml b;
    public arml c;
    public arml d;
    public arml e;
    public axak f;
    public apxu g;
    private byte i = (byte) 2;

    private avef() {
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
                return anxl.newMessageInfo(h, "\u0001\u0006\u0000\u0001\u0001\b\u0006\u0000\u0000\u0006\u0001Љ\u0000\u0002Љ\u0001\u0003Љ\u0002\u0004Љ\u0003\u0005Љ\u0004\bЉ\u0005", new Object[]{"a", "b", "c", "d", "e", "f", "g"});
            case 3:
                return new avef();
            case 4:
                return new avee();
            case 5:
                return h;
            case 6:
                Object obj3 = j;
                if (obj3 == null) {
                    synchronized (avef.class) {
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
        avef avef = new avef();
        h = avef;
        anxl.registerDefaultInstance(avef.class, avef);
    }
}
