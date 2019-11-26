package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;
import java.util.HashMap;
import java.util.Map;

/* renamed from: jsx */
final class jsx {
    public final ViewGroup a;
    public final TextView b;
    public final ImageView c;
    public final eph d;
    public final aaas e;
    public aphg f;
    public aohe g;
    private final vqx h;

    public final Map a(Object obj) {
        HashMap hashMap = new HashMap();
        hashMap.put("com.google.android.libraries.youtube.innertube.endpoint.tag", obj);
        hashMap.put("MacrosConverters.CustomConvertersKey", new aftl[]{this.h});
        return hashMap;
    }

    /* synthetic */ jsx(aaas aaas, vqx vqx, ViewGroup viewGroup, epj epj) {
        this.a = viewGroup;
        this.e = aaas;
        this.h = vqx;
        this.b = (TextView) viewGroup.findViewById(R.id.ad_cta_button_text);
        this.c = (ImageView) viewGroup.findViewById(R.id.ad_cta_button_icon);
        this.d = epj.a(null, (View) viewGroup);
        viewGroup.setVisibility(8);
    }
}
