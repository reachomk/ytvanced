package defpackage;

import android.app.job.JobParameters;

/* renamed from: pfu */
final class pfu implements pfb {
    public final /* synthetic */ Integer a;
    public final /* synthetic */ pfm b;
    public final /* synthetic */ JobParameters c;
    public final /* synthetic */ pfr d;

    pfu(pfr pfr, Integer num, pfm pfm, JobParameters jobParameters) {
        this.d = pfr;
        this.a = num;
        this.b = pfm;
        this.c = jobParameters;
    }

    public final void a() {
        this.d.a.post(new pft(this));
    }
}
