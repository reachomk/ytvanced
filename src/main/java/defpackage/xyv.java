package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;

/* renamed from: xyv */
public final class xyv implements yaa {
    public final acvx a;
    public final aaas b;
    public final akvp c;
    public final View d;
    public final TextView e;
    public final ImageView f;
    public final xyo g;
    public xyl h;
    public byte[] i;
    public apxu j;
    private final xza k;

    public xyv(acvx acvx, aaas aaas, alpa alpa, View view, xyo xyo, xza xza) {
        this.a = (acvx) amqw.a((Object) acvx);
        this.b = (aaas) amqw.a((Object) aaas);
        this.c = (akvp) amqw.a((Object) alpa);
        this.g = (xyo) amqw.a((Object) xyo);
        this.k = (xza) amqw.a((Object) xza);
        this.d = view;
        this.e = (TextView) amqw.a((TextView) view.findViewById(R.id.button));
        this.f = (ImageView) view.findViewById(R.id.close);
        this.e.setOnClickListener(new xyy(this));
        this.f.setOnClickListener(new xyx(this));
    }

    public final void a(String str) {
        this.d.setVisibility(8);
        this.k.a(str);
    }
}
