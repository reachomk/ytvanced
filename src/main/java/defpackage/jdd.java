package defpackage;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.EditText;
import com.google.android.apps.youtube.app.settings.developer.DebugOnlineAdActivity;

/* renamed from: jdd */
public final class jdd implements OnItemSelectedListener {
    public final /* synthetic */ DebugOnlineAdActivity a;
    private final EditText b;
    private final voj c;

    public jdd(DebugOnlineAdActivity debugOnlineAdActivity, EditText editText, voj voj) {
        this.a = debugOnlineAdActivity;
        this.b = editText;
        this.c = voj;
    }

    public final void onNothingSelected(AdapterView adapterView) {
    }

    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        voi voi = (voi) adapterView.getItemAtPosition(i);
        this.a.l.a(this.c.e, (String) amqw.a(voi.name()));
        this.b.setVisibility(8);
        switch (voi.ordinal()) {
            case 12:
            case 13:
            case 15:
                EditText editText = this.b;
                voj voj = this.c;
                editText.setVisibility(0);
                editText.setHint(voi.b);
                editText.setText(this.a.a(voi, voj));
                editText.setOnClickListener(new jdg(this, voi, voj, editText));
                break;
            case 14:
                this.a.l.a(this.c, false);
                return;
        }
        this.a.l.a(this.c, true);
    }
}
