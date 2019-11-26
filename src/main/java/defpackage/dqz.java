package defpackage;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.view.View.OnClickListener;
import java.util.Locale;

/* renamed from: dqz */
final /* synthetic */ class dqz implements OnClickListener {
    private final dqu a;

    dqz(dqu dqu) {
        this.a = dqu;
    }

    public final void onClick(View view) {
        dqu dqu = this.a;
        if (dqu.f.c() instanceof ust) {
            ust ust = (ust) dqu.f.c();
            if (ust.g()) {
                String str = "Email";
                dqu.g.a(dqu.a, Uri.parse("https://accounts.google.com/AccountChooser").buildUpon().appendQueryParameter("hl", Locale.getDefault().getLanguage()).appendQueryParameter("continue", String.format("https://myaccount.google.com/?pageId=%s&utm_source=YouTubeAndroid&utm_medium=act&hl=%s", new Object[]{ust.c(), Locale.getDefault().getLanguage()})).appendQueryParameter(str, ust.b()).build());
                return;
            }
            dqu.a.startActivityForResult(new Intent("com.google.android.gms.accountsettings.action.VIEW_SETTINGS").setPackage("com.google.android.gms").putExtra("extra.accountName", ust.b()), 0);
        }
    }
}
