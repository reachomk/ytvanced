package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import com.google.android.youtube.R;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: eps */
public final class eps extends akpl {
    public final fnb a;
    public final TextView b;
    private final Map c;

    public eps(Context context, fna fna) {
        this(context, fna, null, null);
    }

    public eps(Context context, fna fna, akyw akyw, Map map) {
        this(context, fna, akyw, map, R.layout.button);
    }

    public eps(Context context, fna fna, akyw akyw, Map map, int i) {
        this.b = (TextView) LayoutInflater.from(context).inflate(i, null, false);
        this.a = fna.a(this.b);
        this.a.a((int) R.dimen.text_button_icon_padding);
        if (akyw != null) {
            this.a.c = akyw;
        }
        this.c = map;
    }

    public final View K_() {
        return this.b;
    }

    public final void a(akpb akpb) {
        this.a.a(null, null, null);
    }

    /* Access modifiers changed, original: protected|final|synthetic */
    public final /* synthetic */ void a(akor akor, Object obj) {
        aphg aphg = (aphg) obj;
        HashMap hashMap = new HashMap();
        Map map = this.c;
        if (map == null) {
            map = Collections.EMPTY_MAP;
        }
        hashMap.putAll(map);
        hashMap.putAll(akor.b());
        this.a.a(aphg, akor.a, hashMap);
    }
}
