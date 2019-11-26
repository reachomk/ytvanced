package defpackage;

import android.content.Context;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;
import java.util.List;

/* renamed from: kmk */
public final class kmk implements akot {
    private final akkq a;
    private final kmc b;
    private final View c;
    private final TextView d = ((TextView) this.f.findViewById(R.id.title));
    private final ImageView e = ((ImageView) this.f.findViewById(R.id.image));
    private final View f = this.c.findViewById(R.id.content_view);
    private final Context g;
    private final float h;

    public kmk(Context context, akkq akkq, kmc kmc, ViewGroup viewGroup) {
        this.a = (akkq) amqw.a((Object) akkq);
        this.b = (kmc) amqw.a((Object) kmc);
        this.g = context;
        this.c = LayoutInflater.from(context).inflate(R.layout.topic_picker_item, viewGroup, false);
        TypedValue typedValue = new TypedValue();
        context.getResources().getValue(R.dimen.topic_picker_item_selected_alpha, typedValue, true);
        this.h = typedValue.getFloat();
    }

    public final void a(akpb akpb) {
    }

    public final View K_() {
        return this.c;
    }

    public final void a(akbg akbg) {
        kmc kmc = this.b;
        String str = akbg.d;
        if (akbg.c) {
            kmc.g.add(str);
        } else {
            kmc.g.remove(str);
        }
        kmc.f();
        if (akbg.c && !(akbg.hasExtension(akbf.b) && ((Boolean) akbg.getExtension(akbf.b)).booleanValue())) {
            int intValue = akbg.hasExtension(akbf.e) ? ((Integer) akbg.getExtension(akbf.e)).intValue() : 0;
            int i = kmc.b;
            if (i == -1 || intValue < i) {
                if (kmc.h.containsKey(str)) {
                    kmc.a(str, (List) kmc.h.get(str));
                } else if (!(akbg.hasExtension(akbf.c) && ((Boolean) akbg.getExtension(akbf.c)).booleanValue())) {
                    kly kly = kmc.i;
                    if (kly != null) {
                        ayif[] ayifArr = akbg.f;
                        intValue = ayifArr.length;
                        if (intValue != 0) {
                            if (intValue > 1) {
                                xtl.c("Only one continuation expected. First will be processed, others will be ignored.");
                            }
                            ayif ayif = ayifArr[0];
                            if (ayif.a == 91229939) {
                                ajtf a = ajtj.a((avta) ayif.b);
                                if (a != null) {
                                    kly.b.a((aaps) kly.b.a(a), kly.d, new kmb(kly));
                                }
                            }
                            akbg.setExtension(akbf.c, Boolean.valueOf(true));
                        }
                    }
                }
            }
        }
        this.c.setSelected(akbg.c);
        this.e.setAlpha(akbg.c ? this.h : 1.0f);
    }

    public final /* synthetic */ void a_(akor akor, Object obj) {
        akbg akbg = (akbg) obj;
        int dimensionPixelSize = this.g.getResources().getDimensionPixelSize(R.dimen.topic_picker_item_top_bottom_padding);
        int dimensionPixelSize2 = this.g.getResources().getDimensionPixelSize(R.dimen.topic_picker_item_start_end_padding);
        this.f.setPadding(dimensionPixelSize2, dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize);
        this.c.setOnClickListener(new kmn(this, akbg, akor));
        a(akbg);
        this.d.setText(ajqy.a(akbg.a));
        this.a.a(this.e, akbg.b);
        akor.a.a(akbg.e, null);
        akbg.setExtension(akbf.a, Boolean.valueOf(true));
    }
}
