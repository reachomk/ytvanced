package defpackage;

import android.content.Context;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;

/* renamed from: almk */
public class almk implements akot, allj {
    private final aloz a;
    private final allh b;
    private final View c;
    private final TextView d = ((TextView) this.c.findViewById(R.id.contact_display_name));
    private final float e;
    private final float f;
    private final acvx g;
    private String h;

    public almk(int i, ViewGroup viewGroup, Context context, akkq akkq, OnClickListener onClickListener, OnLongClickListener onLongClickListener, allh allh, acvx acvx) {
        this.c = LayoutInflater.from(context).inflate(i, viewGroup, false);
        this.a = new aloz(akkq, (ImageView) this.c.findViewById(R.id.contact_photo));
        this.b = (allh) amqw.a((Object) allh);
        this.g = (acvx) amqw.a((Object) acvx);
        this.c.setOnClickListener(onClickListener);
        this.c.setOnLongClickListener(onLongClickListener);
        this.e = this.c.getAlpha();
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(16842803, typedValue, true);
        this.f = typedValue.getFloat();
    }

    public final View K_() {
        return this.c;
    }

    public final void a_(akor akor, Object obj) {
        CharSequence a;
        this.h = alpt.a(obj);
        this.c.setTag(obj);
        this.c.setSelected(this.b.b(this.h));
        if (alpt.b(obj) != null) {
            this.a.a(alpt.b(obj));
            this.a.a(0);
        } else {
            this.a.a();
            this.a.a(4);
        }
        TextView textView = this.d;
        arml arml;
        if (obj instanceof aqju) {
            arml = ((aqju) obj).b;
            if (arml == null) {
                arml = arml.f;
            }
            a = ajqy.a(arml);
        } else if (obj instanceof aqkc) {
            aqkc aqkc = (aqkc) obj;
            if ((aqkc.a & 1) != 0) {
                arml = aqkc.b;
                if (arml == null) {
                    arml = arml.f;
                }
            } else {
                arml = null;
            }
            a = ajqy.a(arml);
        } else {
            a = null;
        }
        textView.setText(a);
        this.b.a((allj) this);
        this.g.a(alpt.d(obj), null);
    }

    public final void a(akpb akpb) {
        this.b.b((allj) this);
    }

    public final void a(allh allh) {
        this.c.setSelected(allh.b(this.h));
        this.c.setAlpha(allh.c() ? this.f : this.e);
    }
}
