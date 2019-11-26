package defpackage;

import android.app.job.JobParameters;
import android.os.AsyncTask;

/* renamed from: afue */
public final class afue extends AsyncTask {
    private final afxn a;
    private final JobParameters b;

    public afue(afxn afxn, JobParameters jobParameters, aftw aftw) {
        this.a = (afxn) amqw.a((Object) afxn);
        this.b = (JobParameters) amqw.a((Object) jobParameters);
        amqw.a((Object) aftw);
    }

    /* Access modifiers changed, original: protected|final|synthetic */
    public final /* synthetic */ Object doInBackground(Object[] objArr) {
        while (!isCancelled()) {
            afty a = aftw.a(this.b);
            if (a == null) {
                break;
            }
            this.a.a(a.a());
            aftw.a(this.b, a);
        }
        return null;
    }
}
