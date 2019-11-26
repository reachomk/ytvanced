package defpackage;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import com.google.android.youtube.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Set;

/* renamed from: koy */
public final class koy {
    public final kpa a;
    public final List b;
    public final List c;
    public final View d;
    public final RecyclerView e;

    public koy(Context context, kpa kpa) {
        this.a = kpa;
        ueq b = ueq.b();
        Set<String> a = b.a();
        ArrayList arrayList = new ArrayList();
        for (String str : a) {
            arrayList.add(new koe(new Locale("", str).getDisplayCountry(), str, b.a(str)));
        }
        Collections.sort(arrayList);
        this.b = arrayList;
        this.c = new ArrayList();
        this.c.addAll(this.b);
        this.d = LayoutInflater.from(context).inflate(R.layout.formfill_region_picker, null, false);
        this.e = (RecyclerView) this.d.findViewById(R.id.recycler_view);
        this.e.a(new kpc(this));
        this.e.a(new ans());
        ((EditText) this.d.findViewById(R.id.edit_text)).addTextChangedListener(new kpb(this));
    }
}
