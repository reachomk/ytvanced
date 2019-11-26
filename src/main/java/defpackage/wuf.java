package defpackage;

import android.content.Context;
import android.graphics.PorterDuff.Mode;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import com.google.android.youtube.R;

/* renamed from: wuf */
public final class wuf implements akot {
    public final View a;
    private final akkq b;
    private final YouTubeTextView c;
    private final YouTubeTextView d;
    private final YouTubeTextView e;
    private final ImageView f;
    private final ImageView g;

    public wuf(Context context, akkq akkq) {
        this(context, akkq, R.layout.sponsorships_header_layout);
    }

    public final void a(akpb akpb) {
    }

    protected wuf(Context context, akkq akkq, int i) {
        this.b = akkq;
        this.a = LayoutInflater.from(context).inflate(i, null, false);
        this.c = (YouTubeTextView) this.a.findViewById(R.id.super_title_view);
        this.d = (YouTubeTextView) this.a.findViewById(R.id.title_view);
        this.e = (YouTubeTextView) this.a.findViewById(R.id.sub_title_view);
        this.f = (ImageView) this.a.findViewById(R.id.background_image);
        this.g = (ImageView) this.a.findViewById(R.id.channel_image);
    }

    public final View K_() {
        return this.a;
    }

    public final void a(axsp axsp) {
        arml arml;
        aygk aygk;
        TextView textView = this.c;
        aygk aygk2 = null;
        if ((axsp.a & 128) != 0) {
            arml = axsp.h;
            if (arml == null) {
                arml = arml.f;
            }
        } else {
            arml = null;
        }
        xpr.a(textView, ajqy.a(arml));
        textView = this.d;
        if ((axsp.a & 32) != 0) {
            arml = axsp.f;
            if (arml == null) {
                arml = arml.f;
            }
        } else {
            arml = null;
        }
        xpr.a(textView, ajqy.a(arml));
        textView = this.e;
        if ((axsp.a & 64) != 0) {
            arml = axsp.g;
            if (arml == null) {
                arml = arml.f;
            }
        } else {
            arml = null;
        }
        xpr.a(textView, ajqy.a(arml));
        akkq akkq = this.b;
        ImageView imageView = this.f;
        if ((axsp.a & 2) != 0) {
            aygk = axsp.c;
            if (aygk == null) {
                aygk = aygk.f;
            }
        } else {
            aygk = null;
        }
        akkq.a(imageView, aygk);
        this.f.setColorFilter(axsp.b & -1711276033, Mode.LIGHTEN);
        akkq = this.b;
        imageView = this.g;
        if ((axsp.a & 4) != 0) {
            aygk2 = axsp.d;
            if (aygk2 == null) {
                aygk2 = aygk.f;
            }
        }
        akkq.a(imageView, aygk2);
        this.a.setBackgroundColor(axsp.b);
    }

    public final /* synthetic */ void a_(akor akor, Object obj) {
        a((axsp) obj);
    }
}
