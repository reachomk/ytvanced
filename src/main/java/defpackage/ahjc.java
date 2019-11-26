package defpackage;

/* renamed from: ahjc */
public final class ahjc extends xbb {
    public final boolean a;
    public String b;
    public String c;
    public final Throwable d;
    public final String e;
    public final String f;
    public final int h;
    private final ahjh i;

    public final boolean c() {
        int ordinal = this.i.ordinal();
        if (ordinal != 1) {
            return ordinal != 2 ? ahje.a(this.h, 3, 2, 5, 6, 7, 13, 11) : false;
        } else {
            return true;
        }
    }

    public ahjc(int i, boolean z, String str) {
        this(i, z, ahjh.UNKNOWN, str, null);
    }

    public ahjc(int i, String str, String str2) {
        this(i, true, ahjh.UNKNOWN, str, null, str2);
    }

    public ahjc(int i, boolean z, String str, String str2, String str3) {
        this(i, z, ahjh.UNKNOWN, str, null, str2, str3);
    }

    public ahjc(ahjh ahjh, String str) {
        this(3, false, ahjh, str, null);
    }

    public ahjc(int i, boolean z, String str, Throwable th) {
        this(i, z, ahjh.UNKNOWN, str, th);
    }

    public ahjc(int i, Throwable th) {
        this(i, true, ahjh.UNKNOWN, null, th);
    }

    private ahjc(int i, boolean z, ahjh ahjh, String str, Throwable th) {
        this(i, z, ahjh, str, th, null);
    }

    public ahjc(int i, boolean z, ahjh ahjh, String str, Throwable th, String str2) {
        this(i, z, ahjh, str, th, str2, null);
    }

    private ahjc(int i, boolean z, ahjh ahjh, String str, Throwable th, String str2, String str3) {
        this.h = i;
        this.a = z;
        this.i = (ahjh) amqw.a((Object) ahjh);
        this.c = str;
        this.d = th;
        this.e = str2;
        this.f = str3;
    }
}
