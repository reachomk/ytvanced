package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;

/* renamed from: hyu */
public final class hyu implements aimd, akot {
    public apxu a;
    private final akkq b;
    private final View c;
    private final ImageView d;
    private final TextView e;
    private final TextView f;
    private final TextView g;
    private final OnClickListener h;
    private aime i;
    private acvx j;
    private byte[] k;

    hyu(Context context, ViewGroup viewGroup, akkq akkq, aaas aaas, boolean z) {
        this.b = (akkq) amqw.a((Object) akkq);
        this.c = LayoutInflater.from(context).inflate(!z ? R.layout.app_related_end_screen_video_item : R.layout.app_related_end_screen_video_item_performance, viewGroup, false);
        this.d = (ImageView) this.c.findViewById(R.id.thumbnail);
        this.e = (TextView) this.c.findViewById(R.id.title);
        this.g = (TextView) this.c.findViewById(R.id.metadata);
        this.f = (TextView) this.c.findViewById(R.id.duration);
        this.h = new hyx(this, aaas);
    }

    public final void a(float f, boolean z) {
    }

    public final View K_() {
        return this.c;
    }

    public final void a(akpb akpb) {
        this.i.b(this);
    }

    public final void a(int i, int i2, int i3) {
        a(i2);
    }

    private final void a(int i) {
        if (i == 2) {
            this.c.setOnClickListener(this.h);
            abe.b(this.c, 0);
            byte[] bArr = this.k;
            if (bArr != null) {
                this.j.a(new acvs(bArr), null);
            }
            return;
        }
        this.c.setOnClickListener(null);
        this.c.setClickable(false);
        abe.b(this.c, 4);
    }

    public final /* synthetic */ void a_(akor akor, Object obj) {
        arml arml;
        CharSequence a;
        arej arej = (arej) obj;
        this.j = akor.a;
        this.k = arej.l.d();
        akkq akkq = this.b;
        ImageView imageView = this.d;
        aygk aygk = arej.c;
        if (aygk == null) {
            aygk = aygk.f;
        }
        akkq.a(imageView, aygk);
        TextView textView = this.e;
        arml arml2 = null;
        if ((arej.a & 8) != 0) {
            arml = arej.d;
            if (arml == null) {
                arml = arml.f;
            }
        } else {
            arml = null;
        }
        textView.setText(ajqy.a(arml));
        this.c.setContentDescription(this.e.getText());
        textView = this.g;
        int i = arej.a;
        if ((i & 32) == 0) {
            if ((i & 16) != 0) {
                arml = arej.e;
                if (arml == null) {
                    arml = arml.f;
                }
            } else {
                arml = null;
            }
            a = ajqy.a(arml);
        } else {
            arml = arej.f;
            if (arml == null) {
                arml = arml.f;
            }
            a = ajqy.a(arml);
        }
        textView.setText(a);
        textView = this.f;
        if ((arej.a & 512) != 0) {
            arml2 = arej.j;
            if (arml2 == null) {
                arml2 = arml.f;
            }
        }
        textView.setText(ajqy.a(arml2));
        this.f.setImportantForAccessibility(2);
        apxu apxu = arej.k;
        if (apxu == null) {
            apxu = apxu.d;
        }
        this.a = apxu;
        this.i = (aime) akor.a("visibility_change_listener");
        this.i.a(this);
        a(this.i.a);
    }
}
