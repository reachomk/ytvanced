package defpackage;

import android.app.AlertDialog.Builder;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import com.google.android.youtube.R;

/* renamed from: jlr */
public final class jlr implements OnCheckedChangeListener {
    private final /* synthetic */ jlq a;

    public jlr(jlq jlq) {
        this.a = jlq;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        jlq jlq = this.a;
        boolean z2 = jlq.n;
        if (z2 && !z) {
            if (jlq.m == null) {
                jlq.m = new Builder(jlq.a).setMessage(R.string.collab_playlist_turn_off_confirm_message).setPositiveButton(R.string.ok, new jlt(jlq)).setNegativeButton(R.string.cancel, new jlu(jlq)).create();
            }
            jlq.m.show();
        } else if (!z2 && z) {
            jlq.a(true);
        }
    }
}
