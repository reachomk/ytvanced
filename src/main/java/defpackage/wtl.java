package defpackage;

import android.accounts.Account;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.webkit.WebView;
import com.google.android.libraries.youtube.common.ui.LoadingFrameLayout;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.ShowWebViewDialogCommandOuterClass$ShowWebViewDialogCommand;

/* renamed from: wtl */
public final class wtl extends nd implements OnClickListener {
    public LoadingFrameLayout Z;
    public aaas aa;
    public afpo ab;
    public afpu ac;
    private ViewGroup ad;
    private ViewGroup ae;
    private WebView af;
    private ShowWebViewDialogCommandOuterClass$ShowWebViewDialogCommand ag;
    private wto ah;

    public final void b(Bundle bundle) {
        super.b(bundle);
        ((wtp) xse.b(p())).a(this);
        a(0, (int) R.style.f601WebviewDialog.FullScreen);
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        try {
            apxu apxu = (apxu) anxl.parseFrom(apxu.d, this.j.getByteArray("show_webview_dialog_command"), anxa.c());
            anxr access$000 = anxl.checkIsLite(ShowWebViewDialogCommandOuterClass$ShowWebViewDialogCommand.showWebViewDialogCommand);
            apxu.a(access$000);
            if (!apxu.h.a(access$000.d)) {
                return null;
            }
            Object obj;
            anxr access$0002 = anxl.checkIsLite(ShowWebViewDialogCommandOuterClass$ShowWebViewDialogCommand.showWebViewDialogCommand);
            apxu.a(access$0002);
            Object b = apxu.h.b(access$0002.d);
            if (b == null) {
                obj = access$0002.b;
            } else {
                obj = access$0002.a(b);
            }
            this.ag = (ShowWebViewDialogCommandOuterClass$ShowWebViewDialogCommand) obj;
            this.ad = (ViewGroup) layoutInflater.inflate(R.layout.webview_dialog_layout, viewGroup, false);
            this.ah = new wto(M_(), this.aa, this.ag);
            this.ae = (ViewGroup) this.ad.findViewById(R.id.dialog_header);
            this.ae.addView(this.ah.a);
            wto wto = this.ah;
            wto.b.setOnClickListener(new wtk(this));
            this.Z = (LoadingFrameLayout) this.ad.findViewById(R.id.web_view_loading_layout);
            this.Z.c();
            this.Z.a();
            this.af = (WebView) this.ad.findViewById(R.id.webview);
            wtj wtj = new wtj();
            wtj.a.add(new wtm(this));
            this.af.setWebViewClient(wtj);
            this.af.setScrollBarStyle(33554432);
            this.af.setScrollbarFadingEnabled(false);
            this.af.getSettings().setJavaScriptEnabled(true);
            ShowWebViewDialogCommandOuterClass$ShowWebViewDialogCommand showWebViewDialogCommandOuterClass$ShowWebViewDialogCommand = this.ag;
            String str = showWebViewDialogCommandOuterClass$ShowWebViewDialogCommand.b;
            if (showWebViewDialogCommandOuterClass$ShowWebViewDialogCommand.c) {
                try {
                    Account b2 = this.ab.b(this.ac.c());
                    nn p = p();
                    WebView webView = this.af;
                    webView.getClass();
                    bblt.a(new afpr(p, b2, str, new wtn(webView))).b(bbzi.c).c();
                } catch (Exception e) {
                    xtl.a("Failed to execute GoogleSsoAuthTokenTask.", e);
                    this.af.loadUrl(str);
                }
            } else {
                this.af.loadUrl(str);
            }
            return this.ad;
        } catch (anyg e2) {
            xtl.a("WebViewDialog", "Failed to deserialize show command.", e2);
            return null;
        }
    }

    public final void onClick(View view) {
        dismiss();
    }
}
