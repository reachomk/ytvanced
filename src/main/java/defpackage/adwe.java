package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.widget.Toast;
import com.google.android.libraries.youtube.mdx.smartpairing.PairWithTvActivity;
import com.google.android.youtube.R;

/* renamed from: adwe */
final class adwe implements adwd {
    private final /* synthetic */ adwc a;

    adwe(adwc adwc) {
        this.a = adwc;
    }

    public final void a() {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse("https://support.google.com/youtube/answer/3230451"));
        try {
            this.a.p().startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            Toast.makeText(this.a.p(), R.string.mdx_use_tv_code_help_page_error, 1).show();
        }
    }

    public final void b() {
        adbt.a(this.a.p(), PairWithTvActivity.class, 0);
    }
}
