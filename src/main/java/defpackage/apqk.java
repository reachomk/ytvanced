package defpackage;

/* renamed from: apqk */
public final class apqk extends anxl implements anzf {
    public static final apqk h;
    private static volatile anzq j;
    public int a;
    public arml b;
    public arml c;
    public arml d;
    public arml e;
    public arml f;
    public apdx g;
    private byte i = (byte) 2;

    private apqk() {
        anxl.emptyProtobufList();
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
                return anxl.newMessageInfo(h, "\u0001\u0006\u0000\u0001\u0002\b\u0006\u0000\u0000\u0006\u0002Љ\u0001\u0003Љ\u0002\u0004Љ\u0003\u0005Љ\u0004\u0006Љ\u0005\bЉ\u0006", new Object[]{"a", "b", "c", "d", "e", "f", "g"});
            case 3:
                return new apqk();
            case 4:
                return new apqn();
            case 5:
                return h;
            case 6:
                Object obj3 = j;
                if (obj3 == null) {
                    synchronized (apqk.class) {
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
        apqk apqk = new apqk();
        h = apqk;
        anxl.registerDefaultInstance(apqk.class, apqk);
    }
}
