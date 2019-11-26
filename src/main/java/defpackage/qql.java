package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Bundle;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import java.util.List;
import java.util.Locale;

/* renamed from: qql */
public final class qql extends qae {
    public final Context a;

    public qql(Context context, Looper looper, pte pte, pth pth, pyp pyp) {
        super(context, looper, 29, pyp, pte, pth);
        this.a = context;
    }

    /* Access modifiers changed, original: protected|final */
    public final String a() {
        return "com.google.android.gms.feedback.internal.IFeedbackService";
    }

    /* Access modifiers changed, original: protected|final */
    public final String b() {
        return "com.google.android.gms.feedback.internal.IFeedbackService";
    }

    public final int c() {
        return 11925000;
    }

    public final psc[] t() {
        return new psc[]{qei.a};
    }

    public final void a(qdx qdx) {
        String str;
        qhb qhb = new qhb();
        if (TextUtils.isEmpty(qdx.g)) {
            qhb.a = this.a.getApplicationContext().getPackageName();
        } else {
            qhb.a = qdx.g;
        }
        try {
            str = this.a.getPackageManager().getPackageInfo(qhb.a, 0).versionName;
        } catch (NameNotFoundException unused) {
            str = null;
        }
        qhb.h = str;
        str = qdx.a;
        if (!(TextUtils.isEmpty(str) || str.equals("anonymous"))) {
            qhb.b = Integer.toString(new Account(str, "com.google").name.toLowerCase(Locale.ENGLISH).hashCode());
        }
        qhb.d = qdx.n;
        qhb.c = "feedback.android";
        qhb.g = psf.b;
        qhb.f = System.currentTimeMillis();
        if (!(qdx.m == null && qdx.f == null)) {
            qhb.k = true;
        }
        Bundle bundle = qdx.b;
        if (bundle != null) {
            qhb.i = bundle.size();
        }
        List list = qdx.h;
        if (list != null && list.size() > 0) {
            qhb.j = qdx.h.size();
        }
        qhb.e = 164;
        Context context = this.a;
        String str2 = "gF_BaseMetricsLogger";
        if (TextUtils.isEmpty(qhb.a)) {
            Log.e(str2, "MetricsData requires appPackageName to be set");
        }
        if (TextUtils.isEmpty(qhb.d)) {
            Log.e(str2, "MetricsData requires sessionId to be set");
        }
        if (TextUtils.isEmpty(qhb.c)) {
            Log.e(str2, "MetricsData requires flow to be set");
        }
        if (qhb.g <= 0) {
            Log.e(str2, "MetricsData requires clientVersion to be set");
        }
        str = "MetricsData requires timestamp to be set";
        if (qhb.f <= 0) {
            Log.e(str2, str);
        }
        if (qhb.e <= 0) {
            Log.e(str2, str);
        }
        context.sendBroadcast(new Intent().setClassName("com.google.android.gms", "com.google.android.gms.chimera.GmsIntentOperationService$GmsExternalReceiver").setAction("com.google.android.gms.googlehelp.metrics.MetricsIntentOperation.LOG_METRIC").putExtra("EXTRA_METRIC_DATA", riu.a((riu) qhb)));
    }
}
