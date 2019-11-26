package defpackage;

/* renamed from: auus */
public final class auus extends anxl implements anzf {
    public static final auus p;
    private static volatile anzq r;
    public int a;
    public arml b;
    public anyd c = anxl.emptyProtobufList();
    public aygk d;
    public aygk e;
    public arwf f;
    public arml g;
    public anyd h;
    public aphj i;
    public aphj j;
    public aygk k;
    public axak l;
    public axak m;
    public apxu n;
    public anvu o;
    private byte q = (byte) 2;

    private auus() {
        anxl.emptyProtobufList();
        this.h = anxl.emptyProtobufList();
        this.o = anvu.a;
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.q);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.q = b;
                return null;
            case 2:
                return anxl.newMessageInfo(p, "\u0001\u000e\u0000\u0001\u0001\u0010\u000e\u0000\u0002\f\u0001Љ\u0000\u0003Љ\u0001\u0004Љ\u0002\u0005\t\u0003\u0006Љ\u0004\u0007Љ\u0005\t\n\f\nЉ\u0006\u000bЛ\fЛ\rЉ\u0007\u000eЉ\b\u000fЉ\t\u0010Љ\n", new Object[]{"a", "b", "d", "e", "f", "g", "i", "o", "j", "c", arml.class, "h", arml.class, "k", "l", "m", "n"});
            case 3:
                return new auus();
            case 4:
                return new auur();
            case 5:
                return p;
            case 6:
                Object obj3 = r;
                if (obj3 == null) {
                    synchronized (auus.class) {
                        obj3 = r;
                        if (obj3 == null) {
                            obj3 = new anxn(p);
                            r = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        auus auus = new auus();
        p = auus;
        anxl.registerDefaultInstance(auus.class, auus);
    }
}
