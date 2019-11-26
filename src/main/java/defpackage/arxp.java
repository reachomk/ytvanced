package defpackage;

/* renamed from: arxp */
public final class arxp extends anxl implements anzf {
    public static final arxp k;
    private static volatile anzq m;
    public int a;
    public aygk b;
    public arml c;
    public arml d;
    public boolean e;
    public arwr f;
    public arml g;
    public apxu h;
    public anyd i = anxl.emptyProtobufList();
    public anvu j = anvu.a;
    private byte l = (byte) 2;

    private arxp() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.l);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.l = b;
                return null;
            case 2:
                return anxl.newMessageInfo(k, "\u0001\t\u0000\u0001\u0001\u0010\t\u0000\u0001\u0006\u0001Љ\u0000\u0002Љ\u0001\u0004Љ\u0004\b\n\b\tЉ\u0002\n\u0007\u0003\u000e\u001b\u000fЉ\u0005\u0010Љ\u0006", new Object[]{"a", "b", "c", "f", "j", "d", "e", "i", aule.class, "g", "h"});
            case 3:
                return new arxp();
            case 4:
                return new arxs();
            case 5:
                return k;
            case 6:
                Object obj3 = m;
                if (obj3 == null) {
                    synchronized (arxp.class) {
                        obj3 = m;
                        if (obj3 == null) {
                            obj3 = new anxn(k);
                            m = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        arxp arxp = new arxp();
        k = arxp;
        anxl.registerDefaultInstance(arxp.class, arxp);
    }
}
