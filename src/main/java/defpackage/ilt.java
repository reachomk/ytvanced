package defpackage;

import android.content.Context;
import android.text.Spanned;
import android.text.TextUtils;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import com.google.android.youtube.R;

/* renamed from: ilt */
public final class ilt extends akpl {
    private final View a = LayoutInflater.from(this.b).inflate(R.layout.playlist_panel_segment_header, null);
    private final Context b;
    private final TextView c = ((TextView) this.a.findViewById(R.id.position));
    private final TextView d = ((TextView) this.a.findViewById(R.id.title));
    private final TextView e = ((TextView) this.a.findViewById(R.id.annotation));
    private final float f = this.c.getTextSize();
    private final float g = this.d.getTextSize();
    private final float h = this.e.getTextSize();

    public ilt(Context context) {
        this.b = new ContextThemeWrapper(context, R.style.f593Themed.YouTube.Dark.AppCompat);
    }

    private final void a(akor akor, TextView textView, arml arml) {
        Spanned a = ajqy.a(arml);
        if (!TextUtils.isEmpty(a)) {
            if (akor != null && akor.a("nested_fragment_key", false)) {
                textView.setTextSize(0, this.b.getResources().getDimension(R.dimen.small_font_size));
            }
            textView.setText(a);
            textView.setVisibility(0);
        }
    }

    public final View K_() {
        return this.a;
    }

    public final void a(akpb akpb) {
        this.c.setTextSize(0, this.f);
        this.d.setTextSize(0, this.g);
        this.e.setTextSize(0, this.h);
    }

    /* Access modifiers changed, original: protected|final|bridge|synthetic */
    public final /* bridge */ /* synthetic */ void a(akor akor, Object obj) {
        TextView textView;
        arml arml;
        awjh awjh = (awjh) obj;
        if ((awjh.a & 2) != 0) {
            textView = this.c;
            arml = awjh.c;
            if (arml == null) {
                arml = arml.f;
            }
            a(akor, textView, arml);
        }
        if ((awjh.a & 1) != 0) {
            textView = this.d;
            arml = awjh.b;
            if (arml == null) {
                arml = arml.f;
            }
            a(akor, textView, arml);
        }
        if ((awjh.a & 4) != 0) {
            textView = this.e;
            arml arml2 = awjh.d;
            if (arml2 == null) {
                arml2 = arml.f;
            }
            a(akor, textView, arml2);
        }
    }
}
