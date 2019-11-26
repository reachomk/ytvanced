package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;

/* renamed from: aloh */
public final class aloh implements akot, OnClickListener {
    private final aloj a;
    private final View b;
    private final ImageView c = ((ImageView) this.b.findViewById(R.id.icon));
    private final TextView d = ((TextView) this.b.findViewById(R.id.title));
    private final akle e;
    private final float f;
    private final float g;
    private axif h;

    public aloh(Context context, aloj aloj, akkq akkq) {
        this.a = (aloj) amqw.a((Object) aloj);
        this.b = View.inflate(context, R.layout.share_target_service_update, null);
        this.e = new akle(akkq, this.c);
        this.f = this.b.getAlpha();
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(16842803, typedValue, true);
        this.g = typedValue.getFloat();
        this.b.setOnClickListener(this);
    }

    public final View K_() {
        return this.b;
    }

    public final void a(akpb akpb) {
        this.h = null;
        this.c.setImageDrawable(null);
        this.e.b();
        this.d.setText(null);
    }

    public final void onClick(View view) {
        if (this.a.d()) {
            this.a.a((axif) view.getTag());
        }
    }

    public final void a(axif axif, CharSequence charSequence, Drawable drawable) {
        if (amqq.a(this.h, axif)) {
            this.d.setText(charSequence);
            this.c.setImageDrawable(drawable);
            if (this.a.d()) {
                this.b.animate().alpha(this.f).start();
                return;
            }
            this.b.setAlpha(this.g);
        }
    }

    public final /* synthetic */ void a_(akor akor, Object obj) {
        axif axif = (axif) obj;
        this.h = axif;
        this.b.setTag(axif);
        this.b.setAlpha(0.0f);
        if (!this.a.a(axif, this)) {
            arml arml;
            this.b.setAlpha(!this.a.d() ? this.g : this.f);
            if ((axif.a & 8) != 0) {
                akle akle = this.e;
                aygk aygk = axif.d;
                if (aygk == null) {
                    aygk = aygk.f;
                }
                akle.a(aygk);
            }
            TextView textView = this.d;
            if ((axif.a & 4) != 0) {
                arml = axif.c;
                if (arml == null) {
                    arml = arml.f;
                }
            } else {
                arml = null;
            }
            textView.setText(ajqy.a(arml));
        }
        this.a.b(axif);
    }
}
