package defpackage;

/* renamed from: apkz */
public final class apkz extends anxl implements anzf {
    public static final apkz j;
    private static volatile anzq l;
    public int a;
    public arml b;
    public String c;
    public boolean d;
    public arml e;
    public String f;
    public boolean g;
    public anyd h;
    public arml i;
    private byte k = (byte) 2;

    private apkz() {
        String str = "";
        this.c = str;
        this.d = true;
        this.f = str;
        this.g = true;
        this.h = anxl.emptyProtobufList();
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.k);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.k = b;
                return null;
            case 2:
                return anxl.newMessageInfo(j, "\u0001\b\u0000\u0001\u0002\u000b\b\u0000\u0001\u0004\u0002Љ\u0001\u0003\b\u0002\u0004\u0007\u0003\u0006Љ\u0005\u0007\b\u0006\b\u0007\u0007\nЛ\u000bЉ\t", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", arml.class, "i"});
            case 3:
                return new apkz();
            case 4:
                return new apky();
            case 5:
                return j;
            case 6:
                Object obj3 = l;
                if (obj3 == null) {
                    synchronized (apkz.class) {
                        obj3 = l;
                        if (obj3 == null) {
                            obj3 = new anxn(j);
                            l = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        apkz apkz = new apkz();
        j = apkz;
        anxl.registerDefaultInstance(apkz.class, apkz);
    }
}
