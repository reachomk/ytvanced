package defpackage;

import android.content.pm.PackageManager.NameNotFoundException;
import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.libraries.youtube.offline.developer.DebugOfflineStreamsActivity;

/* renamed from: agkn */
public final /* synthetic */ class agkn implements OnClickListener {
    private final DebugOfflineStreamsActivity a;

    public agkn(DebugOfflineStreamsActivity debugOfflineStreamsActivity) {
        this.a = debugOfflineStreamsActivity;
    }

    public final void onClick(View view) {
        DebugOfflineStreamsActivity debugOfflineStreamsActivity = this.a;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Client Version: ");
        try {
            stringBuilder.append(debugOfflineStreamsActivity.getPackageManager().getPackageInfo(debugOfflineStreamsActivity.getPackageName(), 0).versionName);
        } catch (NameNotFoundException unused) {
            stringBuilder.append("NameNotFoundException");
        }
        String str = "\n";
        stringBuilder.append(str);
        agvz b = ((agwc) debugOfflineStreamsActivity.c.get()).b();
        for (agqy agqy : b.k().a()) {
            String a = agqy.a();
            StringBuilder stringBuilder2 = new StringBuilder(String.valueOf(a).length() + 11);
            stringBuilder2.append("Video Id: ");
            stringBuilder2.append(a);
            stringBuilder2.append(str);
            stringBuilder.append(stringBuilder2.toString());
            a = agqy.a(debugOfflineStreamsActivity);
            stringBuilder2 = new StringBuilder(String.valueOf(a).length() + 8);
            stringBuilder2.append("Title: ");
            stringBuilder2.append(a);
            stringBuilder2.append(str);
            stringBuilder.append(stringBuilder2.toString());
            long j = agqy.f;
            stringBuilder2 = new StringBuilder(38);
            stringBuilder2.append("Saved Timestamp: ");
            stringBuilder2.append(j);
            stringBuilder2.append(str);
            stringBuilder.append(stringBuilder2.toString());
            boolean n = agqy.n();
            StringBuilder stringBuilder3 = new StringBuilder(22);
            stringBuilder3.append("Stream Complete:");
            stringBuilder3.append(n);
            stringBuilder3.append(str);
            stringBuilder.append(stringBuilder3.toString());
            if (agqy.n()) {
                agqn a2 = b.p().a(agqy.a(), 0);
                if (a2 == null) {
                    stringBuilder.append("No cached content found.\n");
                } else {
                    agql agql = a2.a;
                    if (agql != null) {
                        debugOfflineStreamsActivity.a(stringBuilder, b, agql);
                    }
                    agql agql2 = a2.b;
                    if (agql2 != null) {
                        debugOfflineStreamsActivity.a(stringBuilder, b, agql2);
                    }
                }
            }
        }
        agkw.a(debugOfflineStreamsActivity, stringBuilder.toString());
    }
}
