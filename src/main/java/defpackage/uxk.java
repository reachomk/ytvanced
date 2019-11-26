package defpackage;

import android.content.Context;
import android.text.Spanned;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;

/* renamed from: uxk */
public final class uxk implements akot {
    public final View a;
    public aanv b;
    public boolean c;
    private final acvx d;
    private final TextView e = ((TextView) this.a.findViewById(R.id.name));
    private final TextView f = ((TextView) this.a.findViewById(R.id.byline));
    private final akle g;

    public final View K_() {
        return this.a;
    }

    public final void a(akpb akpb) {
    }

    public final /* synthetic */ void a_(akor akor, Object obj) {
        aanv aanv = (aanv) obj;
        this.c = false;
        this.d.a(aanv.l(), null);
        this.e.setText(aanv.a());
        Spanned c = aanv.c();
        if (TextUtils.isEmpty(c)) {
            this.f.setVisibility(8);
        } else {
            this.f.setText(c);
            this.f.setVisibility(0);
        }
        this.g.a(aanv.b());
        this.e.setSelected(aanv.d());
        if (aanv.d()) {
            this.a.requestFocus();
        }
        this.b = aanv;
    }

    /* synthetic */ uxk(int i, Context context, akkl akkl, acvx acvx, uxy uxy) {
        this.d = (acvx) amqw.a((Object) acvx);
        amqw.a((Object) uxy);
        this.a = LayoutInflater.from(context).inflate(i, null);
        this.g = new akle(akkl, (ImageView) this.a.findViewById(R.id.thumbnail));
        this.a.setOnClickListener(new uxn(this, uxy));
        this.a.getViewTreeObserver().addOnGlobalLayoutListener(new uxm(this));
    }
}
