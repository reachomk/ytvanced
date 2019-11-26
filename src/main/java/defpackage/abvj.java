package defpackage;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;

/* renamed from: abvj */
public final class abvj implements akkr, akot, OnClickListener {
    private final Context a;
    private final aklt b;
    private final aaas c;
    private final View d;
    private final ImageView e = ((ImageView) this.d.findViewById(R.id.sticker_image));
    private final TextView f = ((TextView) this.d.findViewById(R.id.sticker_caption));
    private axyu g;

    public abvj(Context context, aklt aklt, aaas aaas) {
        this.a = context;
        this.b = aklt;
        this.c = aaas;
        this.d = View.inflate(context, R.layout.live_chat_sticker_item, null);
        this.d.setOnClickListener(this);
        aklt.a((akkr) this);
    }

    public final void a(ImageView imageView, akko akko, aygk aygk) {
    }

    public final void c(ImageView imageView, akko akko, aygk aygk) {
    }

    public final void d(ImageView imageView, akko akko, aygk aygk) {
    }

    public final View K_() {
        return this.d;
    }

    public final void a(akpb akpb) {
        this.f.setText(null);
        this.f.setTextColor(xwe.a(this.a, R.attr.ytTextPrimary));
        this.f.setContentDescription(null);
        ((GradientDrawable) this.f.getBackground()).setColor(0);
        this.b.a(this.e);
        this.g = null;
        this.e.setContentDescription(null);
    }

    public final void onClick(View view) {
        if (view == this.d) {
            axyu axyu = this.g;
            if (axyu != null && (axyu.a & 32) != 0) {
                aaas aaas = this.c;
                apxu apxu = axyu.f;
                if (apxu == null) {
                    apxu = apxu.d;
                }
                aaas.a(apxu, null);
            }
        }
    }

    public final void b(ImageView imageView, akko akko, aygk aygk) {
        if (aygk != null) {
            imageView.setBackgroundColor(0);
        }
    }

    public final /* synthetic */ void a_(akor akor, Object obj) {
        arml arml;
        axyu axyu = (axyu) obj;
        this.g = axyu;
        TextView textView = this.f;
        if ((axyu.a & 4) != 0) {
            arml = axyu.c;
            if (arml == null) {
                arml = arml.f;
            }
        } else {
            arml = null;
        }
        textView.setText(ajqy.a(arml));
        this.f.setTextColor(axyu.e);
        ((GradientDrawable) this.f.getBackground()).setColor(axyu.d);
        aygk aygk = axyu.b;
        if (aygk == null) {
            aygk = aygk.f;
        }
        this.e.setBackgroundColor(ra.c(this.a, R.color.yt_grey1));
        if (aklb.a(aygk)) {
            this.b.a(this.e, aygk);
        }
        aodx aodx = aygk.d;
        if (aodx == null) {
            aodx = aodx.c;
        }
        if ((aodx.a & 1) != 0) {
            ImageView imageView = this.e;
            aodx aodx2 = aygk.d;
            if (aodx2 == null) {
                aodx2 = aodx.c;
            }
            aodv aodv = aodx2.b;
            if (aodv == null) {
                aodv = aodv.c;
            }
            imageView.setContentDescription(aodv.b);
        }
    }
}
