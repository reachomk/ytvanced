package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.TextView;
import com.google.android.youtube.R;
import java.util.Locale;

/* renamed from: gop */
public final class gop extends aiud implements aidn {
    public final aiub a;
    public final aidq b;
    public View c;
    private TextView d;
    private TextView e;

    public gop(Context context, aiub aiub, aidq aidq) {
        super(context);
        this.a = aiub;
        this.b = aidq;
    }

    public final void a(boolean z) {
        if (this.c == null) {
            View inflate = LayoutInflater.from(getContext()).inflate(R.layout.reel_player_csi_overlay, this);
            this.d = (TextView) findViewById(R.id.reels_playback);
            this.e = (TextView) findViewById(R.id.reels_response);
            this.c = inflate;
        }
        xpr.a(this.c, z);
        aiub aiub = this.a;
        if (aiub != null) {
            View a = aiub.a();
            gos gos = new gos(this);
            a = a.findViewById(R.id.nerd_stats_layout);
            if (a != null) {
                LayoutParams layoutParams = a.getLayoutParams();
                if (layoutParams instanceof MarginLayoutParams) {
                    MarginLayoutParams marginLayoutParams = (MarginLayoutParams) layoutParams;
                    int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.reel_nerd_stats_margin_top);
                    if (marginLayoutParams.topMargin != dimensionPixelSize) {
                        marginLayoutParams.setMargins(marginLayoutParams.leftMargin, dimensionPixelSize, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
                        a.setLayoutParams(marginLayoutParams);
                    }
                }
                a.addOnLayoutChangeListener(gos);
            }
        }
    }

    public final boolean c() {
        View view = this.c;
        return view != null && view.getVisibility() == 0;
    }

    public final void a(long j) {
        TextView textView = this.d;
        if (textView != null) {
            textView.setText(String.format(Locale.US, "%.2fs", new Object[]{Float.valueOf(((float) j) / 1000.0f)}));
        }
    }

    public final void b(long j) {
        TextView textView = this.e;
        if (textView != null) {
            textView.setText(String.format(Locale.US, "%.2fs", new Object[]{Float.valueOf(((float) j) / 1000.0f)}));
        }
    }

    public final LayoutParams b() {
        return new LayoutParams(-1, -1);
    }

    public final void d() {
        a(false);
        this.b.a();
    }

    public final void e() {
        this.b.e();
    }
}
