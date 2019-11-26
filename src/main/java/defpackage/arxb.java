package defpackage;

/* renamed from: arxb */
public final class arxb extends anxl implements anzf {
    public static final arxb k;
    private static volatile anzq m;
    public int a;
    public aygk b;
    public apdx c;
    public apdx d;
    public apdx e;
    public arml f;
    public arml g;
    public apxu h;
    public anvu i = anvu.a;
    public anyd j = anxl.emptyProtobufList();
    private byte l = (byte) 2;

    private arxb() {
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
                return anxl.newMessageInfo(k, "\u0001\t\u0000\u0001\u0001\u0010\t\u0000\u0001\u0007\u0001Љ\u0000\u0002Љ\u0004\u0003Љ\u0005\t\n\b\fЉ\u0006\rЉ\u0002\u000e\u001b\u000fЉ\u0001\u0010Љ\u0003", new Object[]{"a", "b", "f", "g", "i", "h", "d", "j", aule.class, "c", "e"});
            case 3:
                return new arxb();
            case 4:
                return new arxe();
            case 5:
                return k;
            case 6:
                Object obj3 = m;
                if (obj3 == null) {
                    synchronized (arxb.class) {
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
        arxb arxb = new arxb();
        k = arxb;
        anxl.registerDefaultInstance(arxb.class, arxb);
    }
}
