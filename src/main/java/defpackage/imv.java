package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.support.v7.widget.RecyclerView;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import com.google.android.youtube.R;
import java.util.List;

/* renamed from: imv */
public class imv extends akpl {
    public final aaas a;
    private final View b;
    private final TextView c = ((TextView) this.b.findViewById(R.id.title));
    private final TextView d = ((TextView) this.b.findViewById(R.id.labels));
    private final TextView e = ((TextView) this.b.findViewById(R.id.subtitle));
    private final inb f;
    private final flu g;

    imv(Context context, aaas aaas, flu flu, inh inh, int i, apr apr, apr apr2, int i2) {
        this.a = aaas;
        this.b = LayoutInflater.from(context).inflate(i, null);
        RecyclerView recyclerView = (RecyclerView) this.b.findViewById(R.id.collage);
        recyclerView.setNestedScrollingEnabled(false);
        Resources resources = context.getResources();
        this.f = inh.a(apr, apr2, i2);
        apn anm = new anm(2);
        recyclerView.a(anm);
        recyclerView.a(this.f);
        inb inb = this.f;
        inb.getClass();
        anm.b = new ind(inb);
        inb inb2 = this.f;
        inb2.getClass();
        recyclerView.a(new ine(inb2, resources.getDimensionPixelSize(R.dimen.bundle_item_image_padding)));
        this.g = flu;
        this.g.a(this.b);
    }

    public void a(akpb akpb) {
    }

    public final View K_() {
        return this.g.b;
    }

    public final byte[] a(Object obj) {
        return imu.a(obj).h();
    }

    /* Access modifiers changed, original: protected */
    public void a(akor akor, Object obj) {
        imr a = imu.a(obj);
        xpr.a(this.c, ajqy.a(a.a()));
        xpr.a(this.e, ajqy.a(a.b()));
        TextView textView = this.d;
        List c = a.c();
        CharSequence spannableStringBuilder = new SpannableStringBuilder();
        int i = 1;
        if (c != null && c.size() > 0) {
            spannableStringBuilder.append(aabb.a((arml) c.get(0), this.a, false));
            for (int i2 = 1; i2 < c.size(); i2++) {
                spannableStringBuilder.append(" · ").append(aabb.a((arml) c.get(i2), this.a, false));
            }
        }
        xpr.a(textView, spannableStringBuilder);
        this.f.f = a.e();
        this.f.e = a.f();
        this.f.d = a.g();
        this.f.aa_();
        this.b.setOnClickListener(new imy(this, a));
        if (!a.i()) {
            i = 2;
        }
        flv.a(akor, i);
        this.g.a(akor);
    }
}
