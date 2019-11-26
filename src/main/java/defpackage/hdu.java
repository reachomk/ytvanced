package defpackage;

import android.content.Context;
import android.content.res.Resources.Theme;
import android.os.Build.VERSION;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.TextView;
import com.google.android.youtube.R;

/* renamed from: hdu */
public final class hdu implements akot, hdr {
    private final akkq a;
    private final Context b;
    private final View c;
    private final TextView d = ((TextView) this.c.findViewById(R.id.autonav_label));
    private final Switch e = ((Switch) this.c.findViewById(R.id.autonav_switch));
    private final View f;
    private final TextView g;
    private final TextView h;
    private final View i;
    private final ImageView j;
    private hdp k;
    private OnCheckedChangeListener l;

    public hdu(Context context, akkq akkq) {
        this.b = context;
        this.a = akkq;
        this.c = LayoutInflater.from(context).inflate(R.layout.set_content_mdx_autonav_footer, null);
        if (VERSION.SDK_INT >= 23) {
            Theme theme = context.getTheme();
            this.e.setThumbTintList(context.getResources().getColorStateList(R.color.mdx_autonav_switch_thumb, theme));
            this.e.setTrackTintList(context.getResources().getColorStateList(R.color.mdx_autonav_switch_track, theme));
        }
        this.f = this.c.findViewById(R.id.autonav_video);
        this.f.setBackgroundResource(R.drawable.bg_mdx_autonav_row);
        String str = "id";
        this.g = (TextView) this.c.findViewById(context.getResources().getIdentifier("title", str, context.getPackageName()));
        this.h = (TextView) this.c.findViewById(R.id.duration);
        this.i = this.c.findViewById(R.id.thumbnail_layout);
        this.j = (ImageView) this.c.findViewById(context.getResources().getIdentifier("thumbnail", str, context.getPackageName()));
        this.c.findViewById(R.id.selected_position_indicator).setVisibility(4);
    }

    public final View K_() {
        return this.c;
    }

    public final void a(akpb akpb) {
        hdp hdp = this.k;
        if (hdp != null) {
            hdp.b = null;
            this.k = null;
        }
    }

    public final void a(int i) {
        this.f.setVisibility(i);
    }

    public final void b(int i) {
        this.c.setVisibility(i);
    }

    public final void a(boolean z) {
        CharSequence string;
        this.e.setOnCheckedChangeListener(null);
        this.e.setChecked(z);
        this.e.setOnCheckedChangeListener(this.l);
        TextView textView = this.d;
        if (this.e.isChecked()) {
            string = this.b.getString(R.string.mdx_autonav_label_on);
        } else {
            string = this.b.getString(R.string.mdx_autonav_label_off);
        }
        textView.setText(string);
    }

    public final void a(aakj aakj, hds hds) {
        this.g.setText(aakj.c());
        this.h.setText(xvd.b((long) aakj.h()));
        this.i.setBackgroundResource(R.drawable.bg_video_thumb);
        this.a.a(this.j, aakj.g(), akko.h);
        this.f.setOnClickListener(new hdt(hds));
    }

    public final /* synthetic */ void a_(akor akor, Object obj) {
        hdp hdp = (hdp) obj;
        this.k = hdp;
        hdp.b = this;
        hdp.a(hdp.g);
        hdp.b(hdp.f);
        hdp.c(hdp.e);
        hdp.a(hdp.c, hdp.d);
        this.l = hdp.a;
        this.e.setOnCheckedChangeListener(this.l);
    }
}
