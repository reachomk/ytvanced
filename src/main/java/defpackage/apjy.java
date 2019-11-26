package defpackage;

/* renamed from: apjy */
public final class apjy extends anxl implements anzf {
    private static volatile anzq B;
    public static final apjy z;
    private byte A = (byte) 2;
    public int a;
    public arml b;
    public arml c;
    public arml d;
    public arml e;
    public arml f;
    public arml g;
    public arml h;
    public arml i;
    public apkm j;
    public arml k;
    public arml l;
    public arml m;
    public arml n;
    public arml o;
    public apks p;
    public apko q;
    public apkq r;
    public apkg s;
    public apxu t;
    public arml u;
    public apka v;
    public arml w;
    public apkk x;
    public axak y;

    private apjy() {
        anxl.emptyProtobufList();
        anxl.emptyProtobufList();
        anxl.emptyProtobufList();
        anxl.emptyProtobufList();
    }

    /* Access modifiers changed, original: protected|final */
    public final Object dynamicMethod(anxu anxu, Object obj, Object obj2) {
        byte b = (byte) 1;
        switch (anxu.ordinal()) {
            case 0:
                return Byte.valueOf(this.A);
            case 1:
                if (obj == null) {
                    b = (byte) 0;
                }
                this.A = b;
                return null;
            case 2:
                return anxl.newMessageInfo(z, "\u0001\u0018\u0000\u0001\u0001%\u0018\u0000\u0000\u0018\u0001Љ\u0004\u0004Љ\u000e\u0005Љ\u000f\u0006Љ\u0010\u0007Љ\u0011\bЉ\u0012\tЉ\u0013\nЉ\u0014\fЉ\u0015\u0012Љ\u001d\u0013Љ\u0000\u0015Љ\n\u0016Љ\u000b\u0018Љ\u001a\u0019Љ\u001b\u001aЉ\u0003\u001bЉ\u0017\u001cЉ\f\u001dЉ\r\u001eЉ\t\u001fЉ\u0006 Љ\u0005$Љ\u001e%Љ\u0007", new Object[]{"a", "d", "m", "n", "o", "p", "q", "r", "s", "t", "x", "b", "i", "j", "v", "w", "c", "u", "k", "l", "h", "f", "e", "y", "g"});
            case 3:
                return new apjy();
            case 4:
                return new apjx();
            case 5:
                return z;
            case 6:
                Object obj3 = B;
                if (obj3 == null) {
                    synchronized (apjy.class) {
                        obj3 = B;
                        if (obj3 == null) {
                            obj3 = new anxn(z);
                            B = obj3;
                        }
                    }
                }
                return obj3;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        apjy apjy = new apjy();
        z = apjy;
        anxl.registerDefaultInstance(apjy.class, apjy);
    }
}
