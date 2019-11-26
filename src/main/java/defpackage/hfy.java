package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build.VERSION;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import com.google.android.youtube.R;

/* renamed from: hfy */
public final class hfy extends hdy {
    public ImageView b;
    public final Context c;
    public final acvx d;
    public final SharedPreferences e;
    private View f;
    private ImageView g;
    private View h;
    private View i;
    private ImageView j;
    private TextView k;
    private TextView l;
    private TextView m;
    private final adqf n;

    public hfy(Context context, xci xci, bcaa bcaa, bcaa bcaa2, bcaa bcaa3, aigw aigw, vvz vvz, ajam ajam, adqf adqf, zyw zyw, acwa acwa, SharedPreferences sharedPreferences) {
        super(context, xci, bcaa, bcaa2, bcaa3, aigw, vvz, ajam, adqf, zyw);
        this.c = context;
        this.d = acwa.t();
        this.e = sharedPreferences;
        this.n = adqf;
    }

    public final void a(ViewGroup viewGroup) {
        amqw.a((Object) viewGroup);
        this.b = (ImageView) amqw.a((ImageView) viewGroup.findViewById(R.id.mic));
        this.d.a(new acvs(acwc.MDX_SMART_REMOTE_BUTTON_MINIBAR_MIC));
        this.b.setOnClickListener(new hgb(this));
        d(b());
        this.f = (View) amqw.a(viewGroup.findViewById(R.id.thumbnail));
        this.g = (ImageView) amqw.a((ImageView) viewGroup.findViewById(R.id.content_thumbnail_image));
        this.h = (View) amqw.a(viewGroup.findViewById(R.id.ad_thumbnail));
        this.i = (View) amqw.a(viewGroup.findViewById(R.id.thumbnail_scrim));
        this.j = (ImageView) amqw.a((ImageView) viewGroup.findViewById(R.id.play_pause));
        this.k = (TextView) amqw.a((TextView) viewGroup.findViewById(R.id.ad_badge_small));
        this.l = (TextView) amqw.a((TextView) viewGroup.findViewById(R.id.ad_badge_extra_small));
        this.m = (TextView) amqw.a((TextView) viewGroup.findViewById(R.id.advertisement_assurance));
        super.a(viewGroup);
    }

    private final void d(boolean z) {
        xpr.a(this.b, z);
        if (z) {
            this.d.a(new acvs(acwc.MDX_SMART_REMOTE_BUTTON_MINIBAR_MIC), null);
            String str = "MDx.SmartRemote.isVoiceTipAlreadyShown";
            if (!this.e.getBoolean(str, false)) {
                YouTubeTextView youTubeTextView = new YouTubeTextView(this.c);
                youTubeTextView.setText(R.string.mdx_minibar_mic_button_tip);
                youTubeTextView.setTextColor(this.c.getResources().getColor(R.color.yt_white2));
                alcg alcg = new alcg(youTubeTextView, this.b, 1, 2);
                alcg.a(new hga(alcg));
                this.b.getViewTreeObserver().addOnGlobalLayoutListener(new hgc(this, alcg));
                this.e.edit().putBoolean(str, true).apply();
            }
        }
    }

    public final void a() {
        super.a();
        this.k = null;
        this.l = null;
        this.m = null;
    }

    /* Access modifiers changed, original: final */
    public final void a(boolean z) {
        xpr.a(this.k, z);
        d(b());
    }

    /* Access modifiers changed, original: final */
    public final void b(boolean z) {
        xpr.a(this.k, z ^ 1);
    }

    /* Access modifiers changed, original: final */
    public final void a(boolean z, boolean z2) {
        View view = this.k;
        boolean z3 = false;
        z2 = (z || z2) ? false : true;
        xpr.a(view, z2);
        xpr.a(this.l, z);
        xpr.a(this.m, z);
        if (b() && !z) {
            z3 = true;
        }
        d(z3);
    }

    private final boolean b() {
        adqe c = this.n.c();
        return c != null && c.h().bs_() != 2 && VERSION.SDK_INT >= 21 && ((aeca) this.a.get()).g.i() == 1;
    }

    /* Access modifiers changed, original: final */
    public final void c(boolean z) {
        int i = 0;
        if (z) {
            xpr.a(this.f, false);
            xpr.a(this.h, false);
            xpr.a(this.j, false);
        }
        xpr.a(this.g, z ^ 1);
        if (z) {
            i = 4;
        }
        this.i.setVisibility(i);
    }
}
