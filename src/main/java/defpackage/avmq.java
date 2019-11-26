package defpackage;

/* renamed from: avmq */
public final class avmq extends anxl implements anzf {
    public static final avmq k;
    private static volatile anzq m;
    public int a;
    public arml b;
    public arml c;
    public anyd d = anxl.emptyProtobufList();
    public anyd e = anxl.emptyProtobufList();
    public apxu f;
    public String g = "";
    public int h;
    public aygk i;
    public auvr j;
    private byte l = (byte) 2;

    private avmq() {
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
                return anxl.newMessageInfo(k, "\u0001\t\u0000\u0001\u0001\n\t\u0000\u0002\u0007\u0001Љ\u0000\u0002Љ\u0001\u0003Л\u0004Л\u0005Љ\u0002\u0007\b\u0003\b\f\u0004\tЉ\u0005\nЉ\u0006", new Object[]{"a", "b", "c", "d", arml.class, "e", aygk.class, "f", "g", "h", apgw.a(), "i", "j"});
            case 3:
                return new avmq();
            case 4:
                return new avmt();
            case 5:
                return k;
            case 6:
                Object obj3 = m;
                if (obj3 == null) {
                    synchronized (avmq.class) {
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

    public static anzq a() {
        return k.getParserForType();
    }

    static {
        avmq avmq = new avmq();
        k = avmq;
        anxl.registerDefaultInstance(avmq.class, avmq);
    }
}
