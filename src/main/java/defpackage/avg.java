package defpackage;

import android.database.ContentObserver;
import android.database.Cursor;
import android.os.Handler;

/* renamed from: avg */
final class avg extends ContentObserver {
    private final /* synthetic */ avh a;

    avg(avh avh) {
        this.a = avh;
        super(new Handler());
    }

    public final boolean deliverSelfNotifications() {
        return true;
    }

    public final void onChange(boolean z) {
        avh avh = this.a;
        if (avh.c) {
            Cursor cursor = avh.d;
            if (cursor != null && !cursor.isClosed()) {
                avh.b = avh.d.requery();
            }
        }
    }
}
