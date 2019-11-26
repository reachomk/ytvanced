package defpackage;

import android.content.Context;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.TextView;
import com.google.android.youtube.R;

/* renamed from: alnw */
public final class alnw implements akot {
    public final CompoundButton a = ((CompoundButton) this.c.findViewById(R.id.native_share_checkbox));
    public final aloa b;
    private final View c;
    private final TextView d = ((TextView) this.c.findViewById(R.id.title));
    private final TextView e = ((TextView) this.c.findViewById(R.id.native_share_checkbox_text));

    public alnw(Context context, aloa aloa) {
        this.c = View.inflate(context, R.layout.share_panel_title, null);
        this.b = (aloa) amqw.a((Object) aloa);
        if (VERSION.SDK_INT < 21) {
            int a = xwe.a(this.c.getContext(), R.attr.ytThemedBlue, 0);
            Mode mode = Mode.SRC_IN;
            Drawable drawable = this.a.getResources().getDrawable(R.drawable.ic_check_box_googblue);
            if (drawable != null) {
                drawable.setColorFilter(new PorterDuffColorFilter(a, mode));
                this.a.setButtonDrawable(drawable);
            }
        }
        alpf.a(this.c, true);
    }

    public final View K_() {
        return this.c;
    }

    public final void a(akpb akpb) {
        this.a.setOnCheckedChangeListener(null);
    }

    public final /* synthetic */ void a_(akor akor, Object obj) {
        arml arml;
        apfo apfo;
        aymc aymc = (aymc) obj;
        TextView textView = this.d;
        arml arml2 = null;
        if ((aymc.a & 1) != 0) {
            arml = aymc.b;
            if (arml == null) {
                arml = arml.f;
            }
        } else {
            arml = null;
        }
        textView.setText(ajqy.a(arml));
        apfm apfm = aymc.c;
        if (apfm == null) {
            apfm = apfm.d;
        }
        if ((apfm.a & 2) == 0) {
            apfo = null;
        } else {
            apfm = aymc.c;
            if (apfm == null) {
                apfm = apfm.d;
            }
            apfo = apfm.c;
            if (apfo == null) {
                apfo = apfo.i;
            }
        }
        if (apfo != null) {
            this.a.setChecked(apfo.c);
            this.a.setOnCheckedChangeListener(new alnz(this));
            TextView textView2 = this.e;
            if ((apfo.a & 1) != 0) {
                arml2 = apfo.b;
                if (arml2 == null) {
                    arml2 = arml.f;
                }
            }
            textView2.setText(ajqy.a(arml2));
            this.e.setOnClickListener(new alny(this));
            this.a.setVisibility(0);
            this.e.setVisibility(0);
            return;
        }
        this.a.setVisibility(8);
        this.e.setVisibility(8);
    }
}
