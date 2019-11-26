package defpackage;

import com.google.android.apps.youtube.app.livechat.settings.LiveChatFragment;
import com.google.android.apps.youtube.app.settings.AboutPrefsFragment;
import com.google.android.apps.youtube.app.settings.AutoplayPrefsFragment;
import com.google.android.apps.youtube.app.settings.BillingsAndPaymentsPrefsFragment;
import com.google.android.apps.youtube.app.settings.GeneralPrefsFragment;
import com.google.android.apps.youtube.app.settings.NotificationPrefsFragment;
import com.google.android.apps.youtube.app.settings.OfflinePrefsFragment;
import com.google.android.apps.youtube.app.settings.PrivacyPrefsFragment;
import java.util.AbstractMap.SimpleImmutableEntry;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: jbm */
public final class jbm {
    public static final Map a = amur.e().a(jbm.a(10009, AboutPrefsFragment.class)).a(jbm.a(10014, OfflinePrefsFragment.class)).a(jbm.a(10001, NotificationPrefsFragment.class)).a(jbm.a(10029, PrivacyPrefsFragment.class)).a(jbm.a(10034, LiveChatFragment.class)).a(jbm.a(10048, BillingsAndPaymentsPrefsFragment.class)).a(jbm.a(10050, GeneralPrefsFragment.class)).a(jbm.a(10058, AutoplayPrefsFragment.class)).b();

    private static Entry a(int i, Class cls) {
        return new SimpleImmutableEntry(String.valueOf(i - 1), cls.getName());
    }
}
