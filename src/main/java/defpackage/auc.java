package defpackage;

import android.app.PendingIntent;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.IBinder;

/* renamed from: auc */
public final class auc {
    public final Intent a;
    public Bundle b;
    public boolean c;

    public auc() {
        this(null);
    }

    public auc(auh auh) {
        this.a = new Intent("android.intent.action.VIEW");
        IBinder iBinder = null;
        this.b = null;
        this.c = true;
        if (auh != null) {
            this.a.setPackage(auh.b.getPackageName());
        }
        Bundle bundle = new Bundle();
        if (auh != null) {
            iBinder = auh.a.asBinder();
        }
        bundle.putBinder("android.support.customtabs.extra.SESSION", iBinder);
        this.a.putExtras(bundle);
    }

    public final auc a(int i) {
        this.a.putExtra("android.support.customtabs.extra.TOOLBAR_COLOR", i);
        return this;
    }

    public final auc a(Bitmap bitmap) {
        this.a.putExtra("android.support.customtabs.extra.CLOSE_BUTTON_ICON", bitmap);
        return this;
    }

    public final auc a(boolean z) {
        this.a.putExtra("android.support.customtabs.extra.TITLE_VISIBILITY", z);
        return this;
    }

    public final auc a(Bitmap bitmap, String str, PendingIntent pendingIntent, boolean z) {
        Bundle bundle = new Bundle();
        bundle.putInt("android.support.customtabs.customaction.ID", 0);
        bundle.putParcelable("android.support.customtabs.customaction.ICON", bitmap);
        bundle.putString("android.support.customtabs.customaction.DESCRIPTION", str);
        bundle.putParcelable("android.support.customtabs.customaction.PENDING_INTENT", pendingIntent);
        this.a.putExtra("android.support.customtabs.extra.ACTION_BUTTON_BUNDLE", bundle);
        this.a.putExtra("android.support.customtabs.extra.TINT_ACTION_BUTTON", z);
        return this;
    }

    public final aud a() {
        this.a.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", this.c);
        return new aud(this.a, this.b);
    }
}
