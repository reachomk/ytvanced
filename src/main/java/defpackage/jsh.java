package defpackage;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;

/* renamed from: jsh */
public final class jsh {
    public aqhh a;
    private final akkq b;
    private final acvx c;
    private View d;
    private TextView e;
    private ImageView f;
    private final OnClickListener g;

    public jsh(akkq akkq, vod vod, aaas aaas, acvx acvx) {
        this.b = akkq;
        this.c = acvx;
        this.g = new jsg(this, vod, aaas);
    }

    public final void a(View view, aqhh aqhh) {
        if (view != null) {
            this.a = aqhh;
            this.d = view;
            this.e = (TextView) view.findViewById(R.id.button_text);
            this.f = (ImageView) view.findViewById(R.id.button_image);
            if (aqhh == null) {
                this.d.setVisibility(8);
            } else {
                TextView textView = this.e;
                arml arml = aqhh.b;
                if (arml == null) {
                    arml = arml.f;
                }
                xpr.a(textView, ajqy.a(arml));
                if ((aqhh.a & 2) == 0) {
                    this.f.setVisibility(8);
                } else {
                    akkq akkq = this.b;
                    ImageView imageView = this.f;
                    aygk aygk = aqhh.c;
                    if (aygk == null) {
                        aygk = aygk.f;
                    }
                    akkq.a(imageView, aygk);
                    this.f.setVisibility(0);
                }
                this.d.setVisibility(0);
                this.c.a(aqhh.e.d(), null);
            }
            this.d.setOnClickListener(this.g);
        }
    }

    public final void a() {
        View view = this.d;
        if (view != null) {
            view.setVisibility(8);
        }
        this.a = null;
    }
}
