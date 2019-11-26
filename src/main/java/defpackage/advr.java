package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.widget.Toast;
import com.google.android.libraries.youtube.mdx.smartpairing.PairWithTvActivity;
import com.google.android.libraries.youtube.mdx.smartremote.MdxSmartRemoteActivity;
import com.google.android.youtube.R;

/* renamed from: advr */
final class advr implements advm {
    private final /* synthetic */ advo a;

    advr(advo advo) {
        this.a = advo;
    }

    public final void a() {
        this.a.p().startActivity(new Intent("android.settings.WIFI_SETTINGS"));
    }

    public final void b() {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse("https://support.google.com/youtube/answer/3230451"));
        try {
            this.a.p().startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            Toast.makeText(this.a.M_(), R.string.mdx_pref_pair_with_tv_no_browser_to_show_help_page, 1).show();
        }
    }

    public final void d() {
        adbt.a(this.a.p(), PairWithTvActivity.class, 1);
    }

    public final void e() {
        this.a.p().startActivity(new Intent(this.a.p(), MdxSmartRemoteActivity.class));
    }

    public final void c() {
        adbt.a(this.a.p(), PairWithTvActivity.class, 2);
    }
}
