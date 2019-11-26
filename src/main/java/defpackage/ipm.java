package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.GradientDrawable;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.google.android.youtube.R;

/* renamed from: ipm */
public final class ipm extends akpl implements xcp {
    private final Context a;
    private final afpu b;
    private final bcaa c;
    private final xta d;
    private final xci e;
    private final View f;
    private final ProgressBar g = ((ProgressBar) this.f.findViewById(R.id.storage_bar));
    private final TextView h = ((TextView) this.f.findViewById(R.id.storage_used));
    private final TextView i = ((TextView) this.f.findViewById(R.id.storage_free));

    public ipm(Context context, afpu afpu, bcaa bcaa, xta xta, xci xci) {
        this.a = context;
        this.b = afpu;
        this.c = bcaa;
        this.d = xta;
        this.e = xci;
        this.f = LayoutInflater.from(context).inflate(R.layout.storage_info_view, null);
        this.f.findViewById(R.id.legend_used).setBackground(a((int) R.attr.ytCallToAction));
        this.f.findViewById(R.id.legend_free).setBackground(a((int) R.attr.ytIconDisabled));
    }

    public final View K_() {
        return this.f;
    }

    public final void a(akpb akpb) {
        this.e.b(this);
    }

    private final void b() {
        agpv agpv = null;
        if (this.b.a()) {
            afzi j = ((agwc) this.c.get()).b().j();
            if (j != null) {
                agpv = j.d();
            }
        }
        long d = agpv != null ? agpv.d() : 0;
        long a = xta.a();
        this.g.setMax((int) xrz.a(d + a));
        d = xrz.a(d);
        a = xrz.a(a);
        this.g.setProgress((int) d);
        Resources resources = this.a.getResources();
        this.h.setText(Html.fromHtml(resources.getString(R.string.storage_used, new Object[]{xvd.d(resources, d)})));
        this.i.setText(Html.fromHtml(resources.getString(R.string.storage_free, new Object[]{xvd.d(resources, a)})));
    }

    private final GradientDrawable a(int i) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setColor(xwe.a(this.a, i));
        return gradientDrawable;
    }

    public final /* synthetic */ void a(akor akor, Object obj) {
        this.e.a((Object) this);
        b();
    }

    public final Class[] a(Class cls, Object obj, int i) {
        switch (i) {
            case -1:
                return new Class[]{agkx.class, agla.class, agkz.class, aglb.class, agld.class, aglg.class};
            case 0:
                b();
                return null;
            case 1:
                b();
                return null;
            case 2:
                b();
                return null;
            case 3:
                b();
                return null;
            case 4:
                b();
                return null;
            case 5:
                b();
                return null;
            default:
                StringBuilder stringBuilder = new StringBuilder(32);
                stringBuilder.append("unsupported op code: ");
                stringBuilder.append(i);
                throw new IllegalStateException(stringBuilder.toString());
        }
    }
}
