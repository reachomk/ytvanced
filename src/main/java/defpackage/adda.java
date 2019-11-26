package defpackage;

/* renamed from: adda */
public abstract class adda implements Comparable {
    public long a;

    static adda a(long j, String str, String str2, int i, String str3, boolean z) {
        adcp adcp = new adcp(str, str2, i, str3, z);
        adcp.a = j;
        return adcp;
    }

    public abstract String a();

    public abstract String b();

    public abstract int c();

    public abstract String d();

    public abstract boolean e();

    adda() {
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        int i;
        adda adda = (adda) obj;
        long j = this.a;
        long j2 = adda.a;
        if (j == j2) {
            i = 0;
        } else if (j > j2) {
            return 1;
        } else {
            i = -1;
        }
        return i;
    }
}
