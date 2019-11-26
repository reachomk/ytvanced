package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.Toast;
import com.google.android.libraries.youtube.edit.camera.CameraView;
import com.google.android.youtube.R;
import java.util.Locale;

/* renamed from: gfo */
public final class gfo extends nf implements OnClickListener {
    private View Z;
    public gfr a;
    private View aa;
    private View ab;
    private boolean ac = false;
    private CameraView b;
    private ImageView c;

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ((gft) xtx.a(gft.class, this.y, p())).k().a();
        ViewGroup viewGroup2 = (ViewGroup) layoutInflater.cloneInContext(new ContextThemeWrapper(p(), R.style.f312ReelTheme.NoActionBar.FullScreen.Dark)).inflate(R.layout.reel_welcome_fragment, viewGroup, false);
        this.ac = alai.a(p(), 1);
        this.c = (ImageView) viewGroup2.findViewById(R.id.reel_welcome_image);
        if (this.ac) {
            this.b = new CameraView(M_(), null);
            this.b.setId(R.id.reel_welcome_camera_view);
            CameraView cameraView = this.b;
            cameraView.t = true;
            cameraView.a(5);
            this.b.b(zha.a(p()));
            this.b.setLayoutParams(new LayoutParams(-1, -1));
            viewGroup2.addView(this.b, 0);
        } else {
            this.c.setVisibility(0);
        }
        this.Z = viewGroup2.findViewById(R.id.reel_welcome_learn_more);
        this.Z.setOnClickListener(this);
        this.aa = viewGroup2.findViewById(R.id.reel_welcome_close);
        this.aa.setOnClickListener(this);
        this.ab = viewGroup2.findViewById(R.id.reel_welcome_continue);
        this.ab.setOnClickListener(this);
        return viewGroup2;
    }

    public final void ad_() {
        if (this.ac) {
            this.b.m();
        }
        super.ad_();
    }

    public final void B() {
        super.B();
        if (this.ac) {
            this.b.n();
        }
    }

    public final void onClick(View view) {
        amqw.a(this.a);
        if (view == this.aa) {
            this.a.X();
        } else if (view == this.ab) {
            this.a.Y();
        } else if (view == this.Z) {
            try {
                M_().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(String.format("%s?hl=%s", new Object[]{"https://support.google.com/youtube/answer/7568166", Locale.getDefault().getLanguage()}))));
            } catch (ActivityNotFoundException unused) {
                Toast.makeText(p(), q().getString(R.string.common_error_generic), 1).show();
            }
        }
    }
}
