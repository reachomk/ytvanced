package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.SurfaceTexture;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.TextureView;
import android.view.TextureView.SurfaceTextureListener;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import com.google.android.libraries.youtube.edit.camera.CameraView;
import com.google.android.youtube.R;
import java.util.Locale;

/* renamed from: fyr */
public final class fyr implements akot, SurfaceTextureListener {
    public final Activity a;
    public final CameraView b;
    public final View c;
    public final TextureView d;
    public fyo e;
    private final Button f = ((Button) this.c.findViewById(R.id.camera_button));
    private final SharedPreferences g;
    private final WebView h;

    public fyr(Context context, SharedPreferences sharedPreferences, ViewGroup viewGroup) {
        this.a = xsg.b(context);
        this.c = LayoutInflater.from(context).inflate(R.layout.arcamera_layout, viewGroup, false);
        this.b = new CameraView(context, null);
        this.b.t = true;
        this.d = (TextureView) this.c.findViewById(R.id.camera_texture);
        this.d.setSurfaceTextureListener(this);
        this.h = (WebView) this.c.findViewById(R.id.web_ui_view);
        this.h.getSettings().setJavaScriptEnabled(true);
        this.h.setWebViewClient(new WebViewClient());
        this.h.setBackgroundColor(0);
        this.g = sharedPreferences;
        this.c.addOnLayoutChangeListener(new fyu(this));
    }

    public final void a(akpb akpb) {
    }

    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
    }

    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    public final View K_() {
        return this.c;
    }

    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        this.b.a(surfaceTexture, this.d.getId());
    }

    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        this.b.m();
        return true;
    }

    public final /* synthetic */ void a_(akor akor, Object obj) {
        fyq fyq = (fyq) obj;
        this.e = (fyo) akor.a("sectionController");
        this.b.c(1);
        WebView webView = this.h;
        aoxf aoxf = fyq.a;
        Uri parse = Uri.parse(aoxf.c);
        String str = aoxf.d;
        int a = fmv.a(this.g);
        xvo a2 = xvo.a(parse);
        a2.b("configUrl", str);
        a2.b("darkMode", a != 2 ? "false" : "true");
        a2.b("locale", Locale.getDefault().getLanguage());
        webView.loadUrl(a2.a().toString());
        this.f.setOnClickListener(new fyt(this));
    }
}
