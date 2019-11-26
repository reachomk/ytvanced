package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.SurfaceView;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.libraries.youtube.common.ui.TouchImageView;
import com.google.android.youtube.R;

/* renamed from: nge */
public final class nge extends aiuf implements OnClickListener, nfz {
    private final TextView b = ((TextView) findViewById(R.id.embed_title));
    private final TextView c = ((TextView) findViewById(R.id.embed_subtitle));
    private final ImageView d = ((ImageView) findViewById(R.id.embed_preview_thumbnail));
    private final FrameLayout e = ((FrameLayout) findViewById(R.id.embed_preview_moving_thumbnail_holder));
    private final muc f = new muc((TouchImageView) findViewById(R.id.embed_preview_play_button));
    private final TouchImageView j;
    private final ngg k;
    private final mvr l;

    public nge(Context context, ngg ngg, mvr mvr) {
        super(context);
        this.k = ngg;
        this.l = mvr;
        LayoutInflater.from(context).inflate(R.layout.embed_preview, this);
        muc muc = this.f;
        muc.a.setOnClickListener(new ngd(this, ngg));
        this.j = (TouchImageView) findViewById(R.id.embed_preview_share_button);
        this.j.setOnClickListener(this);
    }

    public final View aL_() {
        return this;
    }

    public final void b() {
        a(ngf.d);
        this.e.removeAllViews();
        b(false);
        l_(false);
        a(0);
    }

    public final void a(int i) {
        this.f.a(i);
    }

    public final void a(ngf ngf) {
        nge.a(this.b, ngf.a());
        nge.a(this.c, ngf.b());
        this.d.setImageBitmap(ngf.c());
    }

    private static void a(TextView textView, CharSequence charSequence) {
        textView.setText(charSequence);
        textView.setVisibility(!TextUtils.isEmpty(charSequence) ? 0 : 8);
    }

    public final void a(SurfaceView surfaceView) {
        if (surfaceView != null) {
            this.e.removeAllViews();
            this.e.addView(surfaceView);
            return;
        }
        this.e.removeAllViews();
    }

    public final void l_(boolean z) {
        this.j.setVisibility(!z ? 8 : 0);
    }

    public final void b(boolean z) {
        this.e.setVisibility(!z ? 8 : 0);
    }

    public final boolean onFilterTouchEventForSecurity(MotionEvent motionEvent) {
        mvr mvr = this.l;
        boolean z = true;
        if ((motionEvent.getFlags() & 1) == 0) {
            z = false;
        }
        mvr.a = z;
        return super.onFilterTouchEventForSecurity(motionEvent);
    }

    public final void onClick(View view) {
        if (view != null) {
            ngg ngg = this.k;
            if (ngg != null && view == this.j) {
                ngg.b(getContext());
            }
        }
    }
}
