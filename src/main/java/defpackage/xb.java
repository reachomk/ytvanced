package defpackage;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.media.RemoteControlClient.MetadataEditor;
import android.os.Bundle;
import android.os.Handler;

/* renamed from: xb */
final class xb extends wz {
    xb(Context context, String str, ComponentName componentName, PendingIntent pendingIntent) {
        super(context, str, componentName, pendingIntent);
    }

    public final void a(wv wvVar, Handler handler) {
        super.a(wvVar, handler);
        if (wvVar == null) {
            this.d.setMetadataUpdateListener(null);
            return;
        }
        this.d.setMetadataUpdateListener(new xa(this));
    }

    /* Access modifiers changed, original: final */
    public final int a(long j) {
        int a = super.a(j);
        return (j & 128) != 0 ? a | 512 : a;
    }

    /* Access modifiers changed, original: final */
    public final MetadataEditor a(Bundle bundle) {
        MetadataEditor a = super.a(bundle);
        xs xsVar = this.k;
        if (((xsVar != null ? xsVar.e : 0) & 128) != 0) {
            a.addEditableKey(268435457);
        }
        if (bundle != null) {
            String str = "android.media.metadata.YEAR";
            if (bundle.containsKey(str)) {
                a.putLong(8, bundle.getLong(str));
            }
            str = "android.media.metadata.RATING";
            if (bundle.containsKey(str)) {
                a.putObject(101, bundle.getParcelable(str));
            }
            str = "android.media.metadata.USER_RATING";
            if (bundle.containsKey(str)) {
                a.putObject(268435457, bundle.getParcelable(str));
            }
        }
        return a;
    }
}
