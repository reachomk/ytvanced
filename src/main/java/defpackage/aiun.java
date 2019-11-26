package defpackage;

import android.app.Activity;
import android.net.Uri;
import android.text.TextUtils;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.libraries.youtube.player.playability.AgeVerificationDialog;

/* renamed from: aiun */
public final class aiun extends WebViewClient {
    private boolean a = false;
    private final /* synthetic */ String b;
    private final /* synthetic */ AgeVerificationDialog c;

    public aiun(AgeVerificationDialog ageVerificationDialog, String str) {
        this.c = ageVerificationDialog;
        this.b = str;
    }

    public final void onPageFinished(WebView webView, String str) {
        if (!this.a) {
            String valueOf = String.valueOf(str);
            String str2 = "page finished:";
            if (valueOf.length() == 0) {
                valueOf = new String(str2);
            } else {
                str2.concat(valueOf);
            }
            Uri parse = Uri.parse(str);
            Uri parse2 = Uri.parse(this.b);
            if (TextUtils.equals(parse.getAuthority(), parse2.getAuthority()) && TextUtils.equals(parse.getHost(), parse2.getHost()) && TextUtils.equals(parse.getPath(), parse2.getPath())) {
                AgeVerificationDialog ageVerificationDialog = this.c;
                Activity activity = (Activity) ageVerificationDialog.a.get();
                if (activity == null || activity.isFinishing()) {
                    afpc.a(1, afpf.player, "AgeVerificationDialog was attempted to be shown although the activity was destroyed.");
                } else {
                    ageVerificationDialog.d.show();
                }
            }
        }
    }

    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        if (!"youtube://player/KavSuccess".equals(str)) {
            return super.shouldOverrideUrlLoading(webView, str);
        }
        AgeVerificationDialog ageVerificationDialog = this.c;
        ageVerificationDialog.a();
        ageVerificationDialog.c.a();
        return true;
    }

    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        String.valueOf(str).length();
        String.valueOf(str2).length();
        this.a = true;
        this.c.b();
    }
}
