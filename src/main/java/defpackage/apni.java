package defpackage;

/* renamed from: apni */
public final class apni extends anxl implements anzf {
    public static final apni h;
    private static volatile anzq j;
    public int a;
    public apxu b;
    public apng c;
    public apxu d;
    public aphj e;
    public arml f;
    public arml g;
    private byte i = (byte) 2;

    private apni() {
        anxl.emptyProtobufList();
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
                return anxl.newMessageInfo(h, "\u0001\u0006\u0000\u0001\u0002\n\u0006\u0000\u0000\u0006\u0002Љ\u0001\u0003Љ\u0002\u0004Љ\u0004\bЉ\u0005\tЉ\u0006\nЉ\u0007", new Object[]{"a", "b", "c", "d", "e", "f", "g"});
            case 3:
                return new apni();
            case 4:
                return new apnk();
            case 5:
                return h;
            case 6:
                Object obj3 = j;
                if (obj3 == null) {
                    synchronized (apni.class) {
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
        apni apni = new apni();
        h = apni;
        anxl.registerDefaultInstance(apni.class, apni);
    }
}
