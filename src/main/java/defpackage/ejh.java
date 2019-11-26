package defpackage;

import android.os.Build.VERSION;
import com.google.android.youtube.R;

/* renamed from: ejh */
final /* synthetic */ class ejh implements amro {
    ejh() {
    }

    public final Object get() {
        if (VERSION.SDK_INT < 26) {
            return amul.g();
        }
        return amul.a(new xls(Integer.toString(1), R.string.subscriptions_notifications_channel, 4, true, false), new xls(Integer.toString(2), R.string.livestream_notifications_channel, 4, true, true), new xls(Integer.toString(3), R.string.comments_notifications_channel, 3, true, false), new xls(Integer.toString(4), R.string.shared_notifications_channel, 4, true, true), new xls(Integer.toString(5), R.string.recommended_notifications_channel, 2, true, false), new xls(Integer.toString(6), R.string.updates_notifications_channel, 2, true, false), new xls(Integer.toString(7), R.string.lock_screen_notifications_channel, 2, false, false));
    }
}
