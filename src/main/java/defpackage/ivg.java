package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import com.google.android.youtube.R;

/* renamed from: ivg */
public final class ivg implements akot {
    public final Resources a;
    public final xci b;
    public final TextView c = ((TextView) this.e.findViewById(R.id.subtitles));
    public final Spinner d = ((Spinner) this.e.findViewById(R.id.dropdown_spinner));
    private final View e;
    private final Context f;

    public ivg(Context context, xci xci, ViewGroup viewGroup) {
        this.f = context;
        this.e = LayoutInflater.from(context).inflate(R.layout.watch_card_dropdown, viewGroup, false);
        this.b = xci;
        this.a = context.getResources();
        View view = this.e;
        view.getViewTreeObserver().addOnGlobalLayoutListener(new ivl(this, view));
    }

    public final void a(akpb akpb) {
    }

    public final View K_() {
        return this.e;
    }

    public final /* synthetic */ void a_(akor akor, Object obj) {
        akby akby = (akby) obj;
        ArrayAdapter arrayAdapter = new ArrayAdapter(this.f, R.layout.uwc_spinner_title, ajqy.b(akby.b));
        arrayAdapter.setDropDownViewResource(R.layout.uwc_spinner_item);
        this.d.setAdapter(arrayAdapter);
        this.d.setOnTouchListener(new ivj(akby, akor));
        this.d.setOnItemSelectedListener(new ivi(this, akby));
        this.d.setSelection(akby.hasExtension(akbx.a) ? ((Integer) akby.getExtension(akbx.a)).intValue() : 0);
    }
}
