package defpackage;

import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.apps.youtube.app.wellness.WatchBreakFrequencyPickerPreference;
import com.google.android.youtube.R;

/* renamed from: jew */
final /* synthetic */ class jew implements OnClickListener {
    private final jet a;

    jew(jet jet) {
        this.a = jet;
    }

    public final void onClick(View view) {
        jet jet = this.a;
        Builder builder = new Builder(jet.a);
        mkw mkw = new mkw(jet.a);
        mkw.a(WatchBreakFrequencyPickerPreference.a, WatchBreakFrequencyPickerPreference.b);
        int b = jet.b.b();
        mkw.a(b / 60);
        mkw.b(b % 60);
        builder.setView(mkw);
        builder.setTitle(R.string.bollard_setting_dialog_title);
        builder.setNegativeButton(R.string.cancel, jfa.a);
        builder.setPositiveButton(R.string.done, new jez(jet, mkw));
        AlertDialog create = builder.create();
        if (create != null) {
            create.show();
        }
    }
}
