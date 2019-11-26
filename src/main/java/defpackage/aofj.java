package defpackage;

/* renamed from: aofj */
public final class aofj extends anxl implements anzf {
    public static final aofj m;
    private static volatile anzq o;
    public int a;
    public arml b;
    public arml c;
    public aygk d;
    public aygk e;
    public arml f;
    public apxu g;
    public apxu h;
    public apxu i;
    public apxu j;
    public aofh k;
    public anyd l = anxl.emptyProtobufList();
    private byte n = (byte) 2;

    private aofj() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.n);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.n = b;
                return null;
            case 2:
                return anxl.newMessageInfo(m, "\u0001\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0001\u000b\u0001Љ\u0000\u0002Љ\u0002\u0003Љ\u0003\u0004Љ\u0005\u0005Љ\u0006\u0006Љ\t\u0007Л\bЉ\u0007\tЉ\u0001\nЉ\b\u000bЉ\u0004", new Object[]{"a", "b", "d", "e", "g", "h", "k", "l", arml.class, "i", "c", "j", "f"});
            case 3:
                return new aofj();
            case 4:
                return new aofi();
            case 5:
                return m;
            case 6:
                Object obj3 = o;
                if (obj3 == null) {
                    synchronized (aofj.class) {
                        obj3 = o;
                        if (obj3 == null) {
                            obj3 = new anxn(m);
                            o = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        aofj aofj = new aofj();
        m = aofj;
        anxl.registerDefaultInstance(aofj.class, aofj);
    }
}
