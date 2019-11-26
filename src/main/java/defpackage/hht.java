package defpackage;

import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.youtube.R;

/* renamed from: hht */
final class hht implements OnClickListener {
    private final /* synthetic */ hhk a;

    hht(hhk hhk) {
        this.a = hhk;
    }

    public final void onClick(View view) {
        avsi a = this.a.g.a();
        if (a == avsi.UNKNOWN_FORMAT_TYPE) {
            xpr.a(this.a.a, (int) R.string.offline_choose_quality, 1);
            return;
        }
        if (this.a.f.isChecked()) {
            this.a.b.a(a);
        }
        this.a.c.edit().putBoolean(ebn.OFFLINE_STREAM_SELECTION_DIALOG_REMEMBER_SETTING_CHECKED, this.a.f.isChecked()).apply();
        agqq agqq = agqq.OFFLINE_IMMEDIATELY;
        this.a.e.dismiss();
        this.a.h.a(a, agqq);
    }
}
