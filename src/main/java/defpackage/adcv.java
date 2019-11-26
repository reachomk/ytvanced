package defpackage;

/* renamed from: adcv */
abstract class adcv implements Comparable {
    public long a;

    static adcv a(long j, String str) {
        adcq adcq = new adcq(str);
        adcq.a = j;
        return adcq;
    }

    public abstract String a();

    adcv() {
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        int i;
        adcv adcv = (adcv) obj;
        long j = this.a;
        long j2 = adcv.a;
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
