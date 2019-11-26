package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;

/* renamed from: ldr */
public final class ldr implements leg {
    private final Context a;
    private final akkq b;
    private final aooz c;
    private View d;

    public ldr(Context context, akkq akkq, aooz aooz) {
        this.a = context;
        this.b = akkq;
        this.c = aooz;
    }

    public final void a(axqn axqn) {
    }

    public final void a(CharSequence charSequence) {
    }

    public final void a(lei lei) {
    }

    public final void a(lej lej) {
    }

    public final void a(lek lek) {
    }

    public final void a(boolean z) {
    }

    public final void b() {
    }

    public final void b(CharSequence charSequence) {
    }

    public final void b(boolean z) {
    }

    public final boolean c() {
        return true;
    }

    public final View a() {
        if (this.d == null) {
            aygk aygk;
            arml arml;
            arml arml2 = null;
            this.d = LayoutInflater.from(this.a).inflate(R.layout.ads_engagement_panel_title_header, null, false);
            ImageView imageView = (ImageView) this.d.findViewById(R.id.thumbnail);
            akkq akkq = this.b;
            aooz aooz = this.c;
            if ((aooz.a & 2) != 0) {
                aygk = aooz.c;
                if (aygk == null) {
                    aygk = aygk.f;
                }
            } else {
                aygk = null;
            }
            akkq.a(imageView, aygk);
            TextView textView = (TextView) this.d.findViewById(R.id.title);
            aooz aooz2 = this.c;
            if ((aooz2.a & 1) != 0) {
                arml = aooz2.b;
                if (arml == null) {
                    arml = arml.f;
                }
            } else {
                arml = null;
            }
            textView.setText(ajqy.a(arml));
            textView = (TextView) this.d.findViewById(R.id.subtitle);
            aooz2 = this.c;
            if ((aooz2.a & 4) != 0) {
                arml2 = aooz2.d;
                if (arml2 == null) {
                    arml2 = arml.f;
                }
            }
            textView.setText(ajqy.a(arml2));
        }
        return this.d;
    }
}
