package defpackage;

/* renamed from: awnc */
public final class awnc extends anxl implements anzf {
    public static final awnc l;
    private static volatile anzq n;
    public int a;
    public aygk b;
    public anyd c = anxl.emptyProtobufList();
    public arml d;
    public arml e;
    public arml f;
    public anyd g = anxl.emptyProtobufList();
    public apxu h;
    public auvr i;
    public axak j;
    public anvu k = anvu.a;
    private byte m = (byte) 2;

    private awnc() {
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.m);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.m = b;
                return null;
            case 2:
                return anxl.newMessageInfo(l, "\u0001\n\u0000\u0001\u0001\u000b\n\u0000\u0002\t\u0001Љ\u0000\u0002Л\u0003Љ\u0002\u0004Љ\u0003\u0005Л\u0006Љ\u0004\u0007Љ\u0005\b\n\u0007\nЉ\u0001\u000bЉ\u0006", new Object[]{"a", "b", "c", ayfu.class, "e", "f", "g", apdx.class, "h", "i", "k", "d", "j"});
            case 3:
                return new awnc();
            case 4:
                return new awnf();
            case 5:
                return l;
            case 6:
                Object obj3 = n;
                if (obj3 == null) {
                    synchronized (awnc.class) {
                        obj3 = n;
                        if (obj3 == null) {
                            obj3 = new anxn(l);
                            n = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        awnc awnc = new awnc();
        l = awnc;
        anxl.registerDefaultInstance(awnc.class, awnc);
    }
}
