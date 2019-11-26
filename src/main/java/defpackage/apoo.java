package defpackage;

/* renamed from: apoo */
public final class apoo extends anxl implements anzf {
    public static final apoo p;
    private static volatile anzq r;
    public int a;
    public arml b;
    public apxu c;
    public arml d;
    public arml e;
    public arml f;
    public arml g;
    public arml h;
    public axwz i;
    public apdx j;
    public arml k;
    public aopn l;
    public arml m;
    public arml n;
    public arml o;
    private byte q = (byte) 2;

    private apoo() {
        anxl.emptyProtobufList();
        anxl.emptyProtobufList();
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
                return anxl.newMessageInfo(p, "\u0001\u000e\u0000\u0001\u0002\u001a\u000e\u0000\u0000\u000e\u0002Љ\u0001\u0003Љ\u0002\u0005Љ\u0004\u0006Љ\u0005\u0007Љ\u0007\bЉ\b\nЉ\t\fЉ\u000b\rЉ\f\u000eЉ\r\u0013Љ\u0006\u0015Љ\n\u0019Љ\u0013\u001aЉ\u0014", new Object[]{"a", "b", "c", "d", "e", "g", "h", "i", "k", "l", "m", "f", "j", "n", "o"});
            case 3:
                return new apoo();
            case 4:
                return new apor();
            case 5:
                return p;
            case 6:
                Object obj3 = r;
                if (obj3 == null) {
                    synchronized (apoo.class) {
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
        apoo apoo = new apoo();
        p = apoo;
        anxl.registerDefaultInstance(apoo.class, apoo);
    }
}
