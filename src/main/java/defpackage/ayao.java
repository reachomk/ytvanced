package defpackage;

/* renamed from: ayao */
public final class ayao extends anxl implements anzf {
    public static final ayao n;
    private static volatile anzq p;
    public int a;
    public ayau b;
    public anyd c = anxl.emptyProtobufList();
    public arml d;
    public arml e;
    public apxu f;
    public aphj g;
    public aphj h;
    public apxu i;
    public anyd j;
    public int k;
    public ayay l;
    public int m;
    private byte o = (byte) 2;

    private ayao() {
        anxl.emptyProtobufList();
        this.j = anxl.emptyProtobufList();
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.o);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.o = b;
                return null;
            case 2:
                return anxl.newMessageInfo(n, "\u0001\f\u0000\u0001\u0001\u0012\f\u0000\u0002\b\u0001Љ\u0001\u0002Л\u0005Љ\u0002\u0006Љ\u0003\t\f\f\nЛ\u000b\t\u0000\rЉ\u0006\u000fЉ\u0004\u0010Љ\u0005\u0011\t\r\u0012\u0004\u000f", new Object[]{"a", "d", "j", ayas.class, "e", "f", "k", ayat.a, "c", ayak.class, "b", "i", "g", "h", "l", "m"});
            case 3:
                return new ayao();
            case 4:
                return new ayar();
            case 5:
                return n;
            case 6:
                Object obj3 = p;
                if (obj3 == null) {
                    synchronized (ayao.class) {
                        obj3 = p;
                        if (obj3 == null) {
                            obj3 = new anxn(n);
                            p = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        ayao ayao = new ayao();
        n = ayao;
        anxl.registerDefaultInstance(ayao.class, ayao);
    }
}
