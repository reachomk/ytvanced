package defpackage;

/* renamed from: ariq */
public final class ariq extends anxl implements anzf {
    public static final ariq i;
    private static volatile anzq k;
    public int a;
    public arml b;
    public arml c;
    public apxu d;
    public aygk e;
    public axak f;
    public ario g;
    public anvu h;
    private byte j = (byte) 2;

    private ariq() {
        anxl.emptyProtobufList();
        this.h = anvu.a;
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
                return anxl.newMessageInfo(i, "\u0001\u0007\u0000\u0001\u0001\t\u0007\u0000\u0000\u0006\u0001Љ\u0000\u0002Љ\u0001\u0003Љ\u0002\u0004Љ\u0003\u0005Љ\u0005\u0007\n\u0007\tЉ\u0004", new Object[]{"a", "b", "c", "d", "e", "g", "h", "f"});
            case 3:
                return new ariq();
            case 4:
                return new arit();
            case 5:
                return i;
            case 6:
                Object obj3 = k;
                if (obj3 == null) {
                    synchronized (ariq.class) {
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
        ariq ariq = new ariq();
        i = ariq;
        anxl.registerDefaultInstance(ariq.class, ariq);
    }
}
