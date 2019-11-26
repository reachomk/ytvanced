package defpackage;

/* renamed from: avoq */
public final class avoq extends anxl implements anzf {
    public static final avoq k;
    private static volatile anzq m;
    public int a;
    public String b;
    public aygk c;
    public avnc d;
    public anyd e;
    public String f;
    public String g;
    public long h;
    public anyd i;
    public boolean j;
    private byte l = (byte) 2;

    private avoq() {
        String str = "";
        this.b = str;
        this.e = anxl.emptyProtobufList();
        this.f = str;
        this.g = str;
        this.i = anxl.emptyProtobufList();
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
                return anxl.newMessageInfo(k, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0002\u0004\u0001\b\u0000\u0002Љ\u0001\u0003Љ\u0002\u0004Л\u0005\b\u0003\u0006\b\u0004\u0007\u0002\u0005\bЛ\t\u0007\u0006", new Object[]{"a", "b", "c", "d", "e", avrg.class, "f", "g", "h", "i", avoo.class, "j"});
            case 3:
                return new avoq();
            case 4:
                return new avop();
            case 5:
                return k;
            case 6:
                Object obj3 = m;
                if (obj3 == null) {
                    synchronized (avoq.class) {
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
        avoq avoq = new avoq();
        k = avoq;
        anxl.registerDefaultInstance(avoq.class, avoq);
    }
}
