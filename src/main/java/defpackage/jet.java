package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Switch;
import android.widget.TextView;
import com.google.android.apps.youtube.app.wellness.WatchBreakFrequencyPickerPreference;
import com.google.android.youtube.R;

/* renamed from: jet */
public final class jet implements akot {
    public final Context a;
    public final mlb b;
    public final View c;
    public final TextView d = ((TextView) this.c.findViewById(R.id.summary));
    public final Switch e = ((Switch) this.c.findViewById(R.id.switch_button));
    private final akou f;
    private final TextView g = ((TextView) this.c.findViewById(R.id.title));
    private final bdfu h = new bdfu();

    jet(Context context, flu flu, mlb mlb, ViewGroup viewGroup) {
        this.a = context;
        this.f = flu;
        this.b = mlb;
        this.c = LayoutInflater.from(context).inflate(R.layout.setting_boolean_with_dialog_layout, viewGroup, false);
        flu.a(this.c);
        flu.a(new jew(this));
    }

    public final View K_() {
        return this.f.a();
    }

    public final void a(akpb akpb) {
        this.e.setOnCheckedChangeListener(null);
        this.c.setOnClickListener(null);
        this.h.a();
    }

    public final void b() {
        if (this.b.a()) {
            xpr.a(this.d, WatchBreakFrequencyPickerPreference.a(this.a.getResources(), this.b.b()));
        } else {
            xpr.a(this.d, this.a.getResources().getString(R.string.watch_break_setting_summary_off));
        }
    }

    public final void a(Switch switchR, boolean z) {
        switchR.setOnCheckedChangeListener(null);
        switchR.setChecked(z);
        switchR.setOnCheckedChangeListener(new jex(this));
    }

    public final /* synthetic */ void a_(akor akor, Object obj) {
        xpr.a(this.g, this.a.getResources().getString(R.string.bollard_setting_title));
        b();
        a(this.e, this.b.a());
        this.h.a(this.b.a.a(new jev(this)));
        this.h.a(this.b.b.a(new jey(this)));
        this.f.a(akor);
    }
}
