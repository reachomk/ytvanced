package defpackage;

import android.app.job.JobParameters;
import android.content.Intent;
import android.os.AsyncTask;

/* renamed from: afum */
public final class afum extends AsyncTask {
    private final afuk a;
    private final JobParameters b;

    public afum(afuk afuk, JobParameters jobParameters, aftw aftw) {
        this.a = (afuk) amqw.a((Object) afuk);
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
            Intent a2 = a.a();
            this.a.a(a2.getByteArrayExtra("com.google.android.libraries.youtube.notification.pref.notification_renderer"), a2.getStringExtra("renderer_class_name"));
            aftw.a(this.b, a);
        }
        return null;
    }
}
