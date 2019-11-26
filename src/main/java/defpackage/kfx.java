package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.youtube.R;

/* renamed from: kfx */
public final class kfx extends akpl {
    private final Context a;
    private final aaas b;
    private final flu c;
    private final kbr d;
    private final FrameLayout e;
    private kfy f;
    private kfy g;
    private kfy h;

    public kfx(Context context, aaas aaas, flu flu, kbr kbr) {
        this.a = (Context) amqw.a((Object) context);
        this.b = (aaas) amqw.a((Object) aaas);
        this.c = (flu) amqw.a((Object) flu);
        this.d = (kbr) amqw.a((Object) kbr);
        this.e = new FrameLayout(context);
        this.c.a(this.e);
        this.e.setBackground(new eza(xwe.a(context, R.attr.ytSeparator), context.getResources().getDimensionPixelSize(R.dimen.line_separator_height)));
    }

    public final View K_() {
        return this.c.b;
    }

    private static byte[] a(avls avls) {
        return (byte[]) avls.e.d().clone();
    }

    public final void a(akpb akpb) {
        if (this.f != null) {
            this.f = null;
        }
        this.e.removeAllViews();
    }

    public static String a(arml arml) {
        if (arml != null) {
            armn armn = arml.e;
            if (armn == null) {
                armn = armn.c;
            }
            if ((armn.a & 1) != 0) {
                armn armn2 = arml.e;
                if (armn2 == null) {
                    armn2 = armn.c;
                }
                aodv aodv = armn2.b;
                if (aodv == null) {
                    aodv = aodv.c;
                }
                return aodv.b;
            }
        }
        return null;
    }

    /* Access modifiers changed, original: protected|final|synthetic */
    public final /* synthetic */ void a(akor akor, Object obj) {
        avls avls = (avls) obj;
        this.e.removeAllViews();
        String str = "setBackgroundColor";
        if (etj.a(akor)) {
            if (this.g == null) {
                this.g = new kfy(LayoutInflater.from(this.a).inflate(R.layout.video_dismissed_entry_tablet, null), this.b, akor.a, this.d);
            }
            this.f = this.g;
        } else {
            if (this.h == null) {
                this.h = new kfy(LayoutInflater.from(this.a).inflate(R.layout.video_dismissed_entry, null), this.b, akor.a, this.d);
            }
            akor.a(str, Integer.valueOf(xwe.a(this.a, R.attr.ytGeneralBackgroundA)));
            this.f = this.h;
        }
        int a = aqxa.a(avls.f);
        if (a != 0 && a == 2) {
            akor.a(str, Integer.valueOf(xwe.a(this.a, R.attr.ytBorderedButtonChipBackground)));
            TextView textView = (TextView) this.f.a.findViewById(R.id.dismissal_reasons_text);
            ((TextView) this.f.a.findViewById(R.id.undo_text)).setTextColor(xwe.a(this.a, R.attr.ytCallToAction));
            textView.setTextColor(xwe.a(this.a, R.attr.ytCallToAction));
        }
        this.f.a_(akor, avls);
        this.e.addView(this.f.a);
        FrameLayout frameLayout = this.e;
        frameLayout.getClass();
        frameLayout.post(new kfw(frameLayout));
        this.c.a(akor);
    }
}
