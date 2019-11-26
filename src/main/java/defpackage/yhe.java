package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;

/* renamed from: yhe */
public final class yhe implements akot, zcx {
    public final zcy a;
    public akor b;
    private final ViewGroup c;
    private final TextView d = ((TextView) this.c.findViewById(R.id.related_video_replies_metadata));
    private final TextView e = ((TextView) this.c.findViewById(R.id.related_video_replies_view_count));
    private final TextView f = ((TextView) this.c.findViewById(R.id.video_duration));
    private final akle g;
    private ycv h;

    public yhe(Context context, akkl akkl, akmx akmx) {
        this.c = (ViewGroup) View.inflate(context, R.layout.related_video_replies_thumbnail, null);
        ImageView imageView = (ImageView) this.c.findViewById(R.id.related_video_replies_thumbnail);
        this.a = new zcy(akmx, this);
        this.c.setLayoutParams(new LayoutParams(context.getResources().getDimensionPixelOffset(R.dimen.related_video_replies_item_width), context.getResources().getDimensionPixelOffset(R.dimen.related_video_replies_item_height)));
        this.c.setOnClickListener(new yhd(this));
        this.g = new akle(akkl, new yhg(this, context), imageView, false);
    }

    public final void a(akpb akpb) {
    }

    public final View K_() {
        return this.c;
    }

    public final void a(CharSequence charSequence) {
        this.d.setText(charSequence);
    }

    public final void a(aygk aygk) {
        this.g.a(aygk);
    }

    public final void b(CharSequence charSequence) {
        xpr.a(this.e, charSequence);
    }

    public final void c(CharSequence charSequence) {
        xpr.a(this.f, charSequence);
    }

    public final ycv b() {
        akor akor = this.b;
        if (akor != null && this.h == null) {
            this.h = (ycv) akor.a("RELATED_VIDEO_ITEM_PRESENT_MODEL_KEY");
        }
        return this.h;
    }

    public final /* synthetic */ void a_(akor akor, Object obj) {
        arml arml;
        aygk aygk;
        awzr awzr = (awzr) obj;
        this.b = akor;
        ycv b = b();
        int a = akor.a("position", -1);
        if (!(a == -1 || b == null)) {
            b.a.add(Integer.valueOf(a));
        }
        zcy zcy = this.a;
        zcy.c = awzr;
        zcx zcx = zcy.b;
        arml arml2 = null;
        if ((awzr.a & 1) != 0) {
            arml = awzr.b;
            if (arml == null) {
                arml = arml.f;
            }
        } else {
            arml = null;
        }
        zcx.a(ajqy.a(arml));
        zcx = zcy.b;
        if ((awzr.a & 2) != 0) {
            aygk = awzr.c;
            if (aygk == null) {
                aygk = aygk.f;
            }
        } else {
            aygk = null;
        }
        zcx.a(aygk);
        zcx = zcy.b;
        if ((awzr.a & 16) != 0) {
            arml = awzr.f;
            if (arml == null) {
                arml = arml.f;
            }
        } else {
            arml = null;
        }
        zcx.b(ajqy.a(arml));
        zcx zcx2 = zcy.b;
        if ((awzr.a & 8) != 0) {
            arml2 = awzr.e;
            if (arml2 == null) {
                arml2 = arml.f;
            }
        }
        zcx2.c(ajqy.a(arml2));
    }
}
