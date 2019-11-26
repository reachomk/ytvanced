package defpackage;

import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;

/* renamed from: axk */
final class axk extends ContentObserver {
    private final /* synthetic */ axi a;

    axk(axi axi, Handler handler) {
        this.a = axi;
        super(handler);
    }

    public final void onChange(boolean z, Uri uri) {
        this.a.a();
    }
}
